package com.spring.project.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.entity.Employee;



@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@PostMapping("/employee")
	public String save( Employee product) {
		//return productService.saveAll(product);
		return "Employee details are sucessfully posted";
	
	}
	@GetMapping("/employee/{id}")
	public String getProductById(@PathVariable("id")int id) {
		return "{\r\n "
				+ "\"name\": \"joe\",\r\n"
				+ "  \"emailId\": \"joe@gmail.com\",\r\n"
				+ "  \"age\": \"25\",\r\n"
				+ "  \"gender\": \"Female\",\r\n"
				+ "  \"worklocation\": \"Singapore\",\r\n"
				+ "  \"designation\": \"SSE\",\r\n"
				+ "  \"dob\": \"22-01-1996\"\r\n"
				+ "}\r\n ";
	
		
	}
	@DeleteMapping("/employee/{id}")
	public String deleteById(@PathVariable("id")int id) {
		//return productService.deleteByName(id);
		return "Employee details has been sucessfully deleted";
	}
	 @PutMapping("/employee/{id}") 
	  public String updateProd(@PathVariable("id") int id, Employee
	  prod)
	  { 
		  //return productService.updateProduct(id, prod); 
		  return "Employee details has been sucussessfully updated";}
	 
}
	

