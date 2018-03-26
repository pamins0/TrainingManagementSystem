package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.Topic;
/**
 * This is an interface of Topic in which we will perform following operation
 * 1: insert topic
 * 2: update topic
 * 3: delete topic
 * 4: get all topics by course id
 * @author Shweta.baberia
 *
 */
public interface TopicsDao {
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
	public void insertTopics(Topic topics);
	/**
	 * this method  will update topic that already exist in database 
	 * @param topic
	 * 
	 */
	public void updateTopic(Topic topic);
	/**
	 * this method  will delete topic that already exist in database 
	 * @param topic
	 * 
	 */
	public void deleteTopic(int topicid);
	/**
	 * this method will return all topics present in the database
	 * @param courseId
	 * @return
	 */
	public List<Topic> getAllTopics();
	

}
