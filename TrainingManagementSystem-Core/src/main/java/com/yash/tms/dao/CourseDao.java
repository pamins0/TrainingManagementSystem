package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.Course;

/**
 * 
 * This interface will provide method declarations to CourseDaoImpl class to perform various operations related to course. 
 * @author Sawan.parmar
 *
 */
public interface CourseDao {
	
	/**
	 * This method will be used to add new course in database.
	 */
	public Course addNewCourse(Course course);
	/**
	 * This method will return list of all courses.
	 * @return
	 */
	public List<Course> getAllCourse();
	
	/**
	 * This method will return list of courses for a particular batch by batch_id.	
	 * @param id
	 * @return
	 */
	public List<Course> getCourseByBatchId(int id);

	/**
	 * This method will be used for deleting a particular course by its Id. 
	 * @param id
	 */
	public void deleteCourseById(int id);
	/**
	 * This method will be used for updating a particular course by its id.
	 * @param courseId
	 */
	public void updateCourseById(Course course);
}
