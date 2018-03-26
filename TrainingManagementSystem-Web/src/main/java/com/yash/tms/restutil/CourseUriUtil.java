package com.yash.tms.restutil;

/**
 * 
 * this particular class is dedicated to supply uris to CourseConroller. 
 * @author Sawan.parmar
 *
 */
public class CourseUriUtil {
	
	/**
	 * This variable will provide uri for adding a new course.
	 */
	public static final String addNewCourse="/course";
	
	/**
	 * This variable will provide uri for getting all courses from database.	
	 */
	public static final String getAllCourse="/course";
	
	/**
	 * This variable will provide uri to get a course based on id.	
	 */
	public static final String getCoursebyBatchId= "/coursebybatch/{batch_id}";
	
	/**
	 * This variable will provide uri to delete course based on id.	
	 */
	public static final String deleteCourseById= "/course/{courseId}";
	
	/**
	 * This variable will provide uri to update a course based on id.	
	 */
	public static final String updateCourseById= "/course/{courseId}";
	
}