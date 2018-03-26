package com.yash.tms.service;

import java.util.List;

import com.yash.tms.model.Course;

/**
 * 
 * This interface is a contract between CourseService and CourseServicesImpl and this interface contains method declarations to serve CourseServiceImpl. 
 * @author Sawan.parmar
 *
 */
public interface CourseService {
	/**
	 * This method will be used to call CourseDao method to add new course.
	 * @param course
	 */
	public Course addNewCourse(Course course);
	
	/**
	 * This method will return list of all available courses.	
	 * @return
	 */
	public List<Course> getAllCourse();
	/**
	 * this method will return all the courses for a dedicated batch.
	 * @param batch_id
	 * @return
	 */
	public List<Course> getCoursByBatch(int batch_id);
	
	/**
	 * This method will be used to delete course by its id.
	 * @param courseId
	 */
	public void deleteCourseById(int courseId);
	
	/**
	 * This method will be used to update particular course by its id.  
	 * @param course
	 */
	public void updateCourseById(Course course);
}
