package com.yash.tms.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.Topic;
import com.yash.tms.restutil.TopicURIs;
import com.yash.tms.service.TopicService;
/**
 * All the request regarding topic will be handled here
 * @author Shweta.baberia
 *
 */
@RestController
@CrossOrigin(origins="*")
public class TopicController {
	/**
	 * topicService is an object of interface TopicService it is used to call the service method
	 * .
	 */
	@Autowired
	TopicService topicService;

	/**
	 * this logger will help us to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(TopicController.class);
	
	/**
	 * ADD_TOPICS is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 */
	@RequestMapping(value=TopicURIs.ADD_TOPIC, method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		logger.info("controller add topics..");
		topicService.addTopic(topic);
		
	}
	/**
	 * GET_ALL_TOPICS is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 * @return
	 */
	@RequestMapping(value=TopicURIs.GET_ALL_TOPICS,method=RequestMethod.GET)
	public List<Topic> getAllTopics(){
		logger.info("controller get all topics..");
		return topicService.getAllTopics();
		
	}
	/**
	 * deleteTopic() maps the DELETE request from the web client. 
	 * It deletes topic record by calling service's method.
	 * @param topic
	 * DELETE_TOPIC is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 */
	@RequestMapping(value=TopicURIs.DELETE_TOPIC,method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable int id){
		logger.info("controller delete topics..");
		topicService.removeTopic(id);
	}
	/**
	 * editBatch() maps the edit request from the web client. 
	 * It deletes topic record by calling service's method.
	 * @param topic
	 * EDIT_TOPIC is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 */
	@RequestMapping(value=TopicURIs.EDIT_TOPIC,method = RequestMethod.PUT)
	public void editBatch(@RequestBody Topic topic){
		logger.info("controller edit topics..");
		topicService.editTopic(topic);
	}
	/**getAllTopicsByCourseId() maps the getAllTopicsByCourseId request from the web client. 
	 * It deletes topic record by calling service's method.
	 *  @param id
	 * GET_TOPICS_BY_COURSE_ID is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 * 
	 *
	 * @return
	 */
	@RequestMapping(value=TopicURIs.GET_TOPICS_BY_COURSE_ID,method=RequestMethod.GET)
	public List<Topic> getAllTopicsByCourseId(@PathVariable int id){
		//logger.info("controller get topics by course id..");
		System.out.println("controller get topics by course id..");
		return topicService.getTopicsByCourseId(id);
		
	}
	
	/**getAllTopicsByCourseId() maps the getAllTopicsByCourseId request from the web client. 
	 * It deletes topic record by calling service's method.
	 *  @param id
	 * GET_TOPICS_BY_COURSE_ID is a constant URI which a web browser will hit on the controller 
	 * to further call the methods in order to add new record.
	 * 
	 *
	 * @return
	 */
	@RequestMapping(value=TopicURIs.GET_TOPICS_BY_BATCH_ID,method=RequestMethod.GET)
	public List<Topic> getAllTopicsByBatchId(@PathVariable int id){
		//logger.info("controller get topics by course id..");
		System.out.println("controller get topics by batch id..");
		return topicService.getTopicsByBatchId(id);
		
	}
	
	
	

}
