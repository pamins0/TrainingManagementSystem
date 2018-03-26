package com.yash.tms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.tms.dao.BaselineCriteriaDao;
import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.service.BaselineCriteriaService;
/**
 * service class which has dependency of dao and it has the following methods
 * @author Varuni.dubey
 *
 */
@Service
public class BaselineCriteriaServiceImpl implements BaselineCriteriaService {
	/***
	 * dao layer dependency managed
	 */
	@Autowired
	BaselineCriteriaDao baselineCriteriaDao;
	/**
	 * Service method which interacts with dao layer for adding baseline criteria
	 */

	public void insertBaselineCriteria(BaselineCriteria baselineCriteria) {
		baselineCriteriaDao.addBaselineCriteria(baselineCriteria);

	}
	/**
	 * Service method which interacts with dao layer for updating baseline criteria
	 */

	public void modifyBaselineCriteria(BaselineCriteria baselineCriteria) {
		baselineCriteriaDao.updateBaselineCriteria(baselineCriteria);

	}
	/**
	 * Service method which interacts with dao layer for getting the list of all baseline criteria
	 */

	public List<BaselineCriteria> getAllBaselineCriteria() {
		// List<BaselineCriteria>listOfAllBaseLineCriteria=new
		// ArrayList<BaselineCriteria>();

		return baselineCriteriaDao.listAllBaselineCriteria();
	}
	/**
	 * Service method which interacts with dao layer for deleting baseline criteria
	 */

	public void removeBaselineCriteria(int id) {
		baselineCriteriaDao.deleteBaselineCriteria(id);

	}

}
