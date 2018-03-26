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
 * Resource represents the employees which are already registered and to update their role and batch
 * or to add new resource and register in employee
 * @author megha.dengre
 *
 */
@Entity
@Table(name="resources")
public class Resource {
	
	/**
	 * id is the auto-generated primary-key
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * employee_id is a foreign-key from employees table 
	 */
	private int employee_id;
	
	/**
	 * contribution time in hours
	 */
	private double contribution_time;
	/**
	 * createdby is used to hold the id of employee who have created the record.
	 */
	private int createdby;
	/**
	 * modifiedby is used to hold the id of employee who have last modified the
	 * record.
	 */

	private int modifiedby;
	/**
	 * createddate is used to hold the date of creation of the employee entity
	 * record.
	 */
	@Temporal(TemporalType.DATE)
	private Date createddate;
	/**
	 * modifieddate is used to hold the date of last modification of the
	 * employee entity record.
	 */
	@Temporal(TemporalType.DATE)
	private Date modifieddate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	
	public double getContribution_time() {
		return contribution_time;
	}
	public void setContribution_time(double contribution_time) {
		this.contribution_time = contribution_time;
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
