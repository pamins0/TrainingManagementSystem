package com.yash.tms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Status will be used to represent the status of Employee.
 * 
 * @author prashant.chauhan
 *
 */
@Entity
@Table(name = "status")
public class Status {
	/**
	 * id will be used as primary key in DB entity 'status'
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	/**
	 * name will be used as the Employee status of. ie.active/inactive
	 */
	private String name;

	/**
	 * createddate is used to hold the date of creation of the status entity
	 * record.
	 */
	private Date createddate;
	/**
	 * modifieddate is used to hold the date of last modification of the status
	 * entity record.
	 */
	private Date modifieddate;
	/**
	 * createdby is used to hold the id of employee who have created the record.
	 */
	private int createdby;
	/**
	 * modifiedby is used to hold the id of employee who have last modified the
	 * record.
	 */
	private int modifiedby;

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
