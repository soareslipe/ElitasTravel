package com.grouptheamigos.elitas.resources;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.grouptheamigos.elitas.enitities.dto.PlaneDTO;
import com.grouptheamigos.elitas.services.PlaneService;

public class PlaneResouce implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private PlaneService service;
	
	@GetMapping
	public ResponseEntity<List<PlaneDTO>> findAll() {
		List<PlaneDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
