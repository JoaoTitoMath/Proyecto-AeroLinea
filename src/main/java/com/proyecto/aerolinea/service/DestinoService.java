package com.proyecto.aerolinea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.proyecto.aerolinea.dao.DestinoDAO;
import com.proyecto.aerolinea.entity.Destino;
import com.proyecto.aerolinea.serviceImpl.ICrudImpl;

@Service
public class DestinoService extends ICrudImpl<Destino, Integer> {

	@Autowired

	private DestinoDAO repodes;

	@Override
	public JpaRepository<Destino, Integer> getJpaRepository() {

		return repodes;
	}

}
