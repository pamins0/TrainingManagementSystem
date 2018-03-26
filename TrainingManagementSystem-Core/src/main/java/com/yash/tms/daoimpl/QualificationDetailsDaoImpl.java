package com.yash.tms.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.QualificationDetailsDao;
import com.yash.tms.model.QualificationDetails;
/**
 *  'QualificationDetailsDaoImpl' is the implementation of 'QualificationDetailsDao' interface.
 * This class gives definition of all the methods declared in interface QualificationDetailsDao.
 * 'QualificationDetailsDaoImpl' is a repository containing all the methods required to perform operation on QualificationDetails object.
 * @author Sachin.jain
 *
 */
@Repository
public class QualificationDetailsDaoImpl implements QualificationDetailsDao {
	/**
	 * 'hibernateTemplate' is the object of class HibernateTemplate which is a predefined class of Spring.
	 * HibernateTemplate is configured in dispatcher-servlet.xml.
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	/**
	 * 'logger' is object of org.apache.log4j.Logger class. This helps to display data on server's console.
	 */
	private static Logger logger = Logger.getLogger(QualificationDetailsDaoImpl.class);
	/**
	 * 'insertQualificationDetails()' method saves an employee qualification detail record in the database. 
	 * It takes 'QualificationDetails' object as an input.
	 * @param qualificationDetails
	 */
	@Transactional
	public void insertQualificationDetails(QualificationDetails qualificationDetails) {
		logger.info("REPOSITORY: Inserting Qualification-Details record..");
		hibernateTemplate.save(qualificationDetails);
	}
	
	/**
	 * 'getQualificationDetailsbyEmpId()' method fetch an employee's qualificationdetails  record from the database. 
	 * It takes 'employeeId' object as an input.
	 * @param employeeId
	 */
	public List<QualificationDetails> getQualificationDetailsbyEmpId(int employeeId) {
		List<QualificationDetails>  details=(List<QualificationDetails>) hibernateTemplate.find("from QualificationDetails where employee_id=?", employeeId);
		return details;
	}
	/**
	 * 'deleteQualificationDetailById()' method delete an employee's qualificationdetails  record from the database. 
	 * It takes 'Id' as an input and delete record based on the employeeId.
	 * @param employeeId
	 */
	public void deleteQualificationDetailById(int id) {
		hibernateTemplate.bulkUpdate("delete from QualificationDetails where id=?", id);
	}
	/**
	 * 'updateQualificationDetails()' method updates an employee's qualificationdetails  record to the database. 
	 * It takes 'qualificationDetails' as an input and update record based on the id.
	 * @param qualificationDetails
	 */
	public void updateQualificationDetails(QualificationDetails qualificationDetails) {
		hibernateTemplate.update(qualificationDetails);
	}

}
