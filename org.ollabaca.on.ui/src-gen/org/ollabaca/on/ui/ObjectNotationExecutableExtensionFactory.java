/*
 * generated by Xtext
 */
package org.ollabaca.on.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.ollabaca.on.ui.internal.ObjectNotationActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ObjectNotationExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ObjectNotationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ObjectNotationActivator.getInstance().getInjector(ObjectNotationActivator.ORG_OLLABACA_ON_OBJECTNOTATION);
	}
	
}
