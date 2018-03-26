package com.yash.tms.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.Batch;
import com.yash.tms.model.Course;
import com.yash.tms.model.SubTopic;
import com.yash.tms.model.Topic;
import com.yash.tms.restutil.SubTopicURIs;
import com.yash.tms.service.SubTopicService;

/**
 * this class 'SubTopicController' is used as a rest controller to perform basic
 * crud operations.
 * 
 * @author samiksha.sant
 *
 */
@RestController
@CrossOrigin("*")
public class SubTopicController {

	/**
	 * service is a reference to SubTopicService which is autowired.
	 */
	@Autowired
	SubTopicService service;

	/**
	 * logger used to log all necessary log related info.
	 */
	private static Logger logger = Logger.getLogger(SubTopicController.class);

	/**
	 * this method is used to get all topic id with request method of type GET.
	 * 
	 * @return
	 */
	@RequestMapping(value = SubTopicURIs.GET_ALL_TOPICS, method = RequestMethod.GET)
	public List<Topic> getAllTopic() {
		logger.info("topic controller");

		return service.getAllTopics();
	}

	/**
	 * this method is used to get all course id with request method of type GET.
	 * 
	 * @return
	 */
	@RequestMapping(value = SubTopicURIs.GET_ALL_COURSES, method = RequestMethod.GET)

	public List<Course> getAllCourses() {
		logger.info("topic controller");
		return service.getAllCourse();
	}

	/**
	 * 'addSubTopic' method adds a new subtopic.
	 * 
	 * @param subTopic
	 */
	@RequestMapping(value = SubTopicURIs.ADD_NEW_SUBTOPIC, method = RequestMethod.POST)
	public void addSubTopic(@RequestBody SubTopic subTopic) {
		service.addSubTopic(subTopic);
	}

	/**
	 * this method retrieves existing subtopic belonging to an id. This method
	 * makes use of request method type get.
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = SubTopicURIs.GET_SUBTOPIC_BY_ID, method = RequestMethod.GET)
	public SubTopic getSubTopicById(@PathVariable int id) {
		return service.getSubTopicById(id);
	}

	/**
	 * this method is used to update existing subtopic, request method type is
	 * put.
	 * 
	 * @param subTopic
	 */
	@RequestMapping(value = SubTopicURIs.EDIT_SUBTOPIC, method = RequestMethod.PUT)
	public void updateSubTopic(@RequestBody SubTopic subTopic) {
		service.updateSubTopic(subTopic);
	}

	/**
	 * this method is used to get all existing subtopics, request method type is
	 * put.
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = SubTopicURIs.GET_ALL_SUBTOPICS, method = RequestMethod.GET)
	public List<SubTopic> getAllSubTopics() {
		return service.getAllSubTopics();
	}

	/**
	 * this method is used to delete existing subtopics, request method type is
	 * delete.
	 * 
	 * @param id
	 */
	@RequestMapping(value = SubTopicURIs.DELETE_SUBTOPIC, method = RequestMethod.DELETE)
	public void deleteSubTopic(@PathVariable int id) {
		service.deleteSubTopic(id);
	}

	/**
	 * this method is used to get all existing batches, request method type is
	 * get.
	 * 
	 * @return
	 */
	@RequestMapping(value = SubTopicURIs.GET_ALL_BATCHES, method = RequestMethod.GET)
	public List<Batch> getAllBatches() {
		return service.getAllBatches();
	}

	/**
	 * this method is used to get all existing subtopics by batch id, request
	 * method type is get.
	 * 
	 * @param batch_id
	 * @return
	 */
	@RequestMapping(value = SubTopicURIs.GET_ALL_SUBTOPIC_BY_BATCH_ID, method = RequestMethod.GET)
	public List<SubTopic> getAllSubTopicByBatchId(@PathVariable int batch_id) {
		return service.getSubTopicsByBatchId(batch_id);
	}

}
