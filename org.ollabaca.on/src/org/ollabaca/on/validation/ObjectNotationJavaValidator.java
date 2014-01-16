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
	void verify(Import object) {
		if (units.getPackage(object) == null) {
			error(String.format("package [%s] not found", object.getName()),
					ModelPackage.Literals.IMPORT__NAME);
		}
	}

	@Check
	void verify(Instance object) {
		EClass type = units.getClassifier(object);
		if (type == null) {
			error(String.format("type [%s] does not exist", object.getType()),
					ModelPackage.Literals.INSTANCE__TYPE);
			return;
		}

		if (type.isAbstract()) {
			error(String.format("type [%s] is abstract", object.getType()),
					ModelPackage.Literals.INSTANCE__TYPE);
		}

		// verify mandatory slots
		for (EStructuralFeature feature : units.getFeatures(object)) {
			if (units.isMandatory(feature)) {
				boolean found = false;
				for (Slot slot : object.getSlots()) {
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
	void verify(Slot object) {
		EStructuralFeature feature = units.getFeature(object);
		if (feature == null) {
			error(String.format("feature [%s] not found", object.getName()),
					ModelPackage.Literals.SLOT__NAME);
			return;
		}
		
		// enhancement #21 array is optionnal
		
//		Value value = object.getValue();

//		if (feature.isMany() && value != null && !(value instanceof Array)) {
//			error(String.format("value shall be an array"),
//					ModelPackage.Literals.SLOT__VALUE);
//		}

	}

	@Check
	void verify(Literal object) {
		EStructuralFeature feature = units.getFeature(units.getSlot(object));
		if (feature != null && !(feature instanceof EAttribute)) {
			error(String.format("literal cannot be used on references"),
					ModelPackage.Literals.SLOT__VALUE);
		}
	}

	@Check
	void verify(Array object) {
		if (!units.isValid(object)) {
			error(String.format("array is not valid for mutliplicity"),
					ModelPackage.Literals.ARRAY__VALUE);
		}
	}

	@Check
	void verify(BooleanValue object) {
		if (!units.isValidInstance(object)) {
			error(String.format("value is not valid for type"),
					ModelPackage.Literals.BOOLEAN_VALUE__VALUE);
		}
	}

	@Check
	void verify(StringValue object) {
		// TODO
		// if (!units.isValidInstance(object)) {
		// error(String.format("value is not valid for type"),
		// OnPackage.Literals.LITERAL__VALUE);
		// }
	}

	@Check
	void verify(InstanceRef object) {
		if (!units.isValid(object)) {
			error(String.format("value is not of type [%s]",
					units.getFeature(units.getSlot(object)).getEType().getName()),
					ModelPackage.Literals.INSTANCE_REF__VALUE);
		}
	}

	@Check
	void verify(Container object) {
		if (units.getFeature(object.getInstance(), object.getFeature()) == null) {
			error(String.format("feature [%s] does not exist",
					object.getFeature()),
					ModelPackage.Literals.CONTAINER__FEATURE);
		}
	}
}
