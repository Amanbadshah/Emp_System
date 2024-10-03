package com.ems.service;


import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.ems.entity.Clover;
import com.ems.repository.CloverRepository;



@Service
public class CloverService implements ICloverService {

	@Autowired
	private CloverRepository cloverRepository;

	public List<Clover> getAllDetailes() {
		return cloverRepository.findAll();
	}

	public Optional<Clover> getCloverById(long id) {
		return cloverRepository.findById(id);
	}
	
	public List<Clover> getCloverByUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void saveClover(Clover clover) {
		System.out.println("Info"+clover);
		cloverRepository.save(clover);
		
	}

     public void deleteClover(long id) {
     cloverRepository.deleteById(id);
		
	}

	public void updateClover(@Validated Clover clover) {
		// TODO Auto-generated method stub
		System.out.println("Info"+clover);
		cloverRepository.save(clover);
		
	}

	

		
	}


		
	

	




		
	
