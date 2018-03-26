package com.yash.tms.restutil;

/**
 * this class is used to serve as utility to SubTopicController rest controller.
 * 
 * @author samiksha.sant
 *
 */
public class SubTopicURIs {

	/**
	 * GET_ALL_TOPICS is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to get all topics.
	 */
	public static final String GET_ALL_TOPICS = "/topics";

	/**
	 * GET_ALL_COURSES is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to get all courses.
	 */
	public static final String GET_ALL_COURSES = "/courses";

	/**
	 * ADD_NEW_SUBTOPIC is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to add new record.
	 */
	public static final String ADD_NEW_SUBTOPIC = "/addsubtopic";

	/**
	 * GET_SUBTOPIC_BY_ID is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to get one subtopic
	 * record.
	 */
	public static final String GET_SUBTOPIC_BY_ID = "/getsubtopic/{id}";

	/**
	 * EDIT_SUBTOPIC is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to edit subtopic.
	 */
	public static final String EDIT_SUBTOPIC = "/updatesubtopic";

	/**
	 * GET_ALL_CRITERIA is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to get all the subtopics.
	 */
	public static final String GET_ALL_SUBTOPICS = "/allsubtopics";

	/**
	 * DELETE_SUBTOPIC is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to delete the subtopic.
	 */
	public static final String DELETE_SUBTOPIC = "/delete/{id}";
	/**
	 * GET_ALL_BATCHES is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to get list of batch.
	 */
	public static final String GET_ALL_BATCHES = "/allbatches";
	/**
	 * GET_ALL_SUBTOPIC_BY_BATCH_ID is a constant URI which a web browser will hit on the
	 * controller to further call the methods in order to get list of batch.
	 */
	public static final String GET_ALL_SUBTOPIC_BY_BATCH_ID = "/getSubTopicsByBatchId/{id}";
}
