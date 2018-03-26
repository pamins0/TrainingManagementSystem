package com.yash.tms.service;
import com.yash.tms.model.Employee;

import javax.security.sasl.AuthenticationException;

import org.springframework.ui.Model;

import com.yash.tms.model.AuthenticatedEmployee;
import com.yash.tms.model.EmployeeBeforeAuthentication;

/**
 * This service will be used for following user related task 1.User
 * authenetication using userid and password.
 * 2. Register Employee
 * 3. Change Status of Employee
 * 
 * @author prashant.chauhan
 *
 */

public interface EmployeeService {
	/**
	 * This method will be used EmployeeService authentication by using userid
	 * and password.
	 * 
	 * @param userid
	 * @param password
	 * @return
	 */
	public AuthenticatedEmployee authenticationEmployee(String userid, String password, Model model);


	/**
	 * this method will set the details in employee after authentication
	 * @author meghna.gajeshwar
	 * @param employeeBeforeAuthentication
	 * @throws AuthenticationException 
	 */
	public void setEmployeeDetails(EmployeeBeforeAuthentication employeeBeforeAuthentication) throws AuthenticationException;
	
	/**
	 * this method will search for the emailId in employees table 
	 * if the employee exist the it will return true
	 * and if not present then return false
	 * @param email
	 * @return
	 */
	public Employee seachExistingEmployee(String email);
	
	/**
	 * this method will update the employee details in employee table
	 * @param employee
	 */
	public void updateEmployee(Employee employee);
}
