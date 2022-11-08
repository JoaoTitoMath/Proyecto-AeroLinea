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
import com.proyecto.aerolinea.entity.Tinerario;
import com.proyecto.aerolinea.service.TinerarioService;
import com.proyecto.aerolinea.utils.NotFoundException;

@RestController
@RequestMapping("/tinerario")
public class TinerarioController {

	@Autowired
	private TinerarioService serviceTine;

	// Listado de Tinerario

	@GetMapping("/lista")
	public ResponseEntity<List<Tinerario>> lista() throws Exception {
		List<Tinerario> listaAll = serviceTine.listAll();
		return new ResponseEntity<>(listaAll, HttpStatus.OK);
	}

	// Buscar por Codigo

	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Tinerario> buscar(@PathVariable("codigo") Integer cod) throws Exception {
		Tinerario bean = serviceTine.buscar(cod);
		if (bean == null) {

			throw new NotFoundException();
		}
		return new ResponseEntity<>(bean, HttpStatus.OK);
	}

	// Registrar Tinario

	@PostMapping("/registrar")
	public ResponseEntity<Tinerario> registrar(@RequestBody Tinerario ti) throws Exception {

		Tinerario m = serviceTine.registrar(ti);

		return new ResponseEntity<>(m, HttpStatus.CREATED);

	}

	// Actualizar Tinario

	@PutMapping("/actualizar")
	public ResponseEntity<Tinerario> actualizar(@RequestBody Tinerario ti) throws Exception {

		Tinerario bean = serviceTine.buscar(ti.getCodigo());

		if (bean == null)

			throw new NotFoundException();
		else
			bean = serviceTine.actualizar(ti);

		return new ResponseEntity<>(bean, HttpStatus.OK);
	}

	// Eliminar Tinario

	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) throws Exception {

		Tinerario bean = serviceTine.buscar(cod);

		if (bean == null)

			throw new NotFoundException();
		else
			serviceTine.eliminar(cod);

		return new ResponseEntity<>(HttpStatus.OK);
	}

}
