package com.employee.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.web.dto.SearchReqDto;
import com.employee.web.entity.Employee;
import com.employee.web.entity.User;
import com.employee.web.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final CharSequence Daylord1 = "Daylord1";

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("username","Peter");
		return "home";
	}
	
	@GetMapping("/empdetails")
	public String getEmployees(Model model) {
		
		List<Employee> empList = empService.getAllEmployees();
		
		model.addAttribute("empList",empList);
		
		return "all-emp";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		
		return "add-emp-form";
	}
	
	@PostMapping("/addemp")
	public String addEmp(Employee employee,Model model) {
		
		System.out.println(employee);
		empService.saveEmployee(employee);
		
		model.addAttribute("message","Data added Successfully");
		
		return "add-emp-form";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable("id") Integer id, Model model) {
		
		String message = empService.deleteEmployeeById(id);
		
		model.addAttribute("message",message);
		
		return "redirect:empdetails";
	}
	
	@PostMapping("/search")
	public String searchEmployee(SearchReqDto dto, Model model) {
		
		List<Employee> empList = empService.getEmployeesByUserName(dto.getUsername());
		
		model.addAttribute("empList",empList);
		
		return "all-emp";
	}
}
