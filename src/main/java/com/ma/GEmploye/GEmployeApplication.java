package com.ma.GEmploye;

import java.util.Date;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ma.GEmploye.entity.Employe;
import com.ma.GEmploye.entity.Service;
import com.ma.GEmploye.repository.ServiceRepository;
import com.ma.GEmploye.service.EmployeService;
import com.ma.GEmploye.service.ServiceService;

@SpringBootApplication
public class GEmployeApplication implements CommandLineRunner  {

	@Autowired
	private  ServiceService service;
	
	@Autowired
	private EmployeService employe;
	
	public static void main(String[] args) {
		SpringApplication.run(GEmployeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//service.create(new Service(1,"info"));
		//service.create(new Service(2,"finance"));
		
		//employe.create(new Employe(1,"moustaoui","salah",new Date(),"femme",service.findById(2)));
		
		for(Employe e : employe.findAll()) {
			System.out.println(e.getService().getNom());
		}
		//service.delete(service.findById(1));
		
		Employe e = employe.findById(1);
		e.setSexe("homme");
		employe.update(e);
		
	}

	

}
