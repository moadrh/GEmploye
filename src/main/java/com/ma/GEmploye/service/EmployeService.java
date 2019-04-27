package com.ma.GEmploye.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ma.GEmploye.dao.IDao;
import com.ma.GEmploye.entity.Employe;
import com.ma.GEmploye.repository.EmployeRepository;

@Service
@Primary
public class EmployeService implements IDao<Employe> {
	
	@Autowired
	EmployeRepository employeRepo;
	
	@Autowired
	ServiceService serviceService;

	@Override
	public List<Employe> findAll() {
	
		return employeRepo.findAll();
	}

	@Override
	public Employe findById(int id) {
		return employeRepo.findById(id).get();
	}

	@Override
	public void create(Employe o) {
		employeRepo.save(o);
	}

	@Override
	public void update(Employe o) {
		employeRepo.save(o);
	}

	@Override
	public void delete(Employe o) {
		employeRepo.delete(o);
	}
	public void createEmploye(String nom,String prenom,Date dateNaissance,String sexe,int service) {
		Employe e = new Employe();
		e.setNom(nom);
		e.setPrenom(prenom);
		e.setDateNaissance(dateNaissance);
		e.setSexe(sexe);
		com.ma.GEmploye.entity.Service s = serviceService.findById(service);
		employeRepo.save(e);	
	}

}
