package com.yash.tms.util;

import java.util.Hashtable;
import javax.naming.Context;

/**
 * To connect to the server, we must obtain a reference to an object that implements the DirContext interface. 
 * In most applications, this is done by using an InitialDirContext object that takes a Hashtable as an argument. 
 * 
 * @author megha.dengre
 *
 */
public class LDAPHashTableInitialization {
	
	/**
	 * This Hashtable contains various entries, such as the hostname, port, and JNDI service provider classes to use
	 */
	Hashtable<String, Object> environment;

	/**
	 * this methods specifies different environment variables in the context interface
	 * @return
	 */
	public Hashtable<String, Object> intializeHashTableVariables() {

		environment = new Hashtable();
		environment.put(Context.SECURITY_AUTHENTICATION, LDAPBasicInitializations.LDAP_SECURITY_AUTHENTICATION);
		environment.put(Context.INITIAL_CONTEXT_FACTORY, LDAPBasicInitializations.LDAP_INITIAL_CONTEXT_FACTORY);
		environment.put(Context.PROVIDER_URL, LDAPBasicInitializations.LDAP_PROVIDER_URL);
		environment.put(Context.SECURITY_PRINCIPAL, "megha.dengre@yash.com");
		environment.put(Context.SECURITY_CREDENTIALS, "yash@1212");
		environment.put("java.naming.ldap.attributes.binary", "objectSID");
		return environment;

	}

}
