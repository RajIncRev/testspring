package com.testproj;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
//@RequestMapping("/api/")
//@CrossOrigin(origins = "*")
public class TestController {
	@Autowired
	private ProjectDetails a;
	
	@Autowired
	private EmployeeRepository empRepository;
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World. Test Project";
	}
	
	@RequestMapping("/prop")
	public String readProperty() {
		return "Sub Domain:"+a.getAppSubdomain();
		//return "abc";
	}
	
	@RequestMapping("employee")
	public List<Employee> getEmployee() {
		List<Employee> empList = empRepository.findAll();
		return empList;
		
	}
	
	@RequestMapping("employee/1")
	public Employee getEmployeeInfo() {
		Optional<Employee> emp = empRepository.findById(1);
		return emp.get();
		
	}
	
}
