package com.yash.tms.service;

import java.util.List;

import com.yash.tms.model.Topic;
/**
 *   'TopicService' is a service containing all the methods and business logic
 *  
 * @author Shweta.baberia
 *
 */
public interface TopicService {
	/**
	 * this method will return topics of particular course(by course id)
	 * @param courseId
	 * @return
	 */
	public List<Topic> getTopicsByCourseId(int courseId);
	/**
	 * this method will return topics of particular batch(by batch id)
	 * @param batchId
	 * @return
	 */
	public List<Topic> getTopicsByBatchId(int batchId);
	/**
	 * this method will insert topic into database
	 * @param topics
	 */
	public void addTopic(Topic topics);
	/**
	 * this method  will update topic that already exist in database 
	 * @param topic
	 * 
	 */
	public void editTopic(Topic topic);
	/**
	 * this method  will delete topic that already exist in database 
	 * @param topic
	 * 
	 */
	public void removeTopic(int topicid);
	/**
	 * this method will return all topics present in the database
	 * @param
	 * @return
	 */
	public List<Topic> getAllTopics();
	

	

}
