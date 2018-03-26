package com.yash.tms.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.tms.dao.EmployeeBaselineDao;
import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBaseline;
import com.yash.tms.service.EmployeeBaselineService;

/**
 * EmployeeBaselineServiceImpl is the implementation of interface EmployeeBaselineService.
 * 'EmployeeBaselineService' is a service containing all the methods and business logic
 * required to perform operation on EmployeeBaseline object.
 * @author masoom.badkur
 *
 */
@Service
public class EmployeeBaselineServiceImpl implements EmployeeBaselineService {

	/**
	 * employeeBaselineDao is an object of interface EmployeeBaselineDao. 
	 * It calls the methods of repository in service.
	 */
	@Autowired
	private EmployeeBaselineDao employeeBaselineDao;
	
	/**
	 * 'logger' is object of org.apache.log4j.Logger class. 
	 * This helps to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(EmployeeBaselineServiceImpl.class);
	
	/**
	 * 'saveEmployeeBaseline()' method calls repository's method to save baselining record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void saveEmployeeBaseline(EmployeeBaseline employeeBaseline) {
		logger.info("SERVICE: Saving record..");
		employeeBaselineDao.insertEmployeeBaseline(employeeBaseline);
	}

	/**
	 * 'editEmployeeBaseline()' method calls repository's method to edit the employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void editEmployeeBaseline(EmployeeBaseline employeeBaseline) {
		logger.info("SERVICE: Editing record..");
		employeeBaselineDao.updateEmployeeBaseline(employeeBaseline);
	}
	
	/**
	 * 'removeEmployeeBaseline()' method calls repository's method to delete employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	public void removeEmployeeBaseline(EmployeeBaseline employeeBaseline) {
		logger.info("SERVICE: Removing record..");
		employeeBaselineDao.deleteEmployeeBaseline(employeeBaseline);
	}
	
	/**
	 * 'getAllSubscribers()' method calls repository's method 
	 * and returns the list of all employees which are subscriber.
	 */
	public List<Employee> getAllSubscribers() {
		logger.info("SERVICE: Fetching Subscribers..");
		return employeeBaselineDao.getAllSubscribers();
	}
	
	/**
	 * 'getAllCriteria()' method calls repository's method and
	 *  returns the list of all criteria from database.
	 */
	public List<BaselineCriteria> getAllCriteria() {
		logger.info("SERVICE: Fetching Criteria..");
		return employeeBaselineDao.getAllCriteria();
	}
	
	/**
	 * 'getAllEmployeeBaseline()' method calls repository's method and
	 *  returns the list of all records of employee baselining from database.
	 */
	public List<EmployeeBaseline> getAllEmployeeBaseline() {
		logger.info("SERVICE: Fetching Employee Baseline..");
		return employeeBaselineDao.getAllEmployeeBaseline();
	}

}
