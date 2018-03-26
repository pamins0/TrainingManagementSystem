package com.yash.tms.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.tms.dao.TopicsDao;
import com.yash.tms.model.Topic;

/**
 * 'TopicDaoImpl' is the implementation of 'TopicDao' interface. This class
 * gives definition of all the methods declared in interface TopicDao.
 * 
 * @author Shweta.baberia
 *
 */
@Repository
public class TopicDaoImpl implements TopicsDao {
	/**
	 * 'hibernateTemplate' is the object of class HibernateTemplate and it is
	 * configured in dispatcher-servlet.xml.
	 * 
	 */
	@Autowired
	HibernateTemplate template;
	/**
	 * 'logger' is object of org.apache.log4j.Logger class. This helps to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(EmployeeBaselineDaoImpl.class);

	/**
	 * 'getTopicsByCourseId()' method retrieve all the topics of that course
	 * from database. It takes 'courseId' as an input.
	 * 
	 * @param courseId
	 */
	@Transactional
	public List<Topic> getTopicsByCourseId(int courseId) {
		logger.info("dao get  topics by course id..");

		return (List<Topic>) template.find("from Topic where course_id=?", courseId);
	}

	/**
	 *
	 * 'insertTopics()' method saves an topic in the database. It takes 'Topic'
	 * object as an input.
	 * 
	 * @param topics
	 */

	@Transactional
	public void insertTopics(Topic topics) {
		logger.info("dao insert  topics..");
		template.save(topics);

	}

	/**
	 * 'updateTopic()' method will update the topic from database. It takes
	 * 'topic' object as an input.
	 * 
	 * @param topic
	 */
	@Transactional
	public void updateTopic(Topic topic) {
		logger.info("dao update  topic.");
		template.update(topic);
	}

	/**
	 * 'deleteTopic()' method will delete the particular topic from database. It
	 * takes 'topic' object as an input.
	 * 
	 * @param topic
	 */

	@Transactional
	public void deleteTopic(int topicid) {
	List topic=template.find("from Topic where id=?", topicid);
		Topic top=(Topic) topic.get(0);
         template.delete(top);
	}

	/**
	 * 'getAllTopics()' method will return all the topics from database.
	 * 
	 */

	public List<Topic> getAllTopics() {
		logger.info("dao get   all topics ..");

		return template.loadAll(Topic.class);

	}
	
	/**
	 * 'getTopicsByCourseId()' method retrieve all the topics of that course
	 * from database. It takes 'courseId' as an input.
	 * 
	 * @param courseId
	 */
    @Transactional
	public List<Topic> getTopicsByBatchId(int batchId) {
    	logger.info("dao get  topics by batch id..");

		return (List<Topic>) template.find("from Topic where batch_id=?", batchId);
		
	}

}
