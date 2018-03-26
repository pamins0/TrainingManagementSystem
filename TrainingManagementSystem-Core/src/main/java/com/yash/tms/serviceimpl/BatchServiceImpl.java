package com.yash.tms.serviceimpl;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.tms.dao.BatchDao;
import com.yash.tms.model.Batch;
import com.yash.tms.service.BatchService;
/**
 * This class implements BatchService and will have following operations
 * 1.create Batch
 * @author Rajat.gupta
 *
 */
@Service
public class BatchServiceImpl implements BatchService {
	/**
	 * This is used to communicate with BatchDao
	 */
	@Autowired
	BatchDao batchDao;
	/**
	 * This method calls the BatchDao and sends the batch to be created.
	 */
	@Transactional
	public Batch createBatch(Batch batch) {
		Date date=new Date(); 
		batch.setCreateddate(date);
		batch.setModifieddate(date);
		batch.setStatus(1);
		return batchDao.insertBatch(batch);
	}
	/**
	 *This method will communicate with BatchDao and get all batches
	 */
	@Transactional
	public List<Batch> fetchAllBatches() {
		return batchDao.getAllBatches();
	}
	/**
	 * This method will communicate with BatchDao and update Batch
	 */
	@Transactional
	public void editBatch(Batch batch) {
		Date date=new Date();
		batch.setModifieddate(date);
		batchDao.updateBatch(batch);
	}
	/**
	 * this method will communicate with BatchDao and fetch Batches based on status
	 * @param status
	 * @return
	 */
	@Transactional
	public List<Batch> findBatchesByStatus(int status) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * this method will communicate with BatchDao and delete batch based on id
	 */
	@Transactional
	public void removeBatchbyId(int id) {
		batchDao.deleteBatchById(id);
	}

}
