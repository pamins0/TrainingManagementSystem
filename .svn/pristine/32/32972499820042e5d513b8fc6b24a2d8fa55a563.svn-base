package com.yash.tms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.tms.dao.QualificationDetailsDao;
import com.yash.tms.dao.QualificationStreamsDao;
import com.yash.tms.model.QualificationDetails;
import com.yash.tms.model.QualificationStreams;
import com.yash.tms.service.QualificationStreamsService;
/**
 * QualificationStreamsServiceImpl is the implementation of interface QualificationStreamsService.
 * 'QualificationStreamsService' is a service containing all the methods and business logic
 * required to perform operation on QualificationStreams object.
 * @author Sachin.jain
 *
 */
@Service
public class QualificationStreamsServiceImpl implements QualificationStreamsService {
	/**
	 * qualificationStreamsDao is an object of interface QualificationStreamsDao. 
	 * It calls the methods of repository in service.
	 */
	@Autowired
	private QualificationStreamsDao qualificationStreamsDao;
	/**
	 * qualificationDetailsDao is an object of interface QualificationDetailsDao. 
	 * It calls the methods of repository in service.
	 */
	@Autowired
	private QualificationDetailsDao qualificationDetailsDao;
	/**
	 * 'getAllStreams()' method calls repository's method to fetch QualificationStreams record in the database. 
	 * It returns list of QualificationStreams
	 */
	public List<QualificationStreams> getAllStreams() {
	return	qualificationStreamsDao.getAllStreams();
	
	}
	
	/**
	 * 'getCurrentStreams()' method is used to fetch QualificationStreams record and get all the streams of a particular employee in that order
	 * It returns list of QualificationStreams
	 */
	public List<QualificationStreams> getCurrentStreams(int employeeId) {
		QualificationStreams stream;
		
		List<QualificationStreams> streams=new ArrayList<QualificationStreams>() ;
		
		List<QualificationDetails> details=qualificationDetailsDao.getQualificationDetailsbyEmpId(employeeId);
		
		for (QualificationDetails detail : details) {
		stream=	(QualificationStreams) qualificationStreamsDao.getStreamByStreamId(detail.getStream_id());
		streams.add(stream);
		}
		
		return streams;
		
	}

}
