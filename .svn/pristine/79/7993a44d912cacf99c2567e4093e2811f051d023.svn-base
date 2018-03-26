package com.yash.tms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * this class contains stream cateogories 
 * which is used as a foreign key by qualification details table in database
 */
@Entity
@Table(name="qualification_stream")
public class QualificationStreams {

/**
* This is the auto-incremented primary key for qualification_stream table
* 
*/
@Id
@GeneratedValue
int id;
/**
 * This refers to the cateogories of the streams
 */
String stream;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
	

}
