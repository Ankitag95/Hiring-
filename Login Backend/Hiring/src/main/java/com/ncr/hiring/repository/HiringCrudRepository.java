package com.ncr.hiring.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.ncr.hiring.model.HiringDao;

//import antlr.collections.List;

public interface HiringCrudRepository extends CrudRepository<HiringDao, Long>{
	
	
	
}