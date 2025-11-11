package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@Controller
public class RegistrationController {

    @Autowired
    private EmployeeService employeeService;

    // Load registration page
    @RequestMapping("/view")
    public String viewRegistration() {
        return "registration";
    }

    // Save form data
    @RequestMapping("/save")
    public String getRegistrationData(Employee employee) {
        employeeService.saveEmployeeDetails(employee);
        return "registration";
    }
}
