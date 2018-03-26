
package com.yash.tms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Employee table will be used to refer the employees entity in DB.
 * 
 * @author prashant.chauhan
 *
 */
@Entity
@Table(name = "employees")
public class Employee {
	/**
	 * id will be used as a primary key in the employees table used for fetching
	 * employee.
	 */
	@Id
	@GeneratedValue
	private int id;
	/**
	 * firstname will be used as First name of Employee.
	 */
	@Size(min=3, max=25)
	@NotEmpty(message="please enter valid name")
	private String firstname;
	/**
	 * lastname will be used as Last name of Employee.
	 */
	@Size(min=3, max=25)
	@NotEmpty(message="please enter valid name")
	private String lastname;
	/**
	 * role_id be used as id of role entity and it defines the role of the
	 * employee,it is foreign key.
	 */
	@NotNull(message="invalid role id")
	private int role_id;
	/**
	 * email_id is a yash email id and it is unique.
	 */
	@Email
	@NotEmpty(message="invalid email_id")
	@Size(min=12, max=40)
	private String email_id;
	/**
	 * batch_id be used as id of batch entity and it defines the batch of the
	 * employee,it is foreign key.
	 */
	@NotNull(message="invalid batch_id")
	private int batch_id;
	/**
	 * status_id be used as id of status entity and it defines the
	 * status(active/inactive) of the employee,it is foreign key.
	 */
	@NotNull(message="invalid status_id")
	private int status_id;
	/**
	 * createdby is used to hold the id of employee who have created the record.
	 */
	@NotNull
	private int createdby;
	/**
	 * modifiedby is used to hold the id of employee who have last modified the
	 * record.
	 */
	@NotNull
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
	
	/***
	 * image_path is used to hold the file path of the user profile.
	 */
	private String image_path;

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
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