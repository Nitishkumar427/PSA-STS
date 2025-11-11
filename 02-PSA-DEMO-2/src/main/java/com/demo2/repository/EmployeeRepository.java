package com.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
