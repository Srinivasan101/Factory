package org.labours.factory.laboursController;

import java.util.List;

import org.labours.factory.employeeEntity.Employee;
import org.labours.factory.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/post")
	public Employee prime (@RequestBody Employee request) {
	return employeeService.saveEmployee(request);
	}
	@GetMapping("/get")
	public List <Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@PutMapping("update/{id}")
	public Employee update(@RequestBody Employee request) {
	return employeeService.updateEmployee(request);
	}
	@DeleteMapping("delete/{id}")
	public void delete (@RequestBody Employee request) {
		employeeService.deleteEmployee(request);
	}
	}	