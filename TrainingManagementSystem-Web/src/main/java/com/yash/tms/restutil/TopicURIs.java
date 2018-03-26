package com.yash.tms.restutil;

public class TopicURIs {
	
	/**
	 * ADD_topic is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 */
	public static final String ADD_TOPIC = "/topic";
	
	/**
	 * EDIT_TOPIC is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to edit a record.
	 */
	public static final String EDIT_TOPIC = "/topic/{id}";
	
	/**
	 * DELETE_TOPIC is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to delete a record.
	 */
	public static final String DELETE_TOPIC = "/topic/{id}";
	
	/**
	 * GET_ALL_TOPICS is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to get all the employee baselining records.
	 */
	public static final String GET_ALL_TOPICS = "/topic";
	
	
	
	/**
	 * GET_TOPICS_BY_ID is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to get all the criteria.
	 */
	public static final String GET_TOPICS_BY_COURSE_ID = "/getTopicsByCourseId/{id}";
	

	/**
	 * GET_TOPICS_BY_BATCH_ID is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to get all the criteria.
	 */
	public static final String GET_TOPICS_BY_BATCH_ID = "/getTopicsByBatchId/{id}";
	

}
