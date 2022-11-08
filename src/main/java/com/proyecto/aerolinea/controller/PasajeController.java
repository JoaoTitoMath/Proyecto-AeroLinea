package com.proyecto.aerolinea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aerolinea.entity.Pasaje;
import com.proyecto.aerolinea.service.PasajeService;
import com.proyecto.aerolinea.utils.NotFoundException;

@RestController
@RequestMapping("/pasaje")
public class PasajeController {

	@Autowired
	private PasajeService servicePasaje;

	// Listado de Pasaje

	@GetMapping("/lista")
	public ResponseEntity<List<Pasaje>> lista() throws Exception {
		List<Pasaje> listaAll = servicePasaje.listAll();
		return new ResponseEntity<>(listaAll, HttpStatus.OK);
	}

	// Buscar por Codigo

	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Pasaje> buscar(@PathVariable("codigo") Integer cod) throws Exception {
		Pasaje bean = servicePasaje.buscar(cod);
		if (bean == null) {

			throw new NotFoundException();
		}
		return new ResponseEntity<>(bean, HttpStatus.OK);
	}

	// Registrar Pasaje

	@PostMapping("/registrar")
	public ResponseEntity<Pasaje> registrar(@RequestBody Pasaje pasa) throws Exception {

		Pasaje m = servicePasaje.registrar(pasa);

		return new ResponseEntity<>(m, HttpStatus.CREATED);

	}

	// Actualizar Pasaje

	@PutMapping("/actualizar")
	public ResponseEntity<Pasaje> actualizar(@RequestBody Pasaje pasa) throws Exception {

		Pasaje bean = servicePasaje.buscar(pasa.getCodigo());

		if (bean == null)

			throw new NotFoundException();
		else
			bean = servicePasaje.actualizar(pasa);

		return new ResponseEntity<>(bean, HttpStatus.OK);
	}

	// Eliminar Pasaje

	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) throws Exception {

		Pasaje bean = servicePasaje.buscar(cod);

		if (bean == null)

			throw new NotFoundException();
		else
			servicePasaje.eliminar(cod);

		return new ResponseEntity<>(HttpStatus.OK);
	}
}
