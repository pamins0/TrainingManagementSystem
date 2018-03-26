package com.yash.tms.service;

import java.util.List;

import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBaseline;

/**
 * 'EmployeeBaselineService' is a service containing all the methods and business logic
 *  required to perform operation on EmployeeBaseline object.
 * @author masoom.badkur
 *
 */
public interface EmployeeBaselineService {
	
	/**
	 * 'saveEmployeeBaseline()' method calls repository's method to save baselining record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void saveEmployeeBaseline(EmployeeBaseline employeeBaseline);
	
	/**
	 * 'getAllSubscribers()' method calls repository's method 
	 * and returns the list of all employees which are subscriber.
	 */
	public List<Employee> getAllSubscribers();
	
	/**
	 * 'getAllCriteria()' method calls repository's method and
	 *  returns the list of all criteria from database.
	 */
	public List<BaselineCriteria> getAllCriteria();
	
	/**
	 * 'getAllEmployeeBaseline()' method calls repository's method and
	 *  returns the list of all records of employee baselining from database.
	 */
	public List<EmployeeBaseline> getAllEmployeeBaseline();
	
	/**
	 * 'editEmployeeBaseline()' method calls repository's method to edit the employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void editEmployeeBaseline(EmployeeBaseline employeeBaseline);
	
	/**
	 * 'removeEmployeeBaseline()' method calls repository's method to delete employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void removeEmployeeBaseline(EmployeeBaseline employeeBaseline);


}
