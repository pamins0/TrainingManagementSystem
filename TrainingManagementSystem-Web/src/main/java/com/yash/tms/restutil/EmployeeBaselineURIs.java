package com.yash.tms.restutil;

/**
 * EmployeeBaselineURIs is a utility class having constants for mapping the front server request on the REST controller.
 * @author masoom.badkur
 *
 */
public class EmployeeBaselineURIs {
	
	/**
	 * ADD_EMPLOYEE_BASELINE is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 */
	public static final String ADD_EMPLOYEE_BASELINE = "/employeeBaselines/add";
	
	/**
	 * EDIT_EMPLOYEE_BASELINE is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to edit a record.
	 */
	public static final String EDIT_EMPLOYEE_BASELINE = "/employeeBaselines/edit";
	
	/**
	 * DELETE_EMPLOYEE_BASELINE is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to delete a record.
	 */
	public static final String DELETE_EMPLOYEE_BASELINE = "/employeeBaselines/delete/{id}";
	
	/**
	 * GET_ALL_EMPLOYEE_BASELINE is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to get all the employee baselining records.
	 */
	public static final String GET_ALL_EMPLOYEE_BASELINE = "/employeeBaselines";
	
	/**
	 * GET_ALL_SUBSCRIBER is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to get all the subscribers.
	 */
	public static final String GET_ALL_SUBSCRIBERS = "/subscribers";
	
	/**
	 * GET_ALL_CRITERIA is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to get all the criteria.
	 */
	public static final String GET_ALL_CRITERIA = "/criteria";

}
