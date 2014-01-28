package org.ollabaca.on.generator

import java.util.ArrayList
import java.util.Collection
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.ResourceSet
import org.ollabaca.on.QualifiedNameProvider
import org.ollabaca.on.model.Array
import org.ollabaca.on.model.BooleanValue
import org.ollabaca.on.model.Container
import org.ollabaca.on.model.EnumValue
import org.ollabaca.on.model.Instance
import org.ollabaca.on.model.InstanceRef
import org.ollabaca.on.model.Literal
import org.ollabaca.on.model.NullValue
import org.ollabaca.on.model.NumberValue
import org.ollabaca.on.model.Slot
import org.ollabaca.on.model.StringValue
import org.ollabaca.on.model.Unit
import org.ollabaca.on.model.Value
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.SiteFactory
import org.ollabaca.on.site.Topic
import org.ollabaca.on.util.Units
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.common.util.BasicDiagnostic
import org.eclipse.emf.common.util.DiagnosticChain
import org.eclipse.emf.common.util.Diagnostic

class ProjectToXmi {
	
	QualifiedNameProvider qualifiedNameProvider = new QualifiedNameProvider
	
	Units units = new Units()
	
	Map<Instance, EObject> instances = newHashMap
	
	Map<Instance, Topic> topics = newHashMap
	
	Map<QualifiedName, Topic> names = newHashMap
	
	Set<Unit> all = new HashSet
	
	ResourceSet set
	
	/**
	 * Project name
	 */
	String project
	
	new(ResourceSet set, String project) {
		this.set = set
		this.project = project
	}
	
	def Collection<EObject> build() {
		
		// collect all units
		for(e: set.allContents.toIterable.filter(typeof(Instance))) {
			if (units.getUnit(e) != null) {
				all.add(units.getUnit(e))
			} else {
				System::out.println("unit null for " + e)
			}
		}
		for(e: set.allContents.toIterable.filter(typeof(InstanceRef))) {
			if (units.getUnit(e.value) != null) {
				all.add(units.getUnit(e.value))
			} else {
				System::out.println("unit null for " + e)
			}				
		}
		for(e: set.allContents.toIterable.filter(typeof(Container))) {
			if (units.getUnit(e.instance) != null) {
				all.add(units.getUnit(e.instance))
			} else {
				System::out.println("unit null for " + e)
			}				
		}
		
		// create instances
		for (u : all) {
			for(e: u.eAllContents.toIterable.filter(typeof(Instance))) {
				this.instances.put(e, units.getClassifier(e).EPackage.EFactoryInstance.create(units.getClassifier(e)))								
			}
		}
		
		//System::out.println(instances)
		
		// set features
		for (e: instances.keySet) {
			e.setFeatures								
		}
		
		// 
		val Collection<EObject> result = new ArrayList;
		for (u : all) {
			if (u.container == null) {
				for (i: u.instances) {
					result += instances.get(i)
				}
			} else {
				// change the econtainer
				var EObject container = this.instances.get(u.container.instance)
				if (container == null) {
					//System::err.println("container is null")
				} else {
					val EStructuralFeature feature = container.eClass.getEStructuralFeature(u.container.feature)
					if (feature == null) {
						//System::err.println("feature is null")						
					} else {
						var Collection<EObject> collection = container.eGet(feature) as Collection<EObject>
						for (i: u.instances) {
							collection.add(instances.get(i))
						}
					}		
				}
			}
		}
		
		// create site
		var Site site = SiteFactory::eINSTANCE.createSite
		result += site
		site.name = project
		
		for (e: instances.keySet) {
			val topic = SiteFactory::eINSTANCE.createTopic
			site.topics += topic
		
			val name = qualifiedNameProvider.getFullyQualifiedName(e)
			if (name != null) {
				topic.name = name.toString
				names.put(name, topic)	
			}
			topic.documentation = e.documentation.normalize
			if (e.title != null) {
				topic.title = e.title.normalize
			} else {
				topic.title = e.name
			}
			
			topic.setAbstract(e.getAbstract().normalize)
			topic.target = instances.get(e)
			
			topics.put(e, topic)
			//result += topic
		}
		
		// create see links
		for (e: topics.keySet) {
			val topic = topics.get(e)
			
			for (see: e.see) {
				val t = topics.get(see)
				if (t != null) {
					topic.see += t
				}
			}
		}
		
		// create abbr, tags & types
		for (e: topics.keySet) {
			val topic = topics.get(e)
			
			for (t: e.tags) {
				site.getOrCreateTag(t).topics.add(topic)
			}
			
			if (e.abbr != null) {
				site.getOrCreateAbbr(e.abbr).topics.add(topic)
			}
			
			site.getOrCreateType(topic.target.eClass.instanceClassName).topics.add(topic)
		}
		
		// create parent-child links
		for (e: names.keySet) {
			val topic = names.get(e)
			val parent = names.get(e.skipLast(1))
			if (parent != null) {
				parent.topics.add(topic)
				//topic.parent = topics.get(parent)
			}
		}
		
		return result
	}
	
