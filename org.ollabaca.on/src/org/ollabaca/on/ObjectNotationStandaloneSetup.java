
package org.ollabaca.on;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ObjectNotationStandaloneSetup extends ObjectNotationStandaloneSetupGenerated{

	public static void doSetup() {
		new ObjectNotationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

