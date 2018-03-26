package com.yash.tms.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.BatchDao;
import com.yash.tms.model.Batch;
/**
 * This class implements BatchDao 
 * @author Rajat.gupta
 *
 */
@Repository
public class BatchDaoImpl implements BatchDao {
	/**
	 * this is used to perform operation on DB  
	 */
	@Autowired
	HibernateTemplate template;
	/**
	 * This method inserts a new batch into the DB using HibernateTemplate
	 */
	public Batch insertBatch(Batch batch) {
		int id=(Integer) template.save(batch);
		return getBatchByBatchId(id);
	}
	/**
	 * This method will return all batches stored in DB
	 */
	public List<Batch> getAllBatches() {
		return template.loadAll(Batch.class);
	}
	/**
	 * This method will update an existing Batch stored in DB
	 */
	public void updateBatch(Batch batch) {
		template.update(batch);
	}
	
	/** 
	 * this method will return batches based on the status
	 * @param status
	 * @return
	 */
	public List<Batch> getBatchesByStatus(int status) {
		template.find("from Batch where status=?", status);
		return null;
	}
	/**
	 * This method will used to get Existing Batch by batch_id
	 */
	public Batch getBatchByBatchId(int id) {
		return template.get(Batch.class, id);
	}
	/**
	 * this method will delete the existing batch
	 */
	public void deleteBatchById(int id){
		template.delete(getBatchByBatchId(id));
	}

}
