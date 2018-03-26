package com.yash.tms.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.tms.dao.EmployeeBaselineDao;
import com.yash.tms.dao.TopicsDao;
import com.yash.tms.daoimpl.EmployeeBaselineDaoImpl;
import com.yash.tms.model.Topic;

public class TestTopicImpl {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		TopicsDao TopicsDao = applicationContext.getBean("topicDaoImpl", TopicsDao.class);
		Topic topic = new Topic();
		// TEST TO INSERT TOPIC INTO DATABASE
		/*
		 * topic.setName("encapsulation"); topic.setDuration(1);
		 * topic.setActual_end_date(new Date()); topic.setActual_start_date(new
		 * Date()); topic.setCourse_id(40); topic.setCreatedby(1);
		 * topic.setCreateddate(new Date()); topic.setEstimated_end_date(new
		 * Date()); topic.setModifiedby(0); topic.setStatus(0);
		 * topic.setModifieddate(new Date()); topic.setEstimated_start_date(new
		 * Date()); TopicsDao.insertTopics(topic);
		 */
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TEST TO UPDATE TOPIC INTO DATABASE
		/*
		 * topic.setId(54); topic.setName("Inheritance"); topic.setDuration(1);
		 * topic.setActual_end_date(new Date()); topic.setActual_start_date(new
		 * Date()); topic.setCourse_id(40); topic.setCreatedby(1);
		 * topic.setCreateddate(new Date()); topic.setEstimated_end_date(new
		 * Date()); topic.setModifiedby(0); topic.setStatus(0);
		 * topic.setModifieddate(new Date()); topic.setEstimated_start_date(new
		 * Date()); TopicsDao.updateTopic(topic);
		 */

		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TEST TO DELETE EXISTING TOPIC FROM DATABASE

		// topic.setId(55);
		// TopicsDao.deleteTopic(topic);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TEST TO LIST TOPIC BY COURSE ID FROM DATABASE
		/*
		 * List<Topic> topics = TopicsDao.getTopicsByCourseId(40); for (Topic
		 * topic2 : topics) { System.out.println(topic2.getName()); }
		 */

		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TEST TO LIST ALL TOPICS
		// List<Topic> topics = TopicsDao.getAllTopics();
		// for (Topic topic2 : topics) {
		// System.out.println(topic2.getName());
		// }

	}

}
