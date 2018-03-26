package com.yash.tms.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.yash.tms.model.SubTopic;
import com.yash.tms.service.SubTopicService;
import com.yash.tms.serviceimpl.SubTopicServiceImpl;

public class SubTopicServiceImplTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		SubTopicService service = applicationContext.getBean("subTopicServiceImpl", SubTopicServiceImpl.class);
		SubTopic subTopic=new SubTopic();
		subTopic.setId(55);
		subTopic.setCreatedby(1);
		subTopic.setModifiedby(1);
		subTopic.setDuration(2);
		subTopic.setActual_end_date(new Date());
		subTopic.setActual_start_date(new Date());
		subTopic.setCreateddate(new Date());
		subTopic.setEstimated_end_date(new Date());
		subTopic.setEstimated_start_date(new Date());
		subTopic.setModifieddate(new Date());
		subTopic.setName("new re");
		subTopic.setStatus(1);
		subTopic.setTopic_id(2);
		service.updateSubTopic(subTopic);
		

	}
}
