package com.yash.tms.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.tms.dao.SubTopicDao;
import com.yash.tms.model.Batch;
import com.yash.tms.model.Course;
import com.yash.tms.model.SubTopic;
import com.yash.tms.model.Topic;
import com.yash.tms.service.SubTopicService;

/**
 * this class SubTopicServiceImpl is implementation of SubTopicService
 * 
 * @author samiksha.sant
 *
 */
@Service
public class SubTopicServiceImpl implements SubTopicService {
	/**
	 * subTopicDao is a reference to SubTopicDao interface and is used to call
	 * implemen
	 */
	@Autowired
	private SubTopicDao subTopicDao;

	/**
	 * this method is used to get all topic id.
	 */
	public List<Topic> getAllTopics() {
		return subTopicDao.getAllTopics();
	}

	/**
	 * this method returns all course id.
	 */
	public List<Course> getAllCourse() {
		return subTopicDao.getAllCourse();
	}

	/**
	 * this method provides service to add new subtopic.
	 */
	public void addSubTopic(SubTopic subTopic) {
		subTopicDao.addSubTopic(subTopic);

	}

	/**
	 * this method provides service to get existing subtopic from database
	 * belonging to an id.
	 */
	public SubTopic getSubTopicById(int id) {
		return subTopicDao.getSubTopicById(id);
	}

	public void updateSubTopic(SubTopic subTopic) {
		subTopicDao.editSubTopic(subTopic);

	}

	public List<SubTopic> getAllSubTopics() {
		return subTopicDao.getAllSubTopics();
	}

	public void deleteSubTopic(int id) {
		subTopicDao.deleteSubTopic(id);

	}

	public List<Batch> getAllBatches() {
		return subTopicDao.getAllBatches();
	}

	public List<SubTopic> getSubTopicsByBatchId(int batch_id) {
		return subTopicDao.getAllSubTopicByBatchId(batch_id);
	}

}
