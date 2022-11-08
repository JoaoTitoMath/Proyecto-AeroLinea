package com.proyecto.aerolinea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.proyecto.aerolinea.dao.PasajeDAO;
import com.proyecto.aerolinea.entity.Pasaje;
import com.proyecto.aerolinea.serviceImpl.ICrudImpl;

@Service
public class PasajeService extends ICrudImpl<Pasaje, Integer> {

	@Autowired
	private PasajeDAO repopasa;

	@Override
	public JpaRepository<Pasaje, Integer> getJpaRepository() {

		return repopasa;
	}

}
