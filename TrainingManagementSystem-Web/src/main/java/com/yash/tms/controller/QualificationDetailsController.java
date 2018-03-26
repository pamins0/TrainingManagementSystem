package com.yash.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.QualificationDetails;
import com.yash.tms.model.QualificationStreams;
import com.yash.tms.restutil.QualificationDetailsURIs;
import com.yash.tms.service.QualificationDetailsService;
import com.yash.tms.service.QualificationStreamsService;

/**
 *  This controller handles all the request related to qualification detail
 * @author Sachin.jain
 *
 */
@CrossOrigin(origins="*")
@RestController
public class QualificationDetailsController {
	
	@Autowired
	QualificationDetailsService qualificationDetailsService;
	@Autowired
	QualificationStreamsService qualificationStreamsService;
	
	
	/**
	 * This controller method will consume QualificationDetails in JSON format and forward it
	 * to QualificationDetailsService to add new details of a trainee
	 * @param qualificationDetails
	 */
	@RequestMapping(value = QualificationDetailsURIs.ADD_QUALIFICATION_DETAILS, method = RequestMethod.POST)
	public void saveQualificationDetails(@RequestBody QualificationDetails qualificationDetails) {
		qualificationDetailsService.saveQualificationDetails(qualificationDetails);
	}
	
	
	/**
	 *This controller method will consume employeeId in JSON format and forward it
	 * to QualificationDetailsService to return details of a trainee with given employeeId	 
	 * @param employeeId
	 * @return
	 */
	@RequestMapping(value = QualificationDetailsURIs.GET_QUALIFICATION_DETAILS_BY_ID, method = RequestMethod.GET)
	public List<QualificationDetails> getQualificationDetailsByEmpId(@PathVariable("id") int employeeId) {
		return qualificationDetailsService.getQualificationDetailsByEmpId(employeeId);
	}
	
	/**
	 * This controller method will consume Id of QualificationDetail  and forward it
	 * to QualificationDetailsService to delete the details of a trainee with given qualification Id	 
	 * @param id
	 */
	@RequestMapping(value = QualificationDetailsURIs.DELETE_QUALIFICATION_DETAILS, method = RequestMethod.DELETE)
	public void deleteQualificationDetailsById(@PathVariable("id") int id) {
		 qualificationDetailsService.deleteQualificationDetailById(id);
	}
	
	/**
	 *  This controller method will call a method from QualificationStreamsService 
	 * which return all the streams available
	 * @return
	 */
	@RequestMapping(value = QualificationDetailsURIs.GET_STREAMS, method = RequestMethod.GET)
	public List<QualificationStreams> getAllStreams() {
		List<QualificationStreams> streams= qualificationStreamsService.getAllStreams();
		return streams;
	}

	/**
	 *This controller method will consume streamId in JSON format and forward it
	 * to QualificationStreamsService to return details of a stream with given streamId	 
	 * @param Id
	 * @return
	 */
	@RequestMapping(value = QualificationDetailsURIs.GET_STREAMS_BY_EMP_ID, method = RequestMethod.GET)
	public List<QualificationStreams> getStreamByStreamId(@PathVariable("id") int employeeId) {
		List<QualificationStreams> currentStreams= qualificationStreamsService.getCurrentStreams(employeeId);
		return currentStreams ;
	}
	
	/**
	 *This controller method will consumes updated QualificationDetails in JSON format and forward it
	 * to QualificationDetailsService to update details 	 
	 */
	@RequestMapping(value =QualificationDetailsURIs.UPDATE_QUALIFICATION_DETAILS, method = RequestMethod.PUT)
	public void updateQualificationDetails(@RequestBody QualificationDetails qualificationDetails) {
		qualificationDetailsService.updateQualificationDetails(qualificationDetails);
	}
	
	
	
	
}
