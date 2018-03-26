
package com.yash.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * This is the  controller that handles all the requests related to baselinecriteria
 * @author Varuni.dubey
 *
 */

import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Batch;
import com.yash.tms.restutil.BaselineCriteriaURIs;
import com.yash.tms.service.BaselineCriteriaService;

/**
 * for integrating with angular 
 * @author Varuni.dubey
 *
 */
@CrossOrigin(origins="*")
@RestController
public class BaselineCriteriaController {
	/**
	 * dependency of service
	 */
	@Autowired
BaselineCriteriaService baselineCriteriaService;
	/**
	 * 
	 * @param baselineCriteria
	 * this method is used to consume BaselineCriteria in JSON format and forward it
	 */
	
	@RequestMapping(value = BaselineCriteriaURIs.ADD_BASELINE_CRITERIA, method = RequestMethod.POST)
	public void createBaselineCriteria(@RequestBody BaselineCriteria baselineCriteria) {
		System.out.println("Contoller test");
		baselineCriteria.setCreatedby(1);
		baselineCriteria.setModifiedby(1);
		
		baselineCriteriaService.insertBaselineCriteria(baselineCriteria);
	}
	
	
	
	/**
	 *This controller method fetches all baselinecriterias and will return all criterias in JSON format  
	 * @return
	 */
	@RequestMapping(value=BaselineCriteriaURIs.GET_BASELINE_CRITERIA,method = RequestMethod.GET)
	public List<BaselineCriteria> fetchAllBaselineCriteria(){
		return baselineCriteriaService.getAllBaselineCriteria();
	}
	
	/**
	 *This controller method for updating  
	 * @return
	 */
	
	@RequestMapping(value=BaselineCriteriaURIs.UPDATE_BASELINE_CRITERIA,method = RequestMethod.PUT)
	public void editBaselineCriteria(@RequestBody BaselineCriteria baselineCriteria){
		baselineCriteriaService.modifyBaselineCriteria(baselineCriteria);
	}
	
	/**
	 *This controller method for deleting the record  
	 * @return
	 */
	
	@RequestMapping(value=BaselineCriteriaURIs.DELETE_BASELINE_CRITERIA,method = RequestMethod.DELETE)
	public void deleteBaselineCriteria(@PathVariable int id){
		baselineCriteriaService.removeBaselineCriteria(id);
	}
	
	
	
}