	def Map<Instance, Diagnostic> validate() {
		
		val Map<Instance, Diagnostic> diagnostics = newHashMap()
		for (e: instances.entrySet) {
			val chain = new BasicDiagnostic
			diagnostics.put(e.key, chain)
			try {
				Diagnostician::INSTANCE.validate(e.value, chain)
			} catch (RuntimeException ex) {
				chain.add(BasicDiagnostic::toDiagnostic(ex))
			}
		}
		return diagnostics
	}
	
	def void setFeatures(Instance object) {
		val EClass eClass = units.getClassifier(object)
		val EObject output = instances.get(object)
		
		for (Slot slot: object.slots) {
			val EStructuralFeature feature = units.getFeature(slot)
			val Object value = slot.value.compute
			System::out.println(object + ":" + slot.name + ":" + value)
			try {
				if (feature.many) {
					if (value instanceof Collection) {
						(output.eGet(feature) as Collection).addAll(value as Collection)
					} else {
						(output.eGet(feature) as Collection).add(value)
					}
				} else {
					output.eSet(feature, value)	
				}
			} catch (RuntimeException e) {
				System::out.println("ERROR: " + object + ":" + slot.name + ":" + value + e)
				throw e
			}
		}
		
		if (object.name != null) {
			val EStructuralFeature name = eClass.getEStructuralFeature("name")
			if (name != null && output.eGet(name) == null) {
				output.eSet(name, object.name)
			}
		}
		
	}
	
	def dispatch Object compute(Instance object) {
		return instances.get(object)
	}
	
	def dispatch Object compute(InstanceRef object) {
		val EObject ref = instances.get(object.value)
		if (ref == null) {
			System::err.println("No instance for ref: " + object.value)
		}
		return instances.get(object.value)
	}
	
	def dispatch Object compute(Literal object) {
		val Slot slot = units.getSlot(object)
		val EDataType type = (units.getFeature(slot) as EAttribute).EAttributeType
		return type.EPackage.EFactoryInstance.createFromString(type, String::valueOf(object.value))
	}
	
	
	def Object value(Literal object) {
		switch object {
			BooleanValue: object.value
			StringValue: object.value
			NullValue: null
			NumberValue: object.value
			EnumValue: object.value			
		}
		
	}

	
	def dispatch Object compute(Array object) {
		val Collection result = new ArrayList
		for (Value v: object.value) {
			result += v.compute
		}
		return result
	}
	
	def String normalize(String s) {
		if (s == null) {
			return ""
		}
		val String[] lines = s.split("\\r?\\n");
		if (lines.size <= 1) {
			return s
		}
		val StringBuilder builder = new StringBuilder
		val last = lines.get(lines.size - 1)
		val emptylast = last.matches("\\s*")
		
		var join = false // the current line must be strimmed and joined with the previous 
		
		for (String line: lines) {
			var i = line
			
			val newline = !i.endsWith("\\");
			 
			if (emptylast && i.startsWith(last)) {
				i = i.substring(last.length())
			}
			if (join) {
				i = i.replaceAll("^\\s+", "") // left trim
				if (builder.length != 0 && !Character::isWhitespace(builder.charAt(builder.length - 1))) {
					i = " " + i
				}
			}
			if (newline) {
				builder.append(i).append('\n')
			} else {
				// remove \
				builder.append(i.toCharArray, 0, i.length() - 1)				
			}
			join = !newline
		}
		return builder.toString.trim
	}
	
}
	
