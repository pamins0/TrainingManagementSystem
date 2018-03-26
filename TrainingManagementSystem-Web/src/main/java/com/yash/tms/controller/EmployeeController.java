package com.yash.tms.controller;

import javax.security.sasl.AuthenticationException;
import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.AuthenticatedEmployee;

import com.yash.tms.model.EmployeeAuthentication;
import com.yash.tms.service.EmployeeService;
import com.yash.tms.model.EmployeeBeforeAuthentication;
import com.yash.tms.restutil.LoginRegistrationURIs;

/**
 * EmployeeController will be used for handling all the request related to the Employee
 * 
 * @author Rajat.gupta
 */
@RestController
@CrossOrigin(origins="*")
public class EmployeeController {
	
	/**
	 * Employee Service will be used to perform Employee Related Services.
	 */
	@Autowired
	private EmployeeService employeeService;
	/**
	 * This method will be used for handling authentication and will return the Employee after successful authentication.
	 * @param employeeAuthentication
	 * @return
	 */
	@RequestMapping(value=LoginRegistrationURIs.LOGIN_EMPLOYEE,method=RequestMethod.POST)
	public AuthenticatedEmployee authenticateEmployee(@RequestBody EmployeeAuthentication employeeAuthentication,Model model){
		return employeeService.authenticationEmployee(employeeAuthentication.getUserid(), employeeAuthentication.getPassword(), model);
	}
	
	/**
	 * this method will be used for authentication of employee before registration
	 * @param employeeBeforeAuthentication
	 * @throws AuthenticationException 
	 */
	@RequestMapping(value=LoginRegistrationURIs.PREAUTHENTICATE_EMPLOYEE, method=RequestMethod.POST)
	public void preAuthenticateEmployee(@RequestBody EmployeeBeforeAuthentication employeeBeforeAuthentication) throws AuthenticationException{
		System.out.println("Employee Before Authentication Controller");
		employeeService.setEmployeeDetails(employeeBeforeAuthentication);
			
	}
}
