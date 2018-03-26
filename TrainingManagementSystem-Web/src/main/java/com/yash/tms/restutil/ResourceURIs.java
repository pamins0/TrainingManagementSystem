package com.yash.tms.restutil;


/**
 * ResourceURIs is a utility class having constants for mapping the front server request on the REST controller.
 * @author megha.dengre
 *
 */
public class ResourceURIs 
{
	/**
	 * this url will hit and get the resource detail for particular email given through path variable
	 */
	public static final String LOOKUP_RESOURCE="/resource/{email}/";
	
	/**
	 * this url will hit and post the resource details
	 */
	public static final String ADD_RESOURCE="/resource";
	
	
	/**
	 * this url will hit and get all the resources
	 */
	public static final String GET_RESOURCE="/resource";
	
	/**
	 * this url will hit and delete the resource
	 */
	public static final String DELETE_RESOURCE="/resource/{id}";
	
	/**
	 * this url let update the resource details using put request method
	 */
	public static final String UPDATE_RESOURCE="/resource/{id}";

}
