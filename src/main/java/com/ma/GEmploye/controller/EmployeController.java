package com.ma.GEmploye.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ma.GEmploye.entity.Employe;
import com.ma.GEmploye.service.EmployeService;

@RestController
@RequestMapping("/api/employe")
@CrossOrigin
public class EmployeController {
	 
	@Autowired
	private EmployeService employeService;
	
	@GetMapping
	public List<Employe> getEmployes(){
		return employeService.findAll();
	}
	
	@PostMapping 
	public void addEmploye(@RequestBody Employe employe) {
		employeService.create(employe);
	}
	
	@GetMapping("/{id}")
	public Employe getEmployeById(@PathVariable int id){
		return employeService.findById(id);
	}
	
	
	@PutMapping
	public void updateEmploye(@RequestBody Employe employe) {
		employeService.update(employe);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmploye(@PathVariable int id) {
		Employe emp =employeService.findById(id);
		employeService.delete(emp);
	}


}
