package com.yash.tms.serviceimpl;

import javax.security.sasl.AuthenticationException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.yash.tms.model.EmployeeBeforeAuthentication;
import com.yash.tms.dao.BatchDao;
import com.yash.tms.dao.EmployeeDao;
import com.yash.tms.dao.RoleDao;
import com.yash.tms.dao.StatusDao;
import com.yash.tms.model.AuthenticatedEmployee;
import com.yash.tms.model.Batch;
import com.yash.tms.model.Employee;
import com.yash.tms.model.Role;
import com.yash.tms.model.Status;

import com.yash.tms.service.EmployeeService;

/**
 * EmployeeService will define followning contract for Employee: 1.Employee
 * Authentication
 * 2.Employee Registration
 * 3.Employee Updation
 * @author prashant.chauhan
 *
 */
@SessionAttributes("LoggedInUser")
@Service
public class EmployeeServiceImpl implements EmployeeService {
	/**
	 * employeeDao used for interacting with DB for Employee Related quries
	 */
	@Autowired
	private EmployeeDao employeeDao;
	/**
	 * batchDao used for interacting with DB for Batch Related quries
	 */	
	@Autowired
	private BatchDao batchDao;
	/**
	 * statusDao used for interacting with DB for Status Related quries
	 */	
	@Autowired
	private StatusDao statusDao;
	/**
	 * roleDao used for interacting with DB for Role Related quries
	 */	
	@Autowired
	private RoleDao roleDao;
	/**
	 * This service will return the Authenticated Employee after providing successful login credential
	 */
	@Transactional
	public AuthenticatedEmployee authenticationEmployee(String userid, String password,Model model) {
		Employee employee=employeeDao.getEmployee(userid, password);
		//System.out.println(employee.getFirstname());
		if(employee.getId()>0){
		Batch batch=batchDao.getBatchByBatchId(employee.getBatch_id());
		Status status=statusDao.getStatusBy(employee.getStatus_id());
		Role role=roleDao.getRoleBy(employee.getRole_id());
		AuthenticatedEmployee authenticatedEmployee;
		authenticatedEmployee=this.poupulateAuthenticatedEmployee(employee, role, status, batch);
		model.addAttribute("LoggedInUser",authenticatedEmployee);
		return authenticatedEmployee;
		}else
			return new AuthenticatedEmployee();
		}
	
	

	/**
	 * This method will be used to populate the Authenticated Employee on the basis of role,status,batch,and employee details 
	 * @param employee
	 * @param role
	 * @param status
	 * @param batch
	 * @return
	 */
	public AuthenticatedEmployee poupulateAuthenticatedEmployee(Employee employee,Role role,Status status,Batch batch){
		AuthenticatedEmployee authenticatedEmployee=new AuthenticatedEmployee();
		authenticatedEmployee=new AuthenticatedEmployee();
		authenticatedEmployee.setId(employee.getId());
		authenticatedEmployee.setFirstname(employee.getFirstname());
		authenticatedEmployee.setLastname(employee.getLastname());
		authenticatedEmployee.setEmail_id(employee.getEmail_id());
		authenticatedEmployee.setRole(role.getName());
		authenticatedEmployee.setStatus(status.getName());
		authenticatedEmployee.setBatch(batch.getName());
		return authenticatedEmployee;
	
	}
	/**
	 * this method will set details of authenticated employee
	 * @param employeeBeforeAuthentication
	 * @author meghna.gajeshwar
	 */
	@Transactional
	public void setEmployeeDetails(EmployeeBeforeAuthentication employeeBeforeAuthentication) throws AuthenticationException {
		 employeeDao.setEmployeeDetails(employeeBeforeAuthentication);
	}
	public Employee seachExistingEmployee(String email) {
		return employeeDao.seachExistingEmployee(email);
		
	}
	
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
		
	}

}
