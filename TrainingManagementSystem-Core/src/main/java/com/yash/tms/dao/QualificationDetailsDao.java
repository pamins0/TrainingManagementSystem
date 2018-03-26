package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.QualificationDetails;
/**
 * 'QualificationDetailsDao' is a interface containing only declarations of all the methods required to perform operation on QualificationDetails object.
 * @author Sachin.jain
 *
 */
public interface QualificationDetailsDao {
	/**
	 * 'insertQualificationDetails()' method saves an employee's qualificationdetails  record in the database. 
	 * It takes 'QualificationDetails' object as an input.
	 * @param qualificationDetails
	 */
	public void insertQualificationDetails(QualificationDetails qualificationDetails);
	/**
	 * 'getQualificationDetailsbyEmpId()' method fetch an employee's qualificationdetails  record from the database. 
	 * It takes 'employeeId' object as an input.
	 * @param employeeId
	 */
	public List<QualificationDetails> getQualificationDetailsbyEmpId(int employeeId);
	/**
	 * 'deleteQualificationDetailById()' method delete an employee's qualificationdetails  record from the database. 
	 * It takes 'Id' as an input and delete record based on the employeeId.
	 * @param employeeId
	 */
	public void deleteQualificationDetailById(int id);
	/**
	 * 'updateQualificationDetails()' method updates an employee's qualificationdetails  record to the database. 
	 * It takes 'qualificationDetails' as an input and update record based on the id.
	 * @param qualificationDetails
	 */
	public void updateQualificationDetails(QualificationDetails qualificationDetails);
}
