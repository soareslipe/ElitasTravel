package com.grouptheamigos.elitas.services;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.grouptheamigos.elitas.enitities.Plane;
import com.grouptheamigos.elitas.enitities.dto.PlaneDTO;
import com.grouptheamigos.elitas.repositories.PlaneRepository;

public class PlaneService implements Serializable{

	private static final long serialVersionUID = 1L;

	@Autowired
	private PlaneRepository repository;
	
	@Transactional(readOnly = true)
	public List<PlaneDTO> findAll() {
		List<Plane> list = repository.findAll();
		List<PlaneDTO> listDto = list.stream().map(x -> new PlaneDTO(x)).collect(Collectors.toList());	
		return listDto;
	}
	
	
}
