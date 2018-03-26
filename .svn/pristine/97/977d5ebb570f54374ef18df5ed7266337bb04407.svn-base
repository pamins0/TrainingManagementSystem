package com.yash.tms.daoimpl;

import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.EmployeeDao;
import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBeforeAuthentication;
import com.yash.tms.util.LdapUtil;


/***
 * EmployeeDaoImpl is implementation of the EmployeeDao and having following
 * implementation of the contract: 1.Employee Login using LDAP by Yash userId
 * and password. 2.registration of employee using Yash email id, password and batch
 * 
 * @author meghna.gajeshwar
 *
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private int role_id;
	private int status_id;
	/**
	 * constructor is used to initialize the values of role_id and status_id
	 * @author meghna.gajeshwar
	 */
	public EmployeeDaoImpl() {
		/**
		 * this will initialize the role id by 1 (subscriber id in DB)
		 */
		role_id=1;
		/**
		 * this will initialize the status id by 2 (inactive status in DB)
		 */
		status_id=2;
		
	}
	/**
	 * This class is the starting context for performing directory operations.
	 */
	private InitialDirContext context = null;
	/**
	 * Hibernate template will be used for Querying the DB Employee entity.
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;
	/**
	 * This class represents an item in the NamingEnumeration returned as a
	 * result of the DirContext.search() methods.
	 */
	private SearchResult searchResult;
	/**
	 * This employee reference will be used to communicate between
	 * EmployeeBeforeRegisteration and Employee
	 */
	private Employee employee = null;

	/**
	 * This method will be used to retrive Employee on the basis of provided
	 * userid and password.
	 */
	public Employee getEmployee(String userid, String password) {
		Employee employee = null;
		String accountToLookUp=null;
		try {
			if(userid.contains("@"))
			{
			accountToLookUp = "sAMAccountName=" + userid.substring(0, userid.indexOf("@"));
			}
			context = new InitialDirContext(this.prepareLdapConfiguration(userid, password));
			SearchControls control = new SearchControls();
			control.setSearchScope(SearchControls.SUBTREE_SCOPE);
			NamingEnumeration<SearchResult> results = context.search(LdapUtil.LDAP_SEARCH_BASE, accountToLookUp,
					control);
			if (results.hasMoreElements()) {
				searchResult = results.nextElement();
				employee = this.populateEmployeeFields(employee);
			}

		} catch (NamingException e) {
			return new Employee();
		}
		return employee;

	}
	
	/**
	 * this method will register a new employee in DB with status as inactive
	 * and role as subscriber
	 * @param employee
	 * @author meghna.gajeshwar
	 */
	public void registerEmployee(Employee employee) {
		employee.setRole_id(role_id);
		employee.setStatus_id(status_id);
		employee.setCreatedby(1);
		employee.setModifiedby(1);
		employee.setCreateddate(new Date());
		employee.setModifieddate(new Date());
		System.out.println("registering employee");
		hibernateTemplate.save(employee);
		System.out.println("employee registered");
	}

	/**
	 * this method will set employeeDetails for registration after
	 * authentication
	 * @author meghna.gajeshwar
	 * @param employeeBeforeAuthentication
	 * @throws AuthenticationException 
	 */
	public void setEmployeeDetails(EmployeeBeforeAuthentication employeeBeforeAuthentication) throws AuthenticationException {
		if (authenticateEmployee(employeeBeforeAuthentication)) {
			employee = new Employee();
			System.out.println("employee authenticated");
			Attributes attributes = searchResult.getAttributes();
			try {
				NamingEnumeration attributeslist = attributes.getAll();
				while (attributeslist.hasMore()) {
					Attribute attribute = (Attribute) attributeslist.next();
					if (attribute.getID().equals("givenName")) {
						// set first name in employee
						employee.setFirstname((String) attribute.getAll().next());
					}
					if (attribute.getID().equals("sn")) {
						// set last name of employee
						employee.setLastname((String) attribute.getAll().next());
					}
				}
				employee.setEmail_id(employeeBeforeAuthentication.getEmail_id());
				employee.setBatch_id(employeeBeforeAuthentication.getBatch_id());
				registerEmployee(employee);
			} catch (NamingException e) {
				throw new AuthenticationException();
			}

		}
	}

	/**
	 * this method will authenticate the employee before registration
	 * @param employeeBeforeAuthentication
	 * @author meghna.gajeshwar
	 * @throws AuthenticationException 
	 * @return
	 */
	public boolean authenticateEmployee(EmployeeBeforeAuthentication employeeBeforeAuthentication) throws AuthenticationException {
		System.out.println("authenticating employee");
		String email_id = employeeBeforeAuthentication.getEmail_id();
		String password = employeeBeforeAuthentication.getPassword();
		try {
			context = new InitialDirContext(this.prepareLdapConfiguration(email_id, password));
			String accountToLookup = "sAMAccountName=" + email_id.substring(0, email_id.indexOf("@"));
			SearchControls searchControls = new SearchControls();
			searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			NamingEnumeration<SearchResult> results = context.search(LdapUtil.LDAP_SEARCH_BASE, accountToLookup,
					searchControls);
			if (results.hasMoreElements()) {
				searchResult = results.nextElement();
				return true;
			}
			context.close();
		} catch (NamingException e) {
			throw new AuthenticationException();
		}

		return false;
	}

	/**
	 * this method will update the status of employee, the status can be updated
	 * by trainer only
	 * 
	 * @author meghna.gajeshwar
	 */
	public void updateStatus(Employee employee) {
		
		
	}
	
	/**
	 * This method will be used to populate the Hashtable which will be used as
	 * Configuration for LDAP.
	 * 
	 * @param userid
	 * @param password
	 * @return
	 */

	public Hashtable<String, Object> prepareLdapConfiguration(String userid, String password) {
		Hashtable<String, Object> config = new Hashtable<String, Object>();
		config.put(Context.SECURITY_AUTHENTICATION, LdapUtil.LDAP_SECURITY_AUTHENTICATION);
		config.put(Context.INITIAL_CONTEXT_FACTORY, LdapUtil.LDAP_INITIAL_CONTEXT_FACTORY);
		config.put(Context.PROVIDER_URL, LdapUtil.LDAP_PROVIDER_URL);
		config.put(Context.SECURITY_PRINCIPAL, userid);
		config.put(Context.SECURITY_CREDENTIALS, password);
		config.put("java.naming.ldap.attributes.binary", "objectSID");
		return config;
	}

	/**
	 * This Method will be used for populating the employee on the basis of his
	 * yash email id.
	 * 
	 * @param employee
	 * @return
	 * @throws DataAccessException
	 * @throws NamingException
	 */
	public Employee populateEmployeeFields(Employee employee) throws DataAccessException, NamingException {
		Attributes attributes = searchResult.getAttributes();
		NamingEnumeration attributeslist = attributes.getAll();
		employee = new Employee();
		while (attributeslist.hasMore()) {
			Attribute attribute = (Attribute) attributeslist.next();
			if (attribute.getID().equals("mail")) {
				System.out.println("mail " + attribute.getAll().next());
				List employees = hibernateTemplate.find("from Employee where email_id=?", attribute.getAll().next());
				if(employees.size()>0)
				{
				employee = (Employee) employees.get(0);
				}
				else
					return new Employee();
				}
			}
		return employee;
	}
	/**
	 * this method will search for the emailId in employees table 
	 * if the employee exist the it will return true
	 * and if not present then return false
	 * @param email
	 * @return megha dengre
	 */
	public Employee seachExistingEmployee(String email) {
		
		List<Employee> employee=(List<Employee>)hibernateTemplate.find("from Employee where email_id=?", email);
		Employee searchedemployee=new Employee();
		for (Employee employee2 : employee) 
		{
			searchedemployee=employee2;
		}
		
		return searchedemployee;
	}

	public Employee searchEmployeeById(int employee_id) {
		List<Employee> employee=(List<Employee>)hibernateTemplate.find("from Employee where id=?", employee_id);
		Employee searchedemployee=new Employee();
		for (Employee employee2 : employee) 
		{
			searchedemployee=employee2;
		}
		
		return searchedemployee;
	}
	public void updateEmployee(Employee updateemployee) {
		
		hibernateTemplate.merge(updateemployee);
	}


}
