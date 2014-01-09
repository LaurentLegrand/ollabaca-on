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
	
	def Unit getUnit(EObject self) {
		var EObject container = self.eContainer()
		
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
	
	def EPackage[] getPackages(Unit self) {
		var List<EPackage> list = new ArrayList()
		for (Import i: self.imports) {
			var EPackage p = Registry::INSTANCE.getEPackage(i.name)
			if (p != null) {
				list += p
			}
		}
		
		return list
	}
	
	def Instance[] getAncestorsAndSelf(Instance self) {
		var List<Instance> list = newArrayList()
		var Instance e = self;
		
		do {
			list.add(0, e)
			e = e.parent
		} while (e != null)
		
		return list
	}
	
	def Instance getParent(Instance self) {
		var EObject e = self.eContainer;
		while (e != null) {
			if (e instanceof Instance) {
				return e as Instance
			}
			e = e.eContainer
		}
		// due to cross reference in multiple files (cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=338655), code below generate 
		// "java.lang.AssertionError: Cyclic resolution of lazy links : Container.instance->Container.instance"
		// 
		/*if (self.unit.container != null && self.unit.container.instance != null) {
			return self.unit.container.instance
		}*/
	}
	
	def EPackage getPackage(Import self) {
		return Registry::INSTANCE.getEPackage(self.name)
	}
	
	def EClass[] getClasses(Import self) {
		return getPackage(self).EClassifiers.filter(typeof(EClass))
	}
	
	def EClass[] getClasses(Unit self) {
		val List<EClass> list = new ArrayList()
		self.imports.forEach(it | list.addAll(getClasses(it)))
		return list
	}
	
	def EStructuralFeature[] getFeatures(Instance self) {
		getClassifier(self).EAllStructuralFeatures.filter(it | it.settable)
	}
	
	def EClass getClassifier(Instance self) {
		val type = self.type
		self.unit.classes.findFirst[it.name == type]
	}
	
	def EStructuralFeature getFeature(Slot self) {
		val name = self.name
		self.instance.features.findFirst[it.name == name]
	}
	
	def EStructuralFeature getFeature(Instance self, String name) {
		self.features.findFirst[it.name == name]
	}
	
	def EReference getReference(Slot self) {
		if (self.feature instanceof EReference) self.feature as EReference
	}
	
	def EEnum getEnum(Slot self) {
		if (self.feature?.EType instanceof EEnum) {
			return self.feature.EType as EEnum
		}
	}
	
	def boolean isSettable(EStructuralFeature self) {
		return self.changeable// && !self.derived
	}
	
	def  boolean isMandatory(EStructuralFeature self) {
		return self.lowerBound > 0 && self.defaultValueLiteral == null
	}
	
	def  dispatch boolean isValid(Value self) {
		false
	}
	
	def  dispatch boolean isValid(Array self) {
		self.slot.feature.many
	}
	
	def  dispatch boolean isValid(InstanceRef self) {

		// Specific check: ECore class seems to be an hidden / secret supertype
		if (EcorePackage::eINSTANCE.EObject.equals(self.slot.feature.EType)) {
			return true
		}
		System::out.format("VALIDATION IS VALID REF: %s = supertype: %s : current type: %s\n", 
			(self.slot.feature.EType as EClass).isSuperTypeOf(self.value.classifier)
			, self.slot.feature.EType, self.value.classifier
		)
		
		(self.slot.feature.EType as EClass).isSuperTypeOf(self.value.classifier)
	}
	
	def  dispatch boolean isValidInstance(BooleanValue self) {
		var o = self.slot?.feature?.EType?.instanceClass
		System::out.println(o)
		return Boolean::TYPE.equals(o) || typeof(Boolean).equals(o) 
	}
	
	def  dispatch boolean isValidInstance(StringValue self) {
		var o = self.slot?.feature?.EType?.instanceClass
		return typeof(String).equals(o)
	}
	
	def  String getDocumentation(EModelElement self) {
		var EAnnotation a = self.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")
		if (a == null) {
			return null;
		} else {
			return a.details.get("documentation")
		}
	}
}
