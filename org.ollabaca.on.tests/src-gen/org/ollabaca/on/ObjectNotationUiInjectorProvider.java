/*
* generated by Xtext
*/
package org.ollabaca.on;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ObjectNotationUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.ollabaca.on.ui.internal.ObjectNotationActivator.getInstance().getInjector("org.ollabaca.on.ObjectNotation");
	}
	
}