package com.yash.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.tms.model.Role;
import com.yash.tms.service.RoleService;

/**
 * RoleController will be used for handling all the request related to the Role
 * 
 * @author prashant.chauhan
 */
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/role")
public class RoleController {
	/**
	 * RoleService will be used to perform Role Related Services.
	 */
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Role getRoleById(@PathVariable int id){
		return roleService.getRoleBy(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Role> getAllRoles(){
		return roleService.getAllRole();
	}
}
