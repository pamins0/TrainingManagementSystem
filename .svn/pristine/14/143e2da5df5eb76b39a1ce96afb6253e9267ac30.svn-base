package com.yash.tms.service;

import java.util.List;

import com.yash.tms.model.QualificationDetails;

/**
 *  'QualificationDetailsService' is a service containing all the methods and business logic
 *  required to perform operation on QualificationDetails object.
 * @author Sachin.jain
 *
 */
public interface QualificationDetailsService {
	/**
	 *  'saveQualificationDetails()' method calls repository's method to save QualificationDetails record in the database. 
	 * It takes 'QualificationDetails' object as an input.
	 * @param qualificationDetails
	 */
	public void saveQualificationDetails(QualificationDetails qualificationDetails);
	/**
	 *  'getQualificationDetailsByEmpId()' method calls repository's method to get  record from the database. 
	 * It takes employeeId as an input and return a list of details.
	 * @param employeeId
	 */
	public List<QualificationDetails> getQualificationDetailsByEmpId(int employeeId);
	/**
	 *  'deleteQualificationDetailById()' method calls repository's method to delete qualificationDetails record from the database. 
	 * It takes id as an input.
	 * @param id
	 */
	public void deleteQualificationDetailById(int id);
	/**
	 *  'updateQualificationDetails()' method calls repository's method to update qualificationDetails record to the database. 
	 * It takes updated qualificationDetails as an input
	 * @param qualificationDetails
	 */
	public void updateQualificationDetails(QualificationDetails qualificationDetails);
}
