package com.ems.service;


import java.util.List;
import java.util.Optional;



import org.springframework.validation.annotation.Validated;

import com.ems.entity.Clover;

public interface ICloverService {

	List<Clover> getCloverByUser(String user);

	Optional<Clover> getCloverById(long id);

    List<Clover> getAllDetailes();

	void deleteClover(long id);

	void updateClover(@Validated Clover clover);

	void saveClover(Clover clover);


	

}