package com.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo2.dto.EmployeeDto;
import com.demo2.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/save")
	public String saveRegistration(EmployeeDto dto, ModelMap model)

	{
		employeeService.saveEmployee(dto);
		model.addAttribute("msg", "Record is saved!!");
		return "index";
	}

}
