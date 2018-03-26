package com.yash.tms.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * This class is a plane java object  of Topic 
 * 'topics' table will be created in database and this Topic class will refer  that 'topics' table in database
 * 
 * @author Shweta.baberia
 *
 */
@Entity
@Table(name = "topics")
public class Topic {
	/**
	 * this is unique id for stopic.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	/**
	 * this is topic name.
	 */
	private String name;
	/**
	 * this is batch_id is a foreign key which is primary key in Batch Model
	 */
	private int batch_id;
	/**
	 * this is courseId is a foreign key which is primary key in Course Model
	 */
	private int course_id;
	

	/**
	 * this is used to show the duration a topic will take.
	 */
	private int duration;
	/**
	 * status signifies the status of the topic. It can be completed, started,
	 * pending.
	 */
	private int status;
	/**
	 * planned start date of the topic.
	 */
	private Date estimated_start_date;
	/**
	 * planned end date of the topic.
	 */
	private Date estimated_end_date;
	/**
	 * actual start date of the topic.
	 */
	private Date actual_start_date;
	/**
	 * actual end date of the topic.
	 */
	private Date actual_end_date;
	/**
	 * integer of createdby represents employeeid who created this topic
	 */
	private int createdby;
	/**
	 * integer of modifiedby represents employeeid who modified this topic
	 */
	private int modifiedby;
	/**
	 * created date of the topic.
	 */
	private Date createddate;
	/**
	 * modified date of the topic.
	 */

	private Date modifieddate;
	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

}
