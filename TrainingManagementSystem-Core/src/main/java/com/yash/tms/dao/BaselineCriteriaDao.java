package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.BaselineCriteria ;

/**
 * 
 * @author Varuni.dubey
 * This is the specification related to all the BaselineCriteria..It contains speciifications for adding,
 * listing ,updating and deleting a BaselineCriteria
 *
 */

public interface BaselineCriteriaDao {
	/**
	 * method for specification for adding a BaselineCriteria
	 * @param baselineCriteria
	 */
	public void addBaselineCriteria(BaselineCriteria  baselineCriteria);
	/**
	 * method for specification for updating  a BaselineCriteria
	 * @param baselineCriteria
	 * 
	 */
	public void updateBaselineCriteria(BaselineCriteria  baselineCriteria);
	/**
	 * method for specification for listing all BaselineCriterias
	 * @return
	 */
	public List<BaselineCriteria > listAllBaselineCriteria();
	/**
	 * method for specification for deleting a BaselineCriteria
	 * @param id
	 */
	public void deleteBaselineCriteria(int id);
	
}
