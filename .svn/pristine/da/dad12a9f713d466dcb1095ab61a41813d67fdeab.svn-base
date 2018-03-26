package com.yash.tms.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.SubTopicDao;
import com.yash.tms.model.Batch;
import com.yash.tms.model.Course;
import com.yash.tms.model.SubTopic;
import com.yash.tms.model.Topic;
import com.yash.tms.serviceimpl.EmployeeBaselineServiceImpl;

/**
 * this class is the implementation for SubTopicDao interface.
 * 
 * @author samiksha.sant
 *
 */
@Repository
public class SubTopicDaoImpl implements SubTopicDao {
	/**
	 * hibernatetemplate is used to perform database operations using hibernate.
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;

	/**
	 * 'logger' is object of org.apache.log4j.Logger class. This helps to
	 * display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(EmployeeBaselineServiceImpl.class);

	/**
	 * this method is used to add new subtopic to database.
	 */
	@Transactional
	public void addSubTopic(SubTopic subTopic) {
		subTopic.setCreateddate(new Date());
		hibernateTemplate.save(subTopic);
	}

	/**
	 * this method returns list of topic id.
	 */
	public List<Topic> getAllTopics() {
		List<Topic> subTopics = hibernateTemplate.loadAll(Topic.class);

		return subTopics;
	}

	/**
	 * this method returns all course id.
	 */
	public List<Course> getAllCourse() {
		List<Course> courses = hibernateTemplate.loadAll(Course.class);

		return courses;
	}

	/**
	 * this method returns subtopic related to an id which is passed as an
	 * argument.
	 */
	public SubTopic getSubTopicById(int id) {
		List list = hibernateTemplate.find("from SubTopic where id=?", id);
		SubTopic subTopic = (SubTopic) list.get(0);
		return subTopic;
	}

	/**
	 * this method is used to update an existing subtopic entry in database.
	 */
	@Transactional
	public void editSubTopic(SubTopic subTopic) {

		subTopic.setCreateddate(new Date());
		hibernateTemplate.update(subTopic);

	}

	/**
	 * getAllSubTopics() method returns list of existing subtopics in database
	 */
	public List<SubTopic> getAllSubTopics() {
		List<SubTopic> subTopics = hibernateTemplate.loadAll(SubTopic.class);
		return subTopics;
	}

	/**
	 * deleteSubTopic(int id) method deletes existing subtopic from database.
	 */
	@Transactional
	public void deleteSubTopic(int id) {
		List subtopic = hibernateTemplate.find("from SubTopic where id=?", id);
		SubTopic st = (SubTopic) subtopic.get(0);
		logger.info(st);
		hibernateTemplate.delete(st);
	}

	/**
	 * this method returns list of all batches available in database.
	 */
	public List<Batch> getAllBatches() {
		return hibernateTemplate.loadAll(Batch.class);
	}

	/**
	 * this method returns list of all subtopics according to the batch_id
	 * subtopics belongs to.
	 */
	public List<SubTopic> getAllSubTopicByBatchId(int batch_id) {
		List listofsubtopicsByBatchId = hibernateTemplate.find("from SubTopic where batch_id=?", batch_id);
		List<SubTopic> subTopics = new ArrayList<SubTopic>();
		for (Object subtopicByBatchId : listofsubtopicsByBatchId) {
			subTopics.add((SubTopic) subtopicByBatchId);
		}
		return subTopics;
	}

}
