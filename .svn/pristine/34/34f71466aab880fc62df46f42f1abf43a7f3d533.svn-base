package com.yash.tms.daoimpl;


import java.util.List;

import javax.transaction.Transactional;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.yash.tms.dao.EmployeeBaselineDao;
import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBaseline;
import com.yash.tms.model.Role;

/**
 * 'EmployeeBaselineDaoImpl' is the implementation of 'EmployeeBaselineDao' interface.
 * This class gives definition of all the methods declared in interface EmployeeBaselineDao.
 * 'EmployeeBaselineDao' is a repository containing all the methods required to perform operation on EmployeeBaseline object.
 * @author masoom.badkur
 *
 */
@Repository
public class EmployeeBaselineDaoImpl implements EmployeeBaselineDao {
	
	/**
	 * 'hibernateTemplate' is the object of class HibernateTemplate which is a predefined class of Spring.
	 * HibernateTemplate is configured in dispatcher-servlet.xml.
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	/**
	 * 'logger' is object of org.apache.log4j.Logger class. This helps to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(EmployeeBaselineDaoImpl.class);
	
	/**
	 * 'subscriberRoleId' is integer variable of which stores the role id from roles table where nameof role is subscriber.
	 */
	int subscriberRoleId;

	/**
	 * 'insertEmployeeBaseline()' method saves an employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	@Transactional
	public void insertEmployeeBaseline(EmployeeBaseline employeeBaseline) {
		logger.info("REPOSITORY: Inserting record..");
		hibernateTemplate.save(employeeBaseline);
	}
	
	/**
	 * 'deleteEmployeeBaseline()' method deletes an employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	@Transactional
	public void deleteEmployeeBaseline(EmployeeBaseline employeeBaseline) {
		logger.info("REPOSITORY: Deleting record..");
		hibernateTemplate.delete(employeeBaseline);
	}

	/**
	 * 'updateEmployeeBaseline()' method updates an employee baseline record in the database. 
	 * It takes 'EmployeeBaseline' object as an input.
	 * @param employeeBaseline
	 */
	@Transactional
	public void updateEmployeeBaseline(EmployeeBaseline employeeBaseline) {
		logger.info("REPOSITORY: Updating record..");
		hibernateTemplate.saveOrUpdate(employeeBaseline);
	}
	
	/**
	 * 'getAllSubscribers()' method returns the list of all employees which are subscriber.
	 */
	@Transactional
	public List<Employee> getAllSubscribers() {	
		logger.info("REPOSITORY: Reading Subscribers..");	
		List<Role> roles = hibernateTemplate.loadAll(Role.class);
		for (Role role : roles) {
			if(role.getName().equals("subscriber")){				
				subscriberRoleId = role.getId();
				break;
			}
		}
		return (List<Employee>) hibernateTemplate.find("from Employee where role_id = ?)", subscriberRoleId);
	}	
	
	/**
	 * 'getAllCriteria()' method returns the list of all criteria from database.
	 */
	@Transactional
	public List<BaselineCriteria> getAllCriteria() {
		logger.info("REPOSITORY: Reading Criteria..");	
		return hibernateTemplate.loadAll(BaselineCriteria.class);
	}
	
	/**
	 * 'getAllEmployeeBaseline()' method returns the list of all records of employee baselining from database.
	 */
	@Transactional
	public List<EmployeeBaseline> getAllEmployeeBaseline() {
		logger.info("REPOSITORY: Reading Employee Baselines..");	
		return hibernateTemplate.loadAll(EmployeeBaseline.class);
	}

}
