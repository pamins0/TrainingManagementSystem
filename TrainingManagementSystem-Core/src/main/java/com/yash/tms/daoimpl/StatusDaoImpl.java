package com.yash.tms.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.StatusDao;
import com.yash.tms.model.Status;

/**
 * StatusDaoImpl implements following contract:
 * 1.get a Status on the basis of status id
 * 2.get All Status.
 * @author prashant.chauhan
 *
 */
@Repository
public class StatusDaoImpl implements StatusDao {

	/**
	 * hibernateTemplate will be used for quering DB for required data
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;
	/**
	 * This method will be used for getting Status by provided status id.
	 * @param id
	 * @return
	 */
	public Status getStatusBy(int id) {
		return hibernateTemplate.get(Status.class,id);
	}
	/**
	 * This method will be used to get all the Status.
	 * @return
	 */
	public List<Status> getAllStatus() {
		return hibernateTemplate.loadAll(Status.class);
	}
	
}
