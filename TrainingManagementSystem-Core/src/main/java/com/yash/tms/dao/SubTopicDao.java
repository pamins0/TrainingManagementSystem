package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.Batch;
import com.yash.tms.model.Course;
import com.yash.tms.model.SubTopic;
import com.yash.tms.model.Topic;

/**
 * this interface contains method declarations which will be used to perform
 * operations related to database.
 * 
 * @author samiksha.sant
 *
 */
public interface SubTopicDao {
	/**
	 * this method returns list of all the topicIds.
	 * 
	 * @return
	 */
	public List<Topic> getAllTopics();

	/**
	 * this method inserts new subtopic into the database.
	 */
	public void addSubTopic(SubTopic subTopic);

	/**
	 * this method returns list of courses.
	 * 
	 * @return
	 */
	public List<Course> getAllCourse();

	/**
	 * this method is used get SubTopic by id.
	 * 
	 * @param id
	 * @return
	 */
	public SubTopic getSubTopicById(int id);
	
	/**
	 * this method is used to edit any existing subtopic.
	 * @param subTopic
	 */
	public void editSubTopic(SubTopic subTopic);
	/**
	 * getAllSubTopics() method returns list of subtopics from database.
	 * @return
	 */
	public List<SubTopic> getAllSubTopics();
	
	/**
	 * deleteSubTopic() method deletes one entry from database
	 */
	public void  deleteSubTopic(int id);
	/**
	 * getAllBatches() method returns list of batches available in database.
	 * @return
	 */
	public List<Batch> getAllBatches();
	/**
	 * getAllSubTopicByBatchId(int batch_id) method list of subtopics belonging to a batch.
	 */
	public List<SubTopic> getAllSubTopicByBatchId(int batch_id);
	
}
