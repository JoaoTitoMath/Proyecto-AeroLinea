package com.proyecto.aerolinea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aerolinea.entity.Origen;
import com.proyecto.aerolinea.service.OrigenService;

@RestController
@RequestMapping("/origen")
public class OrigenController {

	@Autowired
	private OrigenService serviceOrigen;

	@GetMapping("/lista")
	public ResponseEntity<List<Origen>> lista() throws Exception {
		List<Origen> listaAll = serviceOrigen.listAll();
		return new ResponseEntity<>(listaAll, HttpStatus.OK);
	}

}
