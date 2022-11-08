package com.proyecto.aerolinea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aerolinea.entity.Destino;
import com.proyecto.aerolinea.service.DestinoService;

@RestController
@RequestMapping("/destino")
public class DestinoController {

	@Autowired
	private DestinoService serviceDestino;

	@GetMapping("/lista")
	public ResponseEntity<List<Destino>> lista() throws Exception {
		List<Destino> listaAll = serviceDestino.listAll();
		return new ResponseEntity<>(listaAll, HttpStatus.OK);
	}

}
