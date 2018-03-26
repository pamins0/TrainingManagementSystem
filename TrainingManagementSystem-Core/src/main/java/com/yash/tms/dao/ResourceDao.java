package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.Resource;
import com.yash.tms.model.ResourceEmployee;

/**
 * this will communicate with resources table in db
 * @author megha.dengre
 *
 */
public interface ResourceDao 
{
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
	
	/**
	 * this method will find the employee id for the resource
	 * @param resource_id
	 * @return
	 */
	public int getEmployeeIdByResource(int resource_id);
	
	/**
	 * this method will search whether the employee is assigned as a resource in resource table
	 * @param empid
	 * @return
	 */
	public Resource searchResourceByEmployeeId(int empid);

}
