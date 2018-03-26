/**
 * 
 */
package com.yash.tms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class contains the information related course and their getters and setters.
 * @author Sawan.parmar
 *
 */

@Entity
@Table(name="courses")
public class Course {

	/**
	 * This id is auto generated primary key for course table.
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * This refers to the name of course.
	 */
	private String name;
	
	/**
	 * This defines the version of course.
	 */
	private float version;
	
	/**
	 * This refers to the duration of course completion(in days).
	 */
	@Column(name="duration_days")
	private int durationInDays;
	
	/**
	 * This refers to the duration of course completion(in weeks).
	 */
	@Column(name="duration_weeks")
	private double durationInWeeks;
	/**
	 * This refers to the trainer who created the course.
	 */
	private int createdBy;
	
	/**
	 * This refers to the trainer who modified the course.
	 */
	private int modifiedBy;
	
	/**
	 * This field refers the created date of course.
	 */
	private Date createdDate;
	
	/**
	 * This field refers the modified date of course.
	 */
	private Date modifiedDate;
	
	/**
	 * This refers to the planned starting date of course.
	 */
	@Column(name="estimated_start_date")
	private Date estimatedStartDate;
	
	/**
	 * This refers to the planned ending date of course.
	 */
	@Column(name="estimated_end_date")
	private Date estimatedEndDate;
	
	/**
	 * This refers to the actual start date of course.
	 */
	@Column(name="actual_start_date")
	private Date actualStartDate;
	
	/**
	 * This refers to the actual end date of course.
	 */
	
	@Column(name="actual_end_date")
	private Date actualEndDate;
	
	/**
	 * This refers to the status of the course.
	 * 0. Pending
	 * 1. Completed
	 */
	private int status;
	
	/**
	 * this field refers to the batch for which course is planned.
	 */
	private int batch_id;
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
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public double getDurationInWeeks() {
		return durationInWeeks;
	}
	public void setDurationInWeeks(double durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Date getEstimatedStartDate() {
		return estimatedStartDate;
	}
	public void setEstimatedStartDate(Date estimatedStartDate) {
		this.estimatedStartDate = estimatedStartDate;
	}
	public Date getEstimatedEndDate() {
		return estimatedEndDate;
	}
	public void setEstimatedEndDate(Date estimatedEndDate) {
		this.estimatedEndDate = estimatedEndDate;
	}
	public Date getActualStartDate() {
		return actualStartDate;
	}
	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}
	public Date getActualEndDate() {
		return actualEndDate;
	}
	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
