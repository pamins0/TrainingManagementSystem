package com.yash.tms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Every Employee will belong to a batch
 * This refers to batches table in DB
 * @author Rajat.gupta
 *
 */
@Entity
@Table(name="batches")
public class Batch {
	/**
	 * This is the auto-incremented primary key for batch table
	 */
	@Id
	@GeneratedValue
	private int id;
	/**
	 * This refers to the name of the batch
	 */
	private String name;
	/**
	 * This refers to status of the batch that is
	 * 1 for Active
	 * 2 for InActive
	 * Default is Active
	 */
	private int status;
	/**
	 * This field refers to the Employee who created the batch
	 */
	private int createdby;
	/**
	 * This field refers to the Employee who updated the batch
	 */
	private int modifiedby;
	/**
	 * This field refers when was the batch created
	 */
	private Date createddate;
	/**
	 * This field refers when was the batch modified 
	 */
	private Date modifieddate;

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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
