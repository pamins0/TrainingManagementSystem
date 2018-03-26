package com.yash.tms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * this class contain qualification details of a trainee  
 *
 */
@Entity
@Table(name="qualification_details")
public class QualificationDetails {

/**
* This is the auto-incremented primary key for qualification_details table
* 
*/
@Id
@GeneratedValue
int id;
/**
 * 'employeeId' is the foreign key in this table. It is the primary key of 'employees' table.
 */
int employee_id;
/**
 * 'stream_Id' is the foreign key in this table. It is the primary key of 'employees' table.
 */
int stream_id;
/**
 * this field contains institute of reffered stream
 */
String institute;
/**
 * this feild contains percentage acquired in particular stream
 */
double percentage;
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
public int getStream_id() {
	return stream_id;
}
public void setStream_id(int stream_id) {
	this.stream_id = stream_id;
}
public String getInstitute() {
	return institute;
}
public void setInstitute(String institute) {
	this.institute = institute;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}

	

}
