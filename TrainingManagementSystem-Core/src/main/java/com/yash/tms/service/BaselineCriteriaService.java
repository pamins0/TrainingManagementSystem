package com.yash.tms.service;

import java.util.List;

import com.yash.tms.model.BaselineCriteria;

/**
 * This is the service specifications which will interact with the dao layer and provides the necessary services
 * @author Varuni.dubey
 *
 */

public interface BaselineCriteriaService {
	/**
	 * method for specification for adding a BaselineCriteria
	 * @param baselineCriteria
	 */
	public void insertBaselineCriteria(BaselineCriteria  baselineCriteria);
	/**
	 * method for specification for updating  a BaselineCriteria
	 * @param baselineCriteria
	 * 
	 */
	public void modifyBaselineCriteria(BaselineCriteria  baselineCriteria);
	/**
	 * method for specification for listing all BaselineCriterias
	 * @return
	 */
	public List<BaselineCriteria > getAllBaselineCriteria();
	/**
	 * method for specification for deleting a BaselineCriteria
	 * @param id
	 */
	public void removeBaselineCriteria(int id);
	
	
	
}
