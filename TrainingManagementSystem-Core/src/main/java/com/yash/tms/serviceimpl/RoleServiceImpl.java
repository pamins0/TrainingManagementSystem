package com.yash.tms.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.tms.dao.RoleDao;
import com.yash.tms.service.RoleService;
import com.yash.tms.model.Role;
/**
 * RoleServiceImpl implements following contract:
 * 1.get a Role on the basis of role id
 * 2.get All Role.
 * @author prashant.chauhan
 *
 */
@Service
public class RoleServiceImpl implements RoleService {
	/**
	 * RoleDao used for interacting with DB for Role Related quries.
	 */
	@Autowired
	private RoleDao roleDao;
	/**
	 * This service will be used for getting Role by provided role id.
	 * @param id
	 * @return
	 */
	@Transactional
	public Role getRoleBy(int id) {
		return roleDao.getRoleBy(id);
	}
	/**
	 * This service will be used to get all the Role.
	 * @return
	 */
	@Transactional
	public List<Role> getAllRole() {
		return roleDao.getAllRole();
	}

}
