package com.proyecto.aerolinea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.aerolinea.entity.Vuelo;
import com.proyecto.aerolinea.service.VueloService;

@RestController
@RequestMapping("/vuelo")
public class VueloController {

	@Autowired
	private VueloService serviceVuelo;

	@GetMapping("/lista")
	public ResponseEntity<List<Vuelo>> lista() throws Exception {
		List<Vuelo> listaAll = serviceVuelo.listAll();
		return new ResponseEntity<>(listaAll, HttpStatus.OK);
	}

}
