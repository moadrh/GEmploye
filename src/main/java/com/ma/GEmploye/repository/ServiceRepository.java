package com.ma.GEmploye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ma.GEmploye.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {

}
