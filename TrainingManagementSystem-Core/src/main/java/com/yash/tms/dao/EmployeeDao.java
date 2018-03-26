package com.yash.tms.dao;
import javax.security.sasl.AuthenticationException;

import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBeforeAuthentication;
/**
 * EmployeeDao will be used for interaction with DB and will be used for the following contract: 
 * 1.Employee Login
 * @author prashant.chauhan
 *
 */

public interface EmployeeDao{
	/**
	 * This method will be used for getting employee on the basic of the userId and password
	 * 
	 * @param userid
	 * @param password
	 * @return Employee
	 */
	public Employee getEmployee(String userid,String password);
	

	/**
	 * this method will insert a new employee in DB whose status will be
	 * inactive and role is subscriber
	 *  @author meghna.gajeshwar
	 */
	public void registerEmployee(Employee employee);

	/**
	 * this method will update the status of employee as active or inactive
	 * @author meghna.gajeshwar
	 * @param employee
	 */
	public void updateStatus(Employee employee);
	/**
	 * this method will authenticate the employee before the employee is registered
	 * @author meghna.gajeshwar
	 * @param employeeBeforeAuthentication
	 * @throws AuthenticationException 
	 */
	public boolean authenticateEmployee(EmployeeBeforeAuthentication employeeBeforeAuthentication) throws AuthenticationException;
	/**
	 * this method will set the details in employee after authentication
	 * @author meghna.gajeshwar
	 * @param employeeBeforeAuthentication 
	 * @throws AuthenticationException 
	 */
	public void setEmployeeDetails(EmployeeBeforeAuthentication employeeBeforeAuthentication) throws AuthenticationException;
	
	/**
	 * this method will search for the emailId in employees table 
	 * @param email
	 * @return
	 */
	public Employee seachExistingEmployee(String email);
	
	/**
	 * this method will search for the id in employees table
	 * @param employee_id
	 * @return
	 */
	public Employee searchEmployeeById(int employee_id);
	
	/**
	 * this method will update the employee details in employee table
	 * @param employee
	 */
	public void updateEmployee(Employee employee);
}
