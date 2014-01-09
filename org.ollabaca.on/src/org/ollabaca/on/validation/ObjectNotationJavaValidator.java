package org.ollabaca.on.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.ollabaca.on.model.Array;
import org.ollabaca.on.model.BooleanValue;
import org.ollabaca.on.model.Container;
import org.ollabaca.on.model.Import;
import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.InstanceRef;
import org.ollabaca.on.model.Literal;
import org.ollabaca.on.model.ModelPackage;
import org.ollabaca.on.model.Slot;
import org.ollabaca.on.model.StringValue;
import org.ollabaca.on.model.Value;
import org.ollabaca.on.util.Units;

public class ObjectNotationJavaValidator extends
		AbstractObjectNotationJavaValidator {

	Units units = new Units();

	@Check
	void verify(Import self) {
		if (units.getPackage(self) == null) {
			error(String.format("package [%s] not found", self.getName()),
					ModelPackage.Literals.IMPORT__NAME);
		}
	}

	@Check
	void verify(Instance self) {
		EClass type = units.getClassifier(self);
		if (type == null) {
			error(String.format("type [%s] does not exist", self.getType()),
					ModelPackage.Literals.INSTANCE__TYPE);
			return;
		}

		if (type.isAbstract()) {
			error(String.format("type [%s] is abstract", self.getType()),
					ModelPackage.Literals.INSTANCE__TYPE);
		}

		// verify mandatory slots
		for (EStructuralFeature feature : units.getFeatures(self)) {
			if (units.isMandatory(feature)) {
				boolean found = false;
				for (Slot slot : self.getSlots()) {
					if (slot.getName().equals(feature.getName())) {
						found = true;
						break;
					}
				}
				if (!found) {
					if (feature instanceof EReference
							&& ((EReference) feature).getEOpposite() != null) {
						info(String.format("feature [%s] might not be set",
								feature.getName()),
								ModelPackage.Literals.INSTANCE__SLOTS);
					} else {
						warning(String.format("feature [%s] not set",
								feature.getName()),
								ModelPackage.Literals.INSTANCE__SLOTS);
					}
				}
			}
		}
	}

	@Check
	void verify(Slot self) {
		EStructuralFeature feature = units.getFeature(self);
		if (feature == null) {
			error(String.format("feature [%s] not found", self.getName()),
					ModelPackage.Literals.SLOT__NAME);
			return;
		}
		
		// enhancement #21 array is optionnal
		
//		Value value = self.getValue();

//		if (feature.isMany() && value != null && !(value instanceof Array)) {
//			error(String.format("value shall be an array"),
//					ModelPackage.Literals.SLOT__VALUE);
//		}

	}

	@Check
	void verify(Literal self) {
		EStructuralFeature feature = units.getFeature(units.getSlot(self));
		if (feature != null && !(feature instanceof EAttribute)) {
			error(String.format("literal cannot be used on references"),
					ModelPackage.Literals.SLOT__VALUE);
		}
	}

	@Check
	void verify(Array self) {
		if (!units.isValid(self)) {
			error(String.format("array is not valid for mutliplicity"),
					ModelPackage.Literals.ARRAY__VALUE);
		}
	}

	@Check
	void verify(BooleanValue self) {
		if (!units.isValidInstance(self)) {
			error(String.format("value is not valid for type"),
					ModelPackage.Literals.BOOLEAN_VALUE__VALUE);
		}
	}

	@Check
	void verify(StringValue self) {
		// TODO
		// if (!units.isValidInstance(self)) {
		// error(String.format("value is not valid for type"),
		// OnPackage.Literals.LITERAL__VALUE);
		// }
	}

	@Check
	void verify(InstanceRef self) {
		if (!units.isValid(self)) {
			error(String.format("value is not of type [%s]",
					units.getFeature(units.getSlot(self)).getEType().getName()),
					ModelPackage.Literals.INSTANCE_REF__VALUE);
		}
	}

	@Check
	void verify(Container self) {
		if (units.getFeature(self.getInstance(), self.getFeature()) == null) {
			error(String.format("feature [%s] does not exist",
					self.getFeature()),
					ModelPackage.Literals.CONTAINER__FEATURE);
		}
	}
}
