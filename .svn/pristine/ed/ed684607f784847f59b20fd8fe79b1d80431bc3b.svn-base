package com.yash.tms.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.tms.dao.CourseDao;
import com.yash.tms.model.Course;
import com.yash.tms.service.CourseService;
import com.yash.tms.util.CourseUtill;

/**
 * this class is an implementation of CourseService.
 * 
 * @author Sawan.parmar
 *
 */
@Service
public class CourseServiceImpl implements CourseService {
	/**
	 * CourseDao reference is required to call dao methods.
	 */
	@Autowired
	private CourseDao courseDao;

	/**
	 * This function contains some business logics related to new Course and
	 * will call addNewCourse of CourseDao.
	 */
	@Transactional
	public Course addNewCourse(Course course) {

		course.setDurationInDays(
				CourseUtill.calculateDays(course.getEstimatedStartDate(), course.getEstimatedEndDate()));
		course.setDurationInWeeks(
				CourseUtill.calculateWeeks(course.getEstimatedStartDate(), course.getEstimatedEndDate()));
		course.setCreatedDate(new Date());
		course.setModifiedDate(new Date());
		 return courseDao.addNewCourse(course);
	}

	/**
	 * This function will return list of all courses by calling CourseDao's
	 * method.
	 */
	@Transactional
	public List<Course> getAllCourse() {
		return courseDao.getAllCourse();
	}

	/**
	 * This method will return all the course for a dedicated batch.
	 */
	@Transactional
	public List<Course> getCoursByBatch(int batch_id) {

		return courseDao.getCourseByBatchId(batch_id);
	}

	/**
	 * This method will be used to delete course by its id.
	 * @param courseId
	 */
	@Transactional
	public void deleteCourseById(int courseId) {
		courseDao.deleteCourseById(courseId);
	}
	/**
	 * This method will be used to update course by its id.
	 * This function contains some business logics related to  Course and calculate no. of days and weeks by given tow dates.
	 * 
	 */
	@Transactional
	public void updateCourseById(Course course) {
		course.setDurationInDays(
				CourseUtill.calculateDays(course.getEstimatedStartDate(), course.getEstimatedEndDate()));
		course.setDurationInWeeks(
				CourseUtill.calculateWeeks(course.getEstimatedStartDate(), course.getEstimatedEndDate()));
		course.setModifiedDate(new Date());
		courseDao.updateCourseById(course);
		
	}

}
