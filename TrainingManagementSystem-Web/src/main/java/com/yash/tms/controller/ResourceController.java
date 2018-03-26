package com.yash.tms.controller;

import java.io.Externalizable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.yash.tms.dao.LDAPResourceLookupDao;
import com.yash.tms.model.Batch;
import com.yash.tms.model.Employee;
import com.yash.tms.model.ResourceEmployee;
import com.yash.tms.restutil.ResourceURIs;
import com.yash.tms.service.EmployeeService;
import com.yash.tms.service.ResourceService;

/**
 * All the request regarding resource will be handled here
 * @author megha.dengre
 *
 */
@CrossOrigin(origins="*")
@RestController
public class ResourceController 
{
	/**
	 * to communicate with service
	 */
	@Autowired
	ResourceService resourceService;
	
	@Autowired
	EmployeeService employeeService;
	
	/**
	 * this method will get the email to search for 
	 * and call the service to get the details related to that email
	 * @param email
	 * @throws AuthenticationException 
	 */
	@RequestMapping(value = ResourceURIs.LOOKUP_RESOURCE, method = RequestMethod.GET)
	public ResourceEmployee lookupResource(@PathVariable("email") String email) throws AuthenticationException {
		
		Employee employee=new Employee();
		
		employee= resourceService.lookupResource(email);
		ResourceEmployee re=new ResourceEmployee();
		
		re.setEmployee_id(employee.getId());
		re.setFirstname(employee.getFirstname());
		re.setLastname(employee.getLastname());
		re.setRole_id(employee.getRole_id());
		re.setEmail_id(employee.getEmail_id());
		re.setBatch_id(employee.getBatch_id());
		re.setStatus_id(employee.getStatus_id());
		
		re.setCreatedby(employee.getCreatedby());
		re.setCreateddate(employee.getCreateddate());
		re.setModifiedby(employee.getModifiedby());
		re.setModifieddate(employee.getModifieddate());
		
		
		System.out.println("Contoller test");
		
		System.out.println(employee.getFirstname()+"->"+employee.getLastname()+"->"+employee.getEmail_id());
		
		return re;
		
	}
	
	
	/**
	 * this method adds new resource by taking resource info
	 * @param resourceEmployee
	 */
	@RequestMapping(value=ResourceURIs.ADD_RESOURCE, method=RequestMethod.POST)
	public void addResource(@RequestBody ResourceEmployee resourceEmployee ){
		
		resourceService.insertResource(resourceEmployee);
		
	}
	
	/**
	 * this method will return all the resources
	 */
	@RequestMapping(value=ResourceURIs.GET_RESOURCE, method=RequestMethod.GET)
	public List<ResourceEmployee> getAllResources(){
		return resourceService.listAllResource();
	}
	
	/**
	 * this method will delete resource on the basis of its id
	 * @param id
	 */
	@RequestMapping(value=ResourceURIs.DELETE_RESOURCE, method=RequestMethod.DELETE)
	public void deleteResource(@PathVariable("id") int id){
		
		resourceService.deleteResource(id);
	}
	
	/**
	 * this method will update the resource details 
	 * @param resourceEmployee
	 */
	@RequestMapping(value=ResourceURIs.UPDATE_RESOURCE, method=RequestMethod.PUT)
	public void updateResource(@RequestBody ResourceEmployee resourceEmployee, @PathVariable("id") int id){
		
		resourceService.updateResource(resourceEmployee);
		
	}
}
