package com.curd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.curd.dto.EmployeeDTO;
import com.curd.service.EmployeeSearchService;


@Controller
public class ListEmployeeController {
	@Autowired
	private  EmployeeSearchService empService;

	// handler method for launching home page
	@RequestMapping("/welcome.htm")
	public String showHome() {
		
		return "home";
	}
	
	@RequestMapping("/all_emps.htm")
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		List<EmployeeDTO> listDTO=null;
		//use Service
		listDTO=empService.getAllEmps();
		//create and return MAV obj
		return new ModelAndView("list_emps","listDTO",listDTO);
	}//method
}//class
