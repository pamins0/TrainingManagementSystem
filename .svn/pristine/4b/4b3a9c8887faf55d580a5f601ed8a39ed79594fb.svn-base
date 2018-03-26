package com.yash.tms.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBaseline;

/**
 * 'EmployeeBaselineDao' is a repository containing all the methods required to perform operation on EmployeeBaseline object.
 * @author masoom.badkur
 *
 */
public interface EmployeeBaselineDao {
	
	/**
	 * 'insertEmployeeBaseline()' method saves an employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void insertEmployeeBaseline(EmployeeBaseline employeeBaseline);
	
	/**
	 * 'getAllSubscribers()' method returns the list of all employees from database which are subscriber.
	 */
	public List<Employee> getAllSubscribers();
	
	/**
	 * 'getAllCriteria()' method returns the list of all criteria from database.
	 */
	public List<BaselineCriteria> getAllCriteria();
	
	/**
	 * 'getAllEmployeeBaseline()' method returns the list of all records of employee baselining from database.
	 */
	public List<EmployeeBaseline> getAllEmployeeBaseline();
	
	/**
	 * 'updateEmployeeBaseline()' method updates an employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void updateEmployeeBaseline(EmployeeBaseline employeeBaseline);
	
	/**
	 * 'deleteEmployeeBaseline()' method deletes an employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void deleteEmployeeBaseline(EmployeeBaseline employeeBaseline);

}
