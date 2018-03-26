/**
 * 
 */
package com.yash.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.Course;
import com.yash.tms.restutil.CourseUriUtil;
import com.yash.tms.service.CourseService;

/**
 * This class receives the uri requests from front end and will perform operations to related uri.
 * @author Sawan.parmar
 */
@CrossOrigin(origins="*")
@RestController
public class CourseController {
	/**
	 * CourseService reference is required to call service methods.
	 */
	@Autowired
	CourseService courseService;
	/**
	 * This function is used to add new course and will call addNewCourse of CourseService.
	 * @param course
	 */
	@RequestMapping(value=CourseUriUtil.addNewCourse, method =  RequestMethod.POST)
	public Course addNewCourse(@RequestBody Course course){
		return courseService.addNewCourse(course);
	}
	/**
	 * This method will return all the courses.
	 * @return
	 */
	@RequestMapping(value=CourseUriUtil.getAllCourse,method = RequestMethod.GET)
	public List<Course> getAllCourse() {
		return courseService.getAllCourse();
	}
	/**
	 * This method will return the available courses in db for a dedicated batch.
	 * @param batch_id
	 * @return
	 */
	@RequestMapping(value=CourseUriUtil.getCoursebyBatchId, method = RequestMethod.GET)
	
	public List<Course> getCoursebyBatchId(@PathVariable int batch_id){
		return courseService.getCoursByBatch(batch_id);
	}
	/**
	 * This method is used to delete a particular course based on id.  
	 * @param courseId
	 */
	@RequestMapping(value=CourseUriUtil.deleteCourseById,method =  RequestMethod.DELETE)
	public void deleteCourseById(@PathVariable int courseId){
		courseService.deleteCourseById(courseId);
	}
	/**
	 * This method is used to update a particular course by id.
	 * @param course
	 */
	@RequestMapping(value=CourseUriUtil.updateCourseById, method = RequestMethod.PUT)
	public void updateCourseById(@RequestBody Course course){
		courseService.updateCourseById(course);
	}
}
