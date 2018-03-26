package com.yash.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.Status;
import com.yash.tms.service.StatusService;

/**
 * StatusController will be used for handling all the request related to the Status
 * 
 * @author prashant.chauhan
 */
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/status")
public class StatusController {
	/**
	 * StatusService will be used to perform Status Related Services.
	 */
	@Autowired
	private StatusService statusService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Status getRoleById(@PathVariable int id){
		return statusService.getStatusById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Status> getAllRoles(){
		return statusService.getAllStatus();
	}

}
