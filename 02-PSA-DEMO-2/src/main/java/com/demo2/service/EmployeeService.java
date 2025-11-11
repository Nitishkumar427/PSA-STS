package com.demo2.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.dto.EmployeeDto;
import com.demo2.entity.Employee;
import com.demo2.entity.Location;
import com.demo2.repository.EmployeeRepository;
import com.demo2.repository.LocationRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	public void saveEmployee(EmployeeDto dto )
	{ 
		Employee em = new Employee();
		BeanUtils.copyProperties(dto, em);
		employeeRepository.save(em);
		
		Location loc = new Location();
		BeanUtils.copyProperties(dto, loc);
		
		locationRepository.save(loc);
	}
	
	

}
