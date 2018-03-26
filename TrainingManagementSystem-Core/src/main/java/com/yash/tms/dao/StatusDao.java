package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.Status;

/**
 * StatusDao used to represent following contract:
 * 1.get a Status on the basis of role id
 * 2.get All Status.
 * @author prashant.chauhan
 *
 */
public interface StatusDao {
	/**
	 * This method will be used for getting Status by provided status id.
	 * @param id
	 * @return
	 */
	public Status getStatusBy(int id);
	/**
	 * This method will be used to get all the Status.
	 * @return
	 */
	public List<Status> getAllStatus();
}
