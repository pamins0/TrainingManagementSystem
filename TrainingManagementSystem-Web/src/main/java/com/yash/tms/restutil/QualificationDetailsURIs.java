package com.yash.tms.restutil;

public class QualificationDetailsURIs {
	/**
	 * rest uri for adding qualification details
	 */
	public static final String ADD_QUALIFICATION_DETAILS = "/qualificationDetails";
	/**
	 * rest uri for updating qualification details
	 */
	public static final String UPDATE_QUALIFICATION_DETAILS = "/qualificationDetails/update";
	/**
	 * rest uri for getting all qualification details of a particular employee by employeeId
	 */
	public static final String GET_QUALIFICATION_DETAILS_BY_ID = "/qualificationDetails/{id}";
	/**
	 * rest uri for deleting qualification detail by detailId
	 */
	public static final String DELETE_QUALIFICATION_DETAILS= "/delete_qualificationDetails/{id}";
	
	
	
	
	/**
	 * rest uri for getting all qualification streams
	 */
	public static final String GET_STREAMS = "/streams";
	/**
	 * rest uri for getting all qualification streams of an employee by employeeId
	 */
	public static final String GET_STREAMS_BY_EMP_ID = "/streams/{id}";
	
	
	
	
}
