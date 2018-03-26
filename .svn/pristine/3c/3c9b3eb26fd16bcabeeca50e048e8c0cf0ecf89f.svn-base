package com.yash.tms.test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.tms.dao.EmployeeBaselineDao;
import com.yash.tms.daoimpl.EmployeeBaselineDaoImpl;
import com.yash.tms.model.EmployeeBaseline;

public class TestEmployeeBaselineDaoImpl {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		EmployeeBaselineDao employeeBaselineDao = applicationContext.getBean("employeeBaselineDaoImpl", EmployeeBaselineDaoImpl.class);
		
		EmployeeBaseline employeeBaseline = new EmployeeBaseline();
		employeeBaseline.setEmployeeId(7);
		employeeBaseline.setCriteriaId(1);
		employeeBaseline.setRating(4);
		employeeBaseline.setRemark("Excellent");
		employeeBaseline.setCreatedby(1);
		employeeBaseline.setModifiedby(1);
		employeeBaseline.setCreateddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		employeeBaseline.setModifieddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		
		employeeBaselineDao.insertEmployeeBaseline(employeeBaseline);
	}

}
