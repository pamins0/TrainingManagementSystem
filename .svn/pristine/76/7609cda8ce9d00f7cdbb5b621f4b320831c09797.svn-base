package com.yash.tms.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.tms.dao.QualificationDetailsDao;
import com.yash.tms.model.QualificationDetails;
import com.yash.tms.service.QualificationDetailsService;

/**
 * QualificationDetailsServiceImpl is the implementation of interface QualificationDetailsService.
 * 'QualificationDetailsService' is a service containing all the methods and business logic
 * required to perform operation on QualificationDetails object.
 * @author sachin.jain
 *
 */
@Service
public class QualificationDetailsServiceImpl implements QualificationDetailsService {
	
	@Autowired
	private QualificationDetailsDao qualificationDetailsDao;

	/**
	 * 'logger' is object of org.apache.log4j.Logger class. 
	 * This helps to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(QualificationDetailsServiceImpl.class);
	
	/**
	 * 'saveQualificationDetails()' method calls repository's method to save qualificationDetails record in the database. 
	 * It takes 'QualificationDetails' object as an input.
	 * @param qualificationDetails
	 */
	@Transactional
	public void saveQualificationDetails(QualificationDetails qualificationDetails) {
		logger.info("SERVICE: Saving QualificationDetails record..");
		qualificationDetailsDao.insertQualificationDetails(qualificationDetails);
	}
	
	/**
	 * 'getQualificationDetailsByEmpId()' method calls repository's method to fetch qualificationDetails record of a particular employee with given id from the database. 
	 * It takes employeeId as an input.
	 * @param employeeId
	 */
	@Transactional
	public List<QualificationDetails> getQualificationDetailsByEmpId(int employeeId) {
		return qualificationDetailsDao.getQualificationDetailsbyEmpId(employeeId);
	}
	
	/**
	 * 'deleteQualificationDetailById()' method calls repository's method to delete qualificationDetails record of with given id from the database. 
	 * It takes id as an input.
	 * @param id
	 */
	@Transactional
	public void deleteQualificationDetailById(int id) {
		qualificationDetailsDao.deleteQualificationDetailById(id);
		
	}
	
	/**
	 * 'updateQualificationDetails()' method calls repository's method to update qualificationDetails record which is passed as an argument to the database. 
	 * It takes updated qualificationDetails object as an input.
	 * @param qualificationDetails
	 */
	@Transactional
	public void updateQualificationDetails(QualificationDetails qualificationDetails) {
	qualificationDetailsDao.updateQualificationDetails(qualificationDetails);
		
	}

}
