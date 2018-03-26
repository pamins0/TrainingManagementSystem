package com.yash.tms.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.tms.dao.SubTopicDao;
import com.yash.tms.daoimpl.SubTopicDaoImpl;
import com.yash.tms.model.Role;
import com.yash.tms.model.SubTopic;



public class SubTopicDaoTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		SubTopicDao subTopicDao = applicationContext.getBean("subTopicDaoImpl", SubTopicDaoImpl.class);
//		List<Integer> topics = subTopicDao.getAllTopics();
//		for (Integer topic : topics) {
//			System.out.println(topic);
//		}
		
//		List<Integer> courses=subTopicDao.getAllCourse();
//		for (Integer integer : courses) {
//			System.out.println(integer);
//		}
		
//		SubTopic subTopic=new SubTopic();
//		subTopic.setCreatedby(1);
//		subTopic.setModifiedby(1);
//		subTopic.setDuration(2);
//		subTopic.setActual_end_date(new Date());
//		subTopic.setActual_start_date(new Date());
//		subTopic.setCreateddate(new Date());
//		subTopic.setEstimated_end_date(new Date());
//		subTopic.setEstimated_start_date(new Date());
//		subTopic.setModifieddate(new Date());
//		subTopic.setName("new topic");
//		subTopic.setStatus(1);
//		subTopic.setTopic_id(2);
//		subTopicDao.addSubTopic(subTopic);
//	
		
		
	}

	
}
