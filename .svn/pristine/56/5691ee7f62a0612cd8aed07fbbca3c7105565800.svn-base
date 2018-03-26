package com.yash.tms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.tms.dao.StatusDao;
import com.yash.tms.model.Status;
import com.yash.tms.service.StatusService;
/**
 * RoleServiceImpl implements following contract:
 * 1.get a Status on the basis of status id
 * 2.get All Status.
 * @author prashant.chauhan
 *
 */
@Service
public class StatusServiceImpl implements StatusService {

	/**
	 * StatusDao used for interacting with DB for Status Related quries.
	 */
	@Autowired
	public StatusDao statusDao;
	
	/**
	 * This service will be used for getting Status by provided status id.
	 * @param id
	 * @return
	 */
	@Transactional
	public Status getStatusById(int id) {
		return statusDao.getStatusBy(id);
	}
	/**
	 * This service will be used to get all the Status.
	 * @return
	 */
	@Transactional
	public List<Status> getAllStatus() {
		return statusDao.getAllStatus();
	}

}
