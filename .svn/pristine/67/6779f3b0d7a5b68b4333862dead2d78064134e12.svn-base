package com.yash.tms.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.BatchDao;
import com.yash.tms.dao.EmployeeDao;
import com.yash.tms.dao.ResourceDao;
import com.yash.tms.dao.RoleDao;
import com.yash.tms.model.Batch;
import com.yash.tms.model.Employee;
import com.yash.tms.model.Resource;
import com.yash.tms.model.ResourceEmployee;
import com.yash.tms.model.Role;
/**
 * this is an implementation of resourcedao which will communicate with database 
 * and perform manipulation operation
 * @author megha.dengre
 *
 */
@Repository
public class ResourceDaoImpl implements ResourceDao {

	/**
	 * Hibernate template will be used for Querying the DB Employee entity.
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	/**
	 * employeeDao will be used to communicate employee table and executing it's query
	 */
	@Autowired
	private EmployeeDao employeeDao;
	
	/**
	 * this will communicate with BatchDao and call it's method
	 */
	@Autowired
	private BatchDao batchDao;
	
	/**
	 * this will communicate with RoleDao and call it's method
	 */
	@Autowired
	private RoleDao roleDao;
	
	Employee employee;
	Resource resource;
	
	public ResourceDaoImpl() {
		employee=new Employee();
		resource=new Resource();
	}
	
	/**
	 * this method will insert the employee first 
	 * and then with corresponding employee_id add data into resources
	 * @param resourceEmployee
	 * @return
	 */
	public void insertResource(ResourceEmployee resourceEmployee) {
		
		employee.setFirstname(resourceEmployee.getFirstname());
		employee.setLastname(resourceEmployee.getLastname());
		employee.setRole_id(resourceEmployee.getRole_id());
		employee.setEmail_id(resourceEmployee.getEmail_id());
		employee.setBatch_id(resourceEmployee.getBatch_id());
		employee.setStatus_id(resourceEmployee.getStatus_id());
		employee.setCreatedby(resourceEmployee.getCreatedby());
		employee.setCreateddate(new Date());
		employee.setModifiedby(resourceEmployee.getModifiedby());
		employee.setModifieddate(new Date());
		
		
		resource.setContribution_time(resourceEmployee.getContribution_time());
		resource.setCreatedby(resourceEmployee.getCreatedby());
		resource.setCreateddate(new Date());
		resource.setModifiedby(resourceEmployee.getModifiedby());
		resource.setModifieddate(new Date());
		
		Employee existingemployee=employeeDao.seachExistingEmployee(employee.getEmail_id());
		if(existingemployee.getId()==0){
			insertEmployee(employee);
		}
		else
		{
			employee.setId(existingemployee.getId());
			
			employeeDao.updateEmployee(employee);
			
			resource.setEmployee_id(existingemployee.getId());
			insertResourceByEmpId(resource);
		}
		
	}
	/**
	 * this method will insert resource details in employees table
	 * @param employee
	 */
	public void insertEmployee(Employee employee)
	{
		hibernateTemplate.save(employee);
		
		Employee insertedEmployee= employeeDao.seachExistingEmployee(employee.getEmail_id());
		resource.setEmployee_id(insertedEmployee.getId());
		insertResourceByEmpId(resource);
		
	}
	
	/**
	 * this method will add new resource corresponding to its employee id
	 * @param resource
	 */
	public void insertResourceByEmpId(Resource resource){
		hibernateTemplate.save(resource);
	}

	/**
	 * this method will update the resource on the basis of its resource id
	 * @param resourceEmployee
	 */
	public void updateResource(ResourceEmployee resourceEmployee) {
		Resource resource=new Resource();
		Employee employee=new Employee();
		
		employee.setId(resourceEmployee.getEmployee_id());
		employee.setFirstname(resourceEmployee.getFirstname());
		employee.setLastname(resourceEmployee.getLastname());
		employee.setRole_id(resourceEmployee.getRole_id());
		employee.setEmail_id(resourceEmployee.getEmail_id());
		employee.setBatch_id(resourceEmployee.getBatch_id());
		employee.setStatus_id(resourceEmployee.getStatus_id());
		employee.setCreatedby(resourceEmployee.getCreatedby());
		employee.setCreateddate(new Date());
		employee.setModifiedby(resourceEmployee.getModifiedby());
		employee.setModifieddate(new Date());
		
		resource.setId(resourceEmployee.getResource_id());
		resource.setEmployee_id(resourceEmployee.getEmployee_id());
		resource.setContribution_time(resourceEmployee.getContribution_time());
		resource.setCreatedby(resourceEmployee.getCreatedby());
		resource.setCreateddate(new Date());
		resource.setModifiedby(resourceEmployee.getModifiedby());
		resource.setModifieddate(new Date());
		
		hibernateTemplate.update(resource);
		hibernateTemplate.update(employee);
		
	}

	/**
	 * this method will retrieve all the resources
	 * @return
	 */
	public List<ResourceEmployee> listAllResource() {
		List<Resource> resources=hibernateTemplate.loadAll(Resource.class);
		List<ResourceEmployee> resourceemployee=new ArrayList<ResourceEmployee>();
		
		for (Resource resource : resources) {
			
			Employee employee=employeeDao.searchEmployeeById(resource.getEmployee_id());
			
			ResourceEmployee re=new ResourceEmployee();
			re.setResource_id(resource.getId());
			re.setEmployee_id(employee.getId());
			re.setFirstname(employee.getFirstname());
			re.setLastname(employee.getLastname());
			re.setRole_id(employee.getRole_id());
			re.setEmail_id(employee.getEmail_id());
			re.setBatch_id(employee.getBatch_id());
			re.setStatus_id(employee.getStatus_id());
			re.setContribution_time(resource.getContribution_time());
			re.setCreatedby(resource.getCreatedby());
			re.setCreateddate(resource.getCreateddate());
			re.setModifiedby(resource.getModifiedby());
			re.setModifieddate(resource.getModifieddate());
			
			Batch batch=batchDao.getBatchByBatchId(employee.getBatch_id());
			Role role=roleDao.getRoleBy(employee.getRole_id());
			
			re.setBatch_name(batch.getName());
			re.setRole_name(role.getName());
			
			resourceemployee.add(re);
		}
		
		return resourceemployee;
	}

	/**
	 * this method will delete the resource on the basis of it's id 
	 * also the details in employee table will be deleted
	 * @param resourceEmployee
	 */
	public void deleteResource(int resource_id) {
		
		hibernateTemplate.bulkUpdate("delete from Resource where id=?", resource_id);
		
	}

	/**
	 * this method will find the employee id for the resource
	 * @param resource_id
	 * @return
	 */
	public int getEmployeeIdByResource(int resource_id) {
		Resource resource=hibernateTemplate.load(Resource.class, resource_id);
		return resource.getEmployee_id();
	}

	/**
	 * this method will search whether the employee is assigned as a resource in resource table
	 * @param empid
	 * @return
	 */
	public Resource searchResourceByEmployeeId(int empid) {
		List<Resource> resource=(List<Resource>)hibernateTemplate.find("from Resource where employee_id=?", empid);
		Resource searchedresource=new Resource();
		for (Resource resource2 : resource) 
		{
			searchedresource=resource2;
		}
		return searchedresource;
	}

}












