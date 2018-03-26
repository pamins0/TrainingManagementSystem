package com.yash.tms.daoimpl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.tms.dao.BaselineCriteriaDao;
import com.yash.tms.model.BaselineCriteria;
import com.yash.tms.model.Batch;
/**
 * this is the class which will directly interact with the database and performs the following operations
 * @author Varuni.dubey
 *
 */
@Repository
public class BaselineCriteriaDaoImpl implements BaselineCriteriaDao {
/**
 * it has the dependency of hibernate template
 */
	@Autowired
	HibernateTemplate template;
	/**
	 * for using logging
	 */
	private static Logger logger = Logger.getLogger(BaselineCriteriaDaoImpl.class);
  
	
	/**
	 * Method that inserts baseline criteria in the database
	 */
	  @Transactional
	public void addBaselineCriteria(BaselineCriteria baselineCriteria) {
		  baselineCriteria.setCreateddate(new Date());
    	  baselineCriteria.setModifieddate(new Date());
		template.save(baselineCriteria);
		
		logger.info("REPOSITORY: Inserting record..");

	}
	  
	  /**
		 * Method that modifys baseline criteria in the database
		 */
      @Transactional
	public void updateBaselineCriteria(BaselineCriteria baselineCriteria) {
    	  baselineCriteria.setCreateddate(new Date());
    	  baselineCriteria.setModifieddate(new Date());
		template.update( baselineCriteria);
		
		logger.info("REPOSITORY: Updated record successfully..");

	}
      
      /**
  	 * Method that lists all  baseline criteria from the database
  	 */
    @Transactional
	public List<BaselineCriteria> listAllBaselineCriteria() {
		return template.loadAll(BaselineCriteria.class);
		
	}
    
    /**
	 * Method that inserts baseline criteria in the database
	 */
    @Transactional
	public void deleteBaselineCriteria(int id) {
    	List baselinecriteria=template.find("from BaselineCriteria where id=?", id);
    	BaselineCriteria base=(BaselineCriteria) baselinecriteria.get(0);
        template.delete(base);
    	

	}

}
