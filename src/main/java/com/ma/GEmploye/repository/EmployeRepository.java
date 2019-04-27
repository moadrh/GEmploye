package com.ma.GEmploye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ma.GEmploye.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {
	

}
