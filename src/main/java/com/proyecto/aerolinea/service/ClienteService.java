package com.proyecto.aerolinea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.proyecto.aerolinea.dao.ClienteDAO;
import com.proyecto.aerolinea.entity.Cliente;
import com.proyecto.aerolinea.serviceImpl.ICrudImpl;

@Service
public class ClienteService extends ICrudImpl<Cliente, Integer> {

	@Autowired
	private ClienteDAO repocli;

	@Override
	public JpaRepository<Cliente, Integer> getJpaRepository() {

		return repocli;
	}

}
