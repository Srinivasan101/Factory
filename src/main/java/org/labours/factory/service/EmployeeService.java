package org.labours.factory.service;

import java.util.List;

import org.labours.factory.employeeEntity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.labours.factory.laboursRepository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	
	public Employee saveEmployee(Employee request) {
		return employeeRepository.save(request);
	}
	public List <Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	public Employee updateEmployee(Employee request) {
		return employeeRepository.save(request);
	}
	public void deleteEmployee(Employee request) {
		employeeRepository.delete(request);
		
	}
}

