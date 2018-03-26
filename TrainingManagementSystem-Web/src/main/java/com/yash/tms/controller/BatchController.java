package com.yash.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.Batch;
import com.yash.tms.service.BatchService;

/**
 * This controller handles all the request related to Batch
 * 
 * @author Rajat.gupta
 *
 */
@RestController
@CrossOrigin(origins="*")
public class BatchController {
	@Autowired
	BatchService batchService;

	/**
	 * This controller method will consume Batch in JSON format and forward it
	 * to BatchService
	 * @param batch
	 */
	@RequestMapping(value = "/batch", method = RequestMethod.POST)
	public Batch createBatch(@RequestBody Batch batch) {
		return batchService.createBatch(batch);
	}
	
	/**
	 *This controller method fetches all batches and will return all batches in JSON format  
	 * @return
	 */
	@RequestMapping(value="/batch",method = RequestMethod.GET)
	public List<Batch> fetchAllBatches(){
		return batchService.fetchAllBatches();
	}
	
	@RequestMapping(value="/batch/{id}",method = RequestMethod.PUT)
	public void editBatch(@RequestBody Batch batch){
		batchService.editBatch(batch);
	}
	
	@RequestMapping(value="/batch/{id}",method = RequestMethod.DELETE)
	public void removeBatch(@PathVariable("id") int id){
		batchService.removeBatchbyId(id);
	}
}
