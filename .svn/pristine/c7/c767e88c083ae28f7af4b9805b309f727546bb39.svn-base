package com.yash.tms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="baseline_criteria")
public class BaselineCriteria implements Serializable {
	
	/**
	 * 'id' is the primary key of the table. It is unique and auto incremented.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * 'name' holds the name of the criteria.
	 */
	private String name;
	
	/**
	 * 'max_rating' holds the maximum rating which can be given for the particular criteria.
	 */
	private int max_rating;
	
	/**
	 * 'min_rating' holds the minimum rating which can be given for the particular criteria.
	 */
	private int min_rating;
	
	/**
	 * 'createddate' is the date on which the a new criteria is inserted. 
	 * This will be automatically updated.
	 */
	private Date createddate;
	
	/**
	 * 'modifieddate' is the date on which the a criteria is updated. 
	 * This will be automatically updated when a record is updated.
	 */
	private Date modifieddate;
	
	/**
	 * 'createdby' hold the id of employee who creates criteria.
	 */
	private int createdby;
	
	/**
	 * 'modifiedby' hold the id of employee who updates criteria.
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

	public int getMax_rating() {
		return max_rating;
	}

	public void setMax_rating(int max_rating) {
		this.max_rating = max_rating;
	}

	public int getMin_rating() {
		return min_rating;
	}

	public void setMin_rating(int min_rating) {
		this.min_rating = min_rating;
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
