package com.proyecto.aerolinea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.proyecto.aerolinea.dao.TinerarioDAO;
import com.proyecto.aerolinea.entity.Tinerario;
import com.proyecto.aerolinea.serviceImpl.ICrudImpl;

@Service
public class TinerarioService extends ICrudImpl<Tinerario, Integer> {

	@Autowired
	private TinerarioDAO repotine;

	@Override
	public JpaRepository<Tinerario, Integer> getJpaRepository() {

		return repotine;
	}

}
