package com.yash.tms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 'EmployeeBaseline' is a plain old java object.
 * The attributes of this class are mapped in table 'employee_baselines' in database.
 * This stores values related to baselining process.
 * @author masoom.badkur
 *
 */
@Entity
@Table(name="employee_baselines")
public class EmployeeBaseline implements Serializable {
	/**
	 * 'id' is the primary key of the table. It is unique and auto incremented.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * 'employeeId' is the foreign key in this table. It is the primary key of 'employees' table.
	 */
	@Column(name="employee_id")
	private int employeeId;
	
	/**
	 * 'criteriaId' is the foreign key in this table. It is the primary key of 'baseline_criteria' table.
	 */
	@Column(name="criteria_id")
	private int criteriaId;
	
	/**
	 * 'rating' is the integer value. Rating is given to particular employee for particular criteria. 
	 */
	private int rating;
	
	/**
	 * 'remark' is text which trainer can write about employee on the basis of particular criteria.
	 */
	private String remark;
	
	/**
	 * 'createddate' is the date on which the a new baseline record is inserted. 
	 * This will be automatically updated.
	 */
	private Date createddate;
	
	/**
	 * 'modifieddate' is the date on which the a baseline record is updated. 
	 * This will be automatically updated when a record is updated.
	 */
	private Date modifieddate;
	
	/**
	 * 'createdby' hold the id of employee who creates baseline records.
	 */
	private int createdby;
	
	/**
	 * 'modifiedby' hold the id of employee who updates baseline records.
	 */
	private int modifiedby;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getCriteriaId() {
		return criteriaId;
	}

	public void setCriteriaId(int criteriaId) {
		this.criteriaId = criteriaId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

}
