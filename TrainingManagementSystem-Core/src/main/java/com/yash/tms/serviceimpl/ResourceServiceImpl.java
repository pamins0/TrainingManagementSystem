package com.yash.tms.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.tms.dao.EmployeeDao;
import com.yash.tms.dao.LDAPResourceLookupDao;
import com.yash.tms.dao.ResourceDao;
import com.yash.tms.model.Employee;
import com.yash.tms.model.Resource;
import com.yash.tms.model.ResourceEmployee;
import com.yash.tms.service.ResourceService;

/**
 * This is an implementation of resourceService which will communicate with dao
 * @author megha.dengre
 *
 */
@Service
@Transactional
public class ResourceServiceImpl implements ResourceService {
	
	/**
	 * for communicating with dao
	 */
	@Autowired
	LDAPResourceLookupDao lookupDao;
	
	/**
	 * for communicating with resource
	 */
	@Autowired
	ResourceDao resourceDao;
	
	/**
	 * for communicating with employee dao
	 * 	
	 */
	@Autowired
	EmployeeDao employeeDao; 
	
	

	/**
	 * this method will call the dao to communicate with ldap server and search for a resource
	 * this method will also search 
	 * if the email exist in employee table then it will update it's detail in the object and 
	 * return the object
	 * 
	 * if the details also exist in resource table then it return empty object 
	 * (on front end it will show the warning msg that detail already exists)
	 * @throws AuthenticationException 
	 * 
	 */
	public Employee lookupResource(String searchemail) throws AuthenticationException {
		lookupDao.testAuthentication(searchemail);
		Employee employee=lookupDao.getAttributes();
		Resource existingresource=new Resource();
		   
		Employee existingemployee=employeeDao.seachExistingEmployee(employee.getEmail_id());
		if(existingemployee.getId()!=0)
		{
			employee.setBatch_id(existingemployee.getBatch_id());
			employee.setRole_id(existingemployee.getRole_id());
			employee.setStatus_id(existingemployee.getStatus_id());
			employee.setId(existingemployee.getId());
			existingresource=resourceDao.searchResourceByEmployeeId(existingemployee.getId());
		}
		if(existingresource.getId()!=0){
			return new Employee();
		}	
		
		return employee;
	}


	/**
	 * this method will insert the employee first 
	 * and then with corresponding employee_id add data into resources
	 * @param resourceEmployee
	 * @return
	 */
	public void insertResource(ResourceEmployee resourceEmployee) {
		resourceDao.insertResource(resourceEmployee);
	}


	/**
	 * this method will update the resource on the basis of its resource id
	 * @param resourceEmployee
	 */
	public void updateResource(ResourceEmployee resourceEmployee) {
		resourceDao.updateResource(resourceEmployee);
		
	}


	/**
	 * this method will retrieve all the resources
	 * @return
	 */
	public List<ResourceEmployee> listAllResource() {
		return resourceDao.listAllResource();
	}


	/**
	 * this method will delete the resource on the basis of it's id 
	 * also the details in employee table will be deleted
	 * @param resourceEmployee
	 */
	public void deleteResource(int resource_id) {
		resourceDao.deleteResource(resource_id);
		
	}

	

}
