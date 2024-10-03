package com.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.Clover;

public interface CloverRepository extends JpaRepository<Clover, Long>{
//	
//	@
//	List<Clover> findByName(String user);
}
