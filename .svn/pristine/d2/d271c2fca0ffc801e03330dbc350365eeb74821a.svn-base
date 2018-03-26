package com.yash.tms.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.RoleDao;
import com.yash.tms.model.Role;
/**
 * RoleDaoImpl implements following contract:
 * 1.get a Role on the basis of role id
 * 2.get All Role.
 * @author prashant.chauhan
 *
 */
@Repository
public class RoleDoImpl implements RoleDao {
	/**
	 * hibernateTemplate will be used for quering DB for required data
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;
	/**
	 * This method will be used for getting Role by provided role id.
	 * @param id
	 * @return
	 */
	public Role getRoleBy(int id) {
		return hibernateTemplate.get(Role.class, id);
	}
	/**
	 * This method will be used to get all the Role.
	 * @return
	 */
	public List<Role> getAllRole() {
		return hibernateTemplate.loadAll(Role.class);
	}

}
