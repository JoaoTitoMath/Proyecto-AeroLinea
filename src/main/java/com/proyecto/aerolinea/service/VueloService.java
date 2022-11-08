package com.proyecto.aerolinea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.proyecto.aerolinea.dao.VueloDAO;
import com.proyecto.aerolinea.entity.Vuelo;
import com.proyecto.aerolinea.serviceImpl.ICrudImpl;

@Service
public class VueloService extends ICrudImpl<Vuelo, Integer> {

	@Autowired
	private VueloDAO repovuel;

	@Override
	public JpaRepository<Vuelo, Integer> getJpaRepository() {

		return repovuel;
	}

}
