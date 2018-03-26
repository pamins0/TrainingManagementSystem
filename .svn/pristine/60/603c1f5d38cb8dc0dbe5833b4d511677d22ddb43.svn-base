package com.yash.tms.test;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.tms.dao.EmployeeBaselineDao;
import com.yash.tms.daoimpl.BaselineCriteriaDaoImpl;
import com.yash.tms.daoimpl.EmployeeBaselineDaoImpl;
import com.yash.tms.model.BaselineCriteria;

public class BaselineCriteriaDaoImplTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		BaselineCriteriaDaoImpl baselineCriteriaDao = applicationContext.getBean("baselineCriteriaDaoImpl", BaselineCriteriaDaoImpl.class);
		BaselineCriteria baselineCriteria=new BaselineCriteria();
		baselineCriteria.setName("technical skills");
		baselineCriteria.setCreatedby(1);
		baselineCriteria.setModifiedby(1);
		baselineCriteria.setCreateddate(Calendar.getInstance().getTime());
		baselineCriteria.setModifieddate(Calendar.getInstance().getTime());
		//BaselineCriteriaDaoImpl baselineCriteriaDaoImpl=new BaselineCriteriaDaoImpl();
		baselineCriteriaDao.addBaselineCriteria(baselineCriteria);
		

	}

}
