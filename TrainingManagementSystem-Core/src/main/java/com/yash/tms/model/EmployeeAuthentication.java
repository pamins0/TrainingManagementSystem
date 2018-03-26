package com.yash.tms.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Employee Authentication will be used to hold the emoloyee yash userid and
 * password provided at user authentication.
 * 
 * @author prashant.chauhan
 *
 */
public class EmployeeAuthentication {
	/**
	 * userid will hold yash email id of the employee.
	 */
	@Email
	@NotEmpty
	@Size(min=12, max=40)
	private String userid;
	/**
	 * password will hold yash password provided to the employee.
	 */
	@NotEmpty
	private String password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
