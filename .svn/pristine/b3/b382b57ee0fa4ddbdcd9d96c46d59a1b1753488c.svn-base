package com.yash.tms.daoimpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.LDAPResourceLookupDao;
import com.yash.tms.model.Employee;
import com.yash.tms.util.LDAPBasicInitializations;
import com.yash.tms.util.LDAPHashTableInitialization;

/**
 * This class is an implementation of LDAPResourceLookupDao which will authenticate the user by its email and password
 * and lookup for a resource
 * @author megha.dengre
 *
 */
@Repository
public class LDAPResourceLookupDaoimpl implements LDAPResourceLookupDao
{
	/**
	 * searchresult represents an item in the NamingEnumeration returned as a result of the DirContext.search() methods.
	 */
	private SearchResult searchResult;
	/**
	 * it is an interface which creates a hashtable to connect with server
	 */
	LDAPHashTableInitialization icontext;
	/**
	 * This is for searching an email in ldap server
	 */
	String accountToLookup;
	
	/**
	 * This is the result map which consists of the name of attribute and it's value
	 */
	Map<String, Object> mapofAttributesWithValues;

	public LDAPResourceLookupDaoimpl() 
	{
		icontext=new LDAPHashTableInitialization();
		mapofAttributesWithValues = new HashMap<String, Object>();
	}
/**
 * this method initially authenticates the user by it's email and password to access the ldap server
 * here email and password are inserted in hashtable only	 
 * this method will also search for the lookup id, whether it exists on server or not
 * @throws AuthenticationException 
 */
	public boolean testAuthentication(String searchemail) throws AuthenticationException {
		Hashtable<String, Object> environment = icontext.intializeHashTableVariables();
		accountToLookup = "sAMAccountName=" + searchemail.substring(0, searchemail.indexOf("@"));
		InitialDirContext ctx = null;
		try {
			ctx = new InitialDirContext(environment);
			SearchControls searchControls = new SearchControls();
			searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			NamingEnumeration<SearchResult> results = ctx.search(LDAPBasicInitializations.LDAP_SEARCH_BASE, accountToLookup,
					searchControls);
			//LDAP_SEARCH_BASE :Domain (com.yash), accountToLookup=prashant.chauhan,searchControls=
			if (results.hasMoreElements()) {
				searchResult = results.nextElement();
				return true;
			}
			else{
				throw new AuthenticationException();
			}
			//ctx.close();
		} catch (NamingException e) {
			throw new AuthenticationException();
		}
	
	}

	/**
	 * this method will return data of the lookup resource which was given by the user
	 * @return
	 * @throws AuthenticationException 
	 */
	public Employee getAttributes() {

		Attributes attributes = searchResult.getAttributes();
		Employee employee=new Employee();
		if (attributes == null) {
			System.out.println("No attributes To Display");
			return null;

		}

		try {
			NamingEnumeration namingEnumeration = attributes.getAll();
			while (namingEnumeration.hasMore()) 
			{
				Attribute attribute = (Attribute) namingEnumeration.next();
				List<Object> listOfAttributeValues = new ArrayList<Object>();
				
				if(attribute.getID().equals("givenName"))
				{
					NamingEnumeration e = attribute.getAll();
					while (e.hasMore()) {
						
						employee.setFirstname(e.next().toString());
					}
					
					
				}
				if(attribute.getID().equals("sn")){
					
					NamingEnumeration e = attribute.getAll();
					while (e.hasMore()) {
						employee.setLastname(e.next().toString());
					}
					
				}
				if(attribute.getID().equals("mail")){
					
					NamingEnumeration e = attribute.getAll();
					while (e.hasMore()) {
						employee.setEmail_id(e.next().toString());
					}
				}

			}

		} catch (NamingException e) {
			
		}

		return employee;
	}


}
