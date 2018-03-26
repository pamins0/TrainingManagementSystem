package com.yash.tms.test;

import java.util.Calendar;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Employee;
import com.yash.tms.model.EmployeeBaseline;
import com.yash.tms.service.EmployeeBaselineService;
import com.yash.tms.serviceimpl.EmployeeBaselineServiceImpl;

public class TestEmployeeBaselineServiceImpl {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		EmployeeBaselineService employeeBaselineService = applicationContext.getBean("employeeBaselineServiceImpl", EmployeeBaselineServiceImpl.class);
		
//		EmployeeBaseline employeeBaseline = new EmployeeBaseline();
//		employeeBaseline.setEmployeeId(7);
//		employeeBaseline.setCriteriaId(1);
//		employeeBaseline.setRating(4);
//		employeeBaseline.setRemark("Excellent");
//		employeeBaseline.setCreatedby(1);
//		employeeBaseline.setModifiedby(1);
//		employeeBaseline.setCreateddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
//		employeeBaseline.setModifieddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
//		
//		employeeBaselineService.saveEmployeeBaseline(employeeBaseline);
		
		
//		List<Employee> subscribers = employeeBaselineService.getAllSubscribers();
//		for (Employee employee : subscribers) {
//			System.out.println(employee.getFirstname());
//		}
		
		
//		List<BaselineCriteria> criteria = employeeBaselineService.getAllCriteria();
//		for (BaselineCriteria criterion : criteria) {
//			System.out.println(criterion.getName());
//		}
		
		
//		List<EmployeeBaseline> employeeBaselines = employeeBaselineService.getAllEmployeeBaseline();
//		for (EmployeeBaseline employeeBaseline : employeeBaselines) {
//			System.out.println(employeeBaseline.getRemark());
//		}
		
		
//		EmployeeBaseline employeeBaseline = new EmployeeBaseline();
//		employeeBaseline.setId(33);
//		employeeBaseline.setEmployeeId(7);
//		employeeBaseline.setCriteriaId(1);
//		employeeBaseline.setRating(4);
//		employeeBaseline.setRemark("good");
//		employeeBaseline.setCreatedby(1);
//		employeeBaseline.setModifiedby(1);
//		employeeBaseline.setCreateddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
//		employeeBaseline.setModifieddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
//		
//		employeeBaselineService.editEmployeeBaseline(employeeBaseline);
		
		EmployeeBaseline employeeBaseline = new EmployeeBaseline();
		employeeBaseline.setId(33);
		employeeBaseline.setEmployeeId(7);
		employeeBaseline.setCriteriaId(1);
		employeeBaseline.setRating(4);
		employeeBaseline.setRemark("good");
		employeeBaseline.setCreatedby(1);
		employeeBaseline.setModifiedby(1);
		employeeBaseline.setCreateddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		employeeBaseline.setModifieddate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		
		employeeBaselineService.removeEmployeeBaseline(employeeBaseline);
	}

}
