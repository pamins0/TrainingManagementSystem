package com.yash.tms.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * this class will store the data before authentication
 * 
 * @author meghna.gajeshwar
 *
 */
public class EmployeeBeforeAuthentication {
	/**
	 * registered yash email_id of employee
	 */
	@NotEmpty
	@Email
	@Size(min=12, max=40)
	private String email_id;
	/**
	 * password of yash id
	 */
	@NotEmpty
	private String password;
	/**
	 * id of the batch in which employee is registered
	 */
	@NotNull
	private int batch_id;

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

}
