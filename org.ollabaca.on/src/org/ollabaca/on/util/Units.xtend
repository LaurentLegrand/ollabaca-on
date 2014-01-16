package org.ollabaca.on.util

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EPackage$Registry
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.ollabaca.on.model.Unit
import org.ollabaca.on.model.Instance
import org.ollabaca.on.model.Slot
import org.ollabaca.on.model.Import
import org.ollabaca.on.model.StringValue
import org.ollabaca.on.model.BooleanValue
import org.ollabaca.on.model.InstanceRef
import org.ollabaca.on.model.Array
import org.ollabaca.on.model.Value

class Units {
	
	def Unit getUnit(EObject object) {
		var EObject container = object.eContainer()
		
		while (container != null) {
			if (container instanceof Unit) {
				return container as Unit
			}
			container = container.eContainer()
		}
		return null;
	}
	
	def Instance getInstance(EObject object) {
		var EObject container = object.eContainer()
		
		while (container != null) {
			if (container instanceof Instance) {
				return container as Instance
			}
			container = container.eContainer()
		}
		return null;
	}
	
	def Slot getSlot(EObject object) {
		var EObject container = object.eContainer()
		
		while (container != null) {
			if (container instanceof Slot) {
				return container as Slot
			}
			container = container.eContainer()
		}
		return null;
	}
	
	def EPackage[] getPackages(Unit object) {
		var List<EPackage> list = new ArrayList()
		for (Import i: object.imports) {
			var EPackage p = Registry::INSTANCE.getEPackage(i.name)
			if (p != null) {
				list += p
			}
		}
		
		return list
	}
	
	def Instance[] getAncestorsAndSelf(Instance object) {
		var List<Instance> list = newArrayList()
		var Instance e = object;
		
		do {
			list.add(0, e)
			e = e.parent
		} while (e != null)
		
		return list
	}
	
	def Instance getParent(Instance object) {
		var EObject e = object.eContainer;
		while (e != null) {
			if (e instanceof Instance) {
				return e as Instance
			}
			e = e.eContainer
		}
		// due to cross reference in multiple files (cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=338655), code below generate 
		// "java.lang.AssertionError: Cyclic resolution of lazy links : Container.instance->Container.instance"
		// 
		/*if (object.unit.container != null && object.unit.container.instance != null) {
			return object.unit.container.instance
		}*/
	}
	
	def EPackage getPackage(Import object) {
		return Registry::INSTANCE.getEPackage(object.name)
	}
	
	def EClass[] getClasses(Import object) {
		return getPackage(object).EClassifiers.filter(typeof(EClass))
	}
	
	def EClass[] getClasses(Unit object) {
		val List<EClass> list = new ArrayList()
		object.imports.forEach(it | list.addAll(getClasses(it)))
		return list
	}
	
	def EStructuralFeature[] getFeatures(Instance object) {
		getClassifier(object).EAllStructuralFeatures.filter(it | it.settable)
	}
	
	def EClass getClassifier(Instance object) {
		val type = object.type
		object.unit.classes.findFirst[it.name == type]
	}
	
	def EStructuralFeature getFeature(Slot object) {
		val name = object.name
		object.instance.features.findFirst[it.name == name]
	}
	
	def EStructuralFeature getFeature(Instance object, String name) {
		object.features.findFirst[it.name == name]
	}
	
	def EReference getReference(Slot object) {
		if (object.feature instanceof EReference) object.feature as EReference
	}
	
	def EEnum getEnum(Slot object) {
		if (object.feature?.EType instanceof EEnum) {
			return object.feature.EType as EEnum
		}
	}
	
	def boolean isSettable(EStructuralFeature object) {
		return object.changeable// && !object.derived
	}
	
	def  boolean isMandatory(EStructuralFeature object) {
		return object.lowerBound > 0 && object.defaultValueLiteral == null
	}
	
	def  dispatch boolean isValid(Value object) {
		false
	}
	
	def  dispatch boolean isValid(Array object) {
		object.slot.feature.many
	}
	
	def  dispatch boolean isValid(InstanceRef object) {

		// Specific check: ECore class seems to be an hidden / secret supertype
		if (EcorePackage::eINSTANCE.EObject.equals(object.slot.feature.EType)) {
			return true
		}
		System::out.format("VALIDATION IS VALID REF: %s = supertype: %s : current type: %s\n", 
			(object.slot.feature.EType as EClass).isSuperTypeOf(object.value.classifier)
			, object.slot.feature.EType, object.value.classifier
		)
		
		(object.slot.feature.EType as EClass).isSuperTypeOf(object.value.classifier)
	}
	
	def  dispatch boolean isValidInstance(BooleanValue object) {
		var o = object.slot?.feature?.EType?.instanceClass
		System::out.println(o)
		return Boolean::TYPE.equals(o) || typeof(Boolean).equals(o) 
	}
	
	def  dispatch boolean isValidInstance(StringValue object) {
		var o = object.slot?.feature?.EType?.instanceClass
		return typeof(String).equals(o)
	}
	
	def  String getDocumentation(EModelElement object) {
		var EAnnotation a = object.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")
		if (a == null) {
			return null;
		} else {
			return a.details.get("documentation")
		}
	}
}
