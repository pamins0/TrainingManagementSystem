package com.yash.tms.test;

import java.util.Calendar;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.tms.daoimpl.BaselineCriteriaDaoImpl;
import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.service.BaselineCriteriaService;
import com.yash.tms.serviceimpl.BaselineCriteriaServiceImpl;

public class BaselineCriteriaServiceImplTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		BaselineCriteriaService baselineCriteriaService = applicationContext.getBean("baselineCriteriaServiceImpl",
				BaselineCriteriaServiceImpl.class);
//		BaselineCriteria baselineCriteria = new BaselineCriteria();       //test for adding the criteria
//		baselineCriteria.setName("technical skills");
//		baselineCriteria.setCreatedby(1);
//		baselineCriteria.setModifiedby(1);
//		baselineCriteria.setCreateddate(Calendar.getInstance().getTime());
//		baselineCriteria.setModifieddate(Calendar.getInstance().getTime());
//		baselineCriteriaService.insertBaselineCriteria(baselineCriteria);
		
		
		
		
		List<BaselineCriteria> list=baselineCriteriaService.getAllBaselineCriteria();          //test for iterating the list
		for (BaselineCriteria baselineCriteria : list) {
			System.out.println(baselineCriteria.getName());                        
		}
		
		
//		    BaselineCriteria baselineCriteria = new BaselineCriteria(); //test for editing the criteria
//		    baselineCriteria.setId(1);
//     		baselineCriteria.setName("project updated");
//     		baselineCriteria.setCreatedby(1);
//    		baselineCriteria.setModifiedby(1);
//    		baselineCriteria.setCreateddate(Calendar.getInstance().getTime());
//    		baselineCriteria.setModifieddate(Calendar.getInstance().getTime());
//     		baselineCriteriaService.modifyBaselineCriteria(baselineCriteria);
		
		

	}

}
