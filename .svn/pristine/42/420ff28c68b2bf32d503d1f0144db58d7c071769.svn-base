package com.yash.tms.dao;

import java.util.Map;

import javax.security.sasl.AuthenticationException;

import com.yash.tms.model.Employee;

/**
 * this interface is a contract to communicate with LDAP server and retrieve various information of the user
 * @author megha.dengre
 *
 */
public interface LDAPResourceLookupDao 
{
	/**
	 * this method initially authenticates the user by it's email and password to access the ldap server
	 * here email and password are inserted in hashtable only
	 * this method will also search for the lookup id, whether it exists on server or not
	 * @param searchemail
	 * @return
	 * @throws AuthenticationException 
	 */
	public boolean testAuthentication(String searchemail) throws AuthenticationException;
	
	/**
	 * this method will return data of the lookup resource which was given by the user
	 * @return
	 * @throws AuthenticationException 
	 */
	public Employee getAttributes();
	

}
