package com.yash.tms.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.CourseDao;
import com.yash.tms.model.Course;

/**
 * This class is an implementation of CourseDao and define its unimplemented
 * methods.
 * 
 * @author Sawan.parmar
 *
 */
@Repository
public class CourseDaoImpl implements CourseDao {
	/**
	 * HibernateTemplate is used to communicate with database.
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;

	/**
	 * This method will be used to add new course in database.
	 */
	public Course addNewCourse(Course course) {
		 hibernateTemplate.save(course);
		 return course;
	}

	/**
	 * This method will return all courses stored in database.
	 */
	public List<Course> getAllCourse() {

		return hibernateTemplate.loadAll(Course.class);
	}

	/**
	 * This function is used for getting all the courses for a dedicated batch.
	 */
	public List<Course> getCourseByBatchId(int batch_id) {

		List list = hibernateTemplate.find("from Course where batch_id=?", batch_id);
		List<Course> courses = (List<Course>) list;
		return courses;
	}

	/**
	 * This method will delete a particular course from database by its Id.
	 */
	public void deleteCourseById(int id) {
		hibernateTemplate.bulkUpdate("delete from Course where id=?", id);
	}

	/**
	 * This method is used for updating a particular course by its id.
	 */
	public void updateCourseById(Course course) {
		
		hibernateTemplate.bulkUpdate(
				"update Course set name=?, version=?,modifiedBy=?,modifiedDate=?,estimatedStartDate=?,estimatedEndDate=?,actualStartDate=?,actualEndDate=?,status=?,batch_id=?,durationInDays=?,durationInWeeks=? where id=? ",
				course.getName(),course.getVersion(),course.getModifiedBy(),course.getModifiedDate(),course.getEstimatedStartDate(),course.getEstimatedEndDate(),course.getActualStartDate(),course.getActualEndDate(),course.getStatus(),course.getBatch_id(),course.getDurationInDays(),course.getDurationInWeeks(),course.getId());
	}

}
