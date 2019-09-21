package com.curd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.curd.dto.EmployeeDTO;
import com.curd.service.EmployeeSearchService;



public class ListEmployeeController extends AbstractController {
	private  EmployeeSearchService service;

	public ListEmployeeController(EmployeeSearchService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<EmployeeDTO> listDTO=null;
		//use Service
		listDTO=service.getAllEmps();
		//create and return MAV obj
		return new ModelAndView("list_emps","listDTO",listDTO);
	}//method
}//class
