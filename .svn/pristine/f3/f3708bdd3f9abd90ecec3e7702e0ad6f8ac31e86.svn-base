package com.yash.tms.service;

import java.util.List;

import com.yash.tms.model.Batch;

/**
 * This interface is a contact that specifies that specifies following operations
 * 1.create Batch
 * @author Rajat.gupta
 *
 */
public interface BatchService {
	/**
	 * This method will communicate with BatchDao and create Batch
	 * @param batch
	 */
	public Batch createBatch(Batch batch);
	/**
	 *This method will communicate with BatchDao and get all batches
	 */
	public List<Batch> fetchAllBatches();
	/**
	 * This method will communicate with BatchDao and update Batch
	 */
	public void editBatch(Batch batch);
	/**
	 * this method will communicate with BatchDao and fetch Batches based on status
	 * @param status
	 * @return
	 */
	public List<Batch> findBatchesByStatus(int status);
	/**
	 * this method will communicate with BatchDao and delete batch based on id
	 */
	public void removeBatchbyId(int id);
}
