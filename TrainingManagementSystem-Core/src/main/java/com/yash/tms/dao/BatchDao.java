package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.Batch;
/**
 * This interface is a contract that will have following operations
 * 1.insert batch
 * @author Rajat.gupta
 *
 */
public interface BatchDao {
	/**
	 * this method will insert batch into the DB
	 * @param batch
	 */
	public Batch insertBatch(Batch batch);
	/**
	 * this method will return all batches stored in DB
	 * @return
	 */
	public List<Batch> getAllBatches();
	/**
	 * this method will update an existing Batch stored in DB
	 * @param batch
	 */
	public void updateBatch(Batch batch);
	
	/** 
	 * this method will return batches based on the status
	 * @param status
	 * @return
	 */
	public List<Batch> getBatchesByStatus(int status);
	
	/**
	 * this method will be used to get existing Batch on the basis of batch_id
	 */
	public Batch getBatchByBatchId(int id);
	
	/**
	 * this method will delete the existing batch
	 */
	public void deleteBatchById(int id);
}
