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

import com.proyecto.aerolinea.entity.Cliente;
import com.proyecto.aerolinea.service.ClienteService;
import com.proyecto.aerolinea.utils.NotFoundException;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService serviceCliente;

	// Listado de Clientes

	@GetMapping("/lista")
	public ResponseEntity<List<Cliente>> lista() throws Exception {
		List<Cliente> listaAll = serviceCliente.listAll();
		return new ResponseEntity<>(listaAll, HttpStatus.OK);
	}

	// Buscar por Codigo

	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Cliente> buscar(@PathVariable("codigo") Integer cod) throws Exception {
		Cliente bean = serviceCliente.buscar(cod);
		if (bean == null) {

			throw new NotFoundException();
		}
		return new ResponseEntity<>(bean, HttpStatus.OK);
	}

	// Registrar Cliente

	@PostMapping("/registrar")
	public ResponseEntity<Cliente> registrar(@RequestBody Cliente cli) throws Exception {

		Cliente m = serviceCliente.registrar(cli);

		return new ResponseEntity<>(m, HttpStatus.CREATED);

	}

	// Actualizar Cliente

	@PutMapping("/Actualizar")
	public ResponseEntity<Cliente> actualizar(@RequestBody Cliente cli) throws Exception {

		Cliente bean = serviceCliente.buscar(cli.getCodigo());

		if (bean == null)

			throw new NotFoundException();
		else
			bean = serviceCliente.actualizar(cli);

		return new ResponseEntity<>(bean, HttpStatus.OK);
	}

	// Eliminar Cliente

	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) throws Exception {

		Cliente bean = serviceCliente.buscar(cod);

		if (bean == null)

			throw new NotFoundException();
		else
			serviceCliente.eliminar(cod);

		return new ResponseEntity<>(HttpStatus.OK);
	}

}
