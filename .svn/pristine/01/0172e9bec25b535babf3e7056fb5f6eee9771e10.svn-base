package com.yash.tms.service;

import java.util.List;

import com.yash.tms.model.Batch;
import com.yash.tms.model.Course;
import com.yash.tms.model.SubTopic;
import com.yash.tms.model.Topic;

public interface SubTopicService {
	/**
	 * this method is used to add new subtopic
	 * 
	 * @param subTopic
	 */
	public void addSubTopic(SubTopic subTopic);

	/**
	 * this method is used to get all topic id.
	 * 
	 * @return
	 */
	public List<Topic> getAllTopics();

	/**
	 * this method is used to get all course id.
	 * @return
	 */
	public List<Course> getAllCourse();
	/**
	 * this method provides service of retrieving subtopic by id.
	 * @param id
	 * @return
	 */
	public SubTopic getSubTopicById(int id);
	/**
	 * this method provides service of updating an existing subtopic entry.
	 * @param subTopic
	 */
	public void updateSubTopic(SubTopic subTopic);
	/**
	 * getAllSubTopics() methods provides service of retrieving subtopics list.
	 * @return
	 */
	public List<SubTopic> getAllSubTopics();
	
	/**
	 *  deleteSubTopic(int id) method provides service of deleting subtopic according to id.
	 * @param id
	 */
	public void deleteSubTopic(int id);	
	/**
	 * getAllBatches() method provides service of retrieving batches list.
	 * @return
	 */
	public List<Batch> getAllBatches();
	/**
	 * getSubTopicsByBatchId(int batch_id) method provides service of retrieving subtopics by batch id.
	 */
	public List<SubTopic> getSubTopicsByBatchId(int batch_id);
}
