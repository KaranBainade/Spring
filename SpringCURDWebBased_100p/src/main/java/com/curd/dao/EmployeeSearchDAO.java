package com.curd.dao;

import java.util.List;

import com.curd.bo.EmployeeBO;


public interface EmployeeSearchDAO {
	
	public  List<EmployeeBO> retriveAllEmps() throws Exception;

}
