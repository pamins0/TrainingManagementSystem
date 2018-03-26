package com.yash.tms.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBaseline;
import com.yash.tms.restutil.EmployeeBaselineURIs;
import com.yash.tms.service.EmployeeBaselineService;


/**
 * EmployeeBaselineController is a REST controller having methods mapped with particular URI and HTTP method 
 * and call the service methods in order to perform particular functionality.
 * @author masoom.badkur
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class EmployeeBaselineController {
	
	/**
	 * 'logger' is object of org.apache.log4j.Logger class. This helps to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(EmployeeBaselineController.class);
	
	/**
	 * employeeBaselineService is an object of interface EmployeeBaselineService. 
	 * It calls the methods of service in controller.
	 */
	@Autowired
	private EmployeeBaselineService employeeBaselineService;
	
	/**
	 * postEmployeeBaseline() maps the POST request from the web client. 
	 * It adds new baseline record by calling service's method.
	 * @param employeeBaseline
	 */
	@RequestMapping(value = EmployeeBaselineURIs.ADD_EMPLOYEE_BASELINE, method = RequestMethod.POST)
	public void postEmployeeBaseline(@RequestBody EmployeeBaseline employeeBaseline){
		logger.info("CONTROLLER: Adding new employee baseline..");
		employeeBaseline.setCreateddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		employeeBaseline.setModifieddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		employeeBaseline.setCreatedby(27);
		employeeBaseline.setModifiedby(27);
		employeeBaselineService.saveEmployeeBaseline(employeeBaseline);
	}
	
	/**
	 * getEmployeeBaselines() maps the GET request from the web client. 
	 * It returns list of all baseline records by calling service's method.
	 * @return
	 */
	@RequestMapping(value = EmployeeBaselineURIs.GET_ALL_EMPLOYEE_BASELINE, method = RequestMethod.GET)
	public List<EmployeeBaseline> getEmployeeBaselines(){
		logger.info("CONTROLLER: Getting all employee baseline records..");
		
		List<EmployeeBaseline> employeeBaselines = employeeBaselineService.getAllEmployeeBaseline();
		
		List<EmployeeBaseline> reverseEmployeeBaselines = new ArrayList<EmployeeBaseline>();
		
		for(int i = employeeBaselines.size()-1; i >= 0 ; i--){
			reverseEmployeeBaselines.add(employeeBaselines.get(i));
		}
		
		return reverseEmployeeBaselines;
	}
	
	/**
	 * getCriteria() maps the GET request from the web client. 
	 * It returns list of  all criteria by calling service's method.
	 * @return
	 */
	@RequestMapping(value = EmployeeBaselineURIs.GET_ALL_CRITERIA, method = RequestMethod.GET)
	public List<BaselineCriteria> getCriteria(){
		logger.info("CONTROLLER: Getting all criteria..");
		return employeeBaselineService.getAllCriteria();
	}
	
	/**
	 * getSubscribers() maps the GET request from the web client. 
	 * It returns list of  all subscribers by calling service's method.
	 * @return
	 */
	@RequestMapping(value = EmployeeBaselineURIs.GET_ALL_SUBSCRIBERS, method = RequestMethod.GET)
	public List<Employee> getSubscribers(){
		logger.info("CONTROLLER: Getting all subscribers..");
		return employeeBaselineService.getAllSubscribers();
	}
	
	/**
	 * putEmployeeBaseline() maps the PUT request from the web client. 
	 * It updates baseline record by calling service's method.
	 * @param employeeBaseline
	 */
	@RequestMapping(value = EmployeeBaselineURIs.EDIT_EMPLOYEE_BASELINE, method = RequestMethod.PUT)
	public void putEmployeeBaseline(@RequestBody EmployeeBaseline employeeBaseline){
		logger.info("CONTROLLER: Updating employee baseline..");
		
		employeeBaseline.setCreateddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		employeeBaseline.setModifieddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		employeeBaseline.setCreatedby(27);
		employeeBaseline.setModifiedby(27);
		
		employeeBaselineService.editEmployeeBaseline(employeeBaseline);
	}
	
	/**
	 * deleteEmployeeBaseline() maps the DELETE request from the web client. 
	 * It deletes baseline record by calling service's method.
	 * @param employeeBaseline
	 */
	@RequestMapping(value = EmployeeBaselineURIs.DELETE_EMPLOYEE_BASELINE, method = RequestMethod.DELETE)
	public void deleteEmployeeBaseline(@PathVariable int id){
		logger.info("CONTROLLER: Deleting employee baseline..");
		EmployeeBaseline employeeBaseline = new EmployeeBaseline();
		employeeBaseline.setId(id);
		employeeBaselineService.removeEmployeeBaseline(employeeBaseline);
	}
}
