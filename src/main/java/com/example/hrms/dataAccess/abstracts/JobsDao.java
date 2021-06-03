package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer>{

	
}
