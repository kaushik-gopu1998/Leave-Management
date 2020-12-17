package com.project.leaveapplication.service;

import com.project.leaveapplication.model.Employee;
import com.project.leaveapplication.repository.EmployeeRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;
@Autowired
RoleService roleService;

public void saveEmployee(Employee employee) {
  employeeRepository.save(employee);
}

public Optional<Employee> findByEmployeeId(Long employeeId) {
	return employeeRepository.findById(employeeId);
}
}