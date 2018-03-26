package com.yash.tms.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.tms.dao.TopicsDao;
import com.yash.tms.model.Topic;
import com.yash.tms.service.TopicService;
/**
 * /**
 * TopicServiceImpl is the implementation of interface TopicService.
 * 'TopicService' is a service containing all the methods and business logic
 * required to perform operation on Topic object.
 * @author Shweta.baberia
 *
 */
@Service
public class TopicServiceImpl implements TopicService {
	/**
	 * topicDaoImpl is an object of interface TopicsDao. 
	 * It calls the methods of repository in service.
	 */
	@Autowired
	TopicsDao topicDao;

	/**
	 * this logger will help us to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(TopicServiceImpl.class);
	
	/**
	 * 'getTopicsByCourseId()' method calls repository's method to get all  topics by course id from  database.
	 * It takes 'courseId' object as an input. 
	 * @param courseId
	 */
	public List<Topic> getTopicsByCourseId(int courseId) {
		logger.info("service get  topics by course id..");
		return topicDao.getTopicsByCourseId(courseId);
	}
   /**
	 * 'addTopic()' method calls repository's method to save topics in the database. 
	 * It takes 'topics' object as an input.
	 * @param topics
	 */
  
	public void addTopic(Topic topics) {
		logger.info("service add topics..");
		topicDao.insertTopics(topics);
		
	}
	/**
	 * 'editTopic()' method calls repository's method to update topics in the database. 
	 * It takes 'topics' object as an input.
	 * @param topics
	 */
	public void editTopic(Topic topic) {
		logger.info("service edit topics..");
		topicDao.updateTopic(topic);
		
	}
	/**
	 * 'removeTopic()' method calls repository's method to delete topics from  database. 
	 * It takes 'topics' object as an input.
	 * @param topics
	 */
	public void removeTopic(int topicid) {
		logger.info("service delete topics..");
		topicDao.deleteTopic(topicid);
		
	}
	/**
	 * 'getAllTopics()' method calls repository's method to get all  topics from  database. 
	 * 
	 */

	public List<Topic> getAllTopics() {
		logger.info("service get all topics..");
		return topicDao.getAllTopics();
	}
	/**
	 * 'getTopicsByBatchId()' method calls repository's method to get all  topics by batchId  from  database.
	 * It takes 'batchId' object as an input. 
	 * @param batchId
	 */
	public List<Topic> getTopicsByBatchId(int batchId) {
		logger.info("service get  topics by batch id..");
		return topicDao.getTopicsByBatchId(batchId);
		
	}

}
