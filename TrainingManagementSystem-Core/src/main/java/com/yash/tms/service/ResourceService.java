package com.yash.tms.service;

import java.util.List;
import java.util.Map;

import javax.security.sasl.AuthenticationException;

import com.yash.tms.model.Employee;
import com.yash.tms.model.ResourceEmployee;

/**
 * this will communicate with dao to perform manipulation operations in resource
 * @author megha.dengre
 *
 */
public interface ResourceService 
{
	/**
	 * this method will search for resource through its emailid and communicate with dao
	 * @param searchemail
	 * @return
	 * @throws AuthenticationException 
	 */
	public Employee lookupResource(String searchemail) throws AuthenticationException;
	
	/**
	 * this method will insert the employee first 
	 * and then with corresponding employee_id add data into resources
	 * @param resourceEmployee
	 * @return
	 */
	public void insertResource(ResourceEmployee resourceEmployee);
	
	/**
	 * this method will update the resource on the basis of its resource id
	 * @param resourceEmployee
	 */
	public void updateResource(ResourceEmployee resourceEmployee);
	
	/**
	 * this method will retrieve all the resources
	 * @return
	 */
	public List<ResourceEmployee> listAllResource();
	
	/**
	 * this method will delete the resource on the basis of it's id 
	 * also the details in employee table will be deleted
	 * @param resourceEmployee
	 */
	public void deleteResource(int resource_id);

}
