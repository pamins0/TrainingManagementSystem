package com.yash.tms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * this class SubTopic is used to add and update subtopic corresponding to its
 * topic and course.
 * 
 * @author samiksha.sant
 *
 */
@Entity
@Table(name = "sub_topics")
public class SubTopic {
	/**
	 * this is unique id for subtopic.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	/**
	 * this is dummy topicid, which signifies which topic this subtopic belongs
	 * to.
	 */
	private int topic_id;

	/**
	 * this is subtopic name.
	 */
	private String name;
	/**
	 * status signifies the status of the subtopic. It can be completed,
	 * started, pending.
	 */
	private int status;
	/**
	 * this is used to show the duration a subtopic will take.
	 */
	private int duration;
	/**
	 * planned start date of the subtopic.
	 */
	private Date estimated_start_date;
	/**
	 * planned end date of the subtopic.
	 */
	private Date estimated_end_date;
	/**
	 * actual start date of the subtopic.
	 */
	private Date actual_start_date;
	/**
	 * actual end date of the subtopic.
	 */
	private Date actual_end_date;
	/**
	 * integer of createdby represents employeeid who created this subtopic
	 */
	private int createdby;
	/**
	 * integer of modifiedby represents employeeid who modified this subtopic
	 */
	private int modifiedby;
	/**
	 * created date of the subtopic.
	 */
	private Date createddate;
	/**
	 * modified date of the subtopic.
	 */
	@Temporal(TemporalType.DATE)
	private Date modifieddate;
	/**
	 * course id refers to the course this subtopic and topic belongs to.
	 */
	private int course_id;
/**
 * batch_id referes to the batch to which this subtopic belongs to.
 */
	private int batch_id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getActual_start_date() {
		return actual_start_date;
	}

	public void setActual_start_date(Date actual_start_date) {
		this.actual_start_date = actual_start_date;
	}

	public Date getActual_end_date() {
		return actual_end_date;
	}

	public void setActual_end_date(Date actual_end_date) {
		this.actual_end_date = actual_end_date;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEstimated_start_date() {
		return estimated_start_date;
	}

	public void setEstimated_start_date(Date estimated_start_date) {
		this.estimated_start_date = estimated_start_date;
	}

	public Date getEstimated_end_date() {
		return estimated_end_date;
	}

	public void setEstimated_end_date(Date estimated_end_date) {
		this.estimated_end_date = estimated_end_date;
	}

	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	public int getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	
}
