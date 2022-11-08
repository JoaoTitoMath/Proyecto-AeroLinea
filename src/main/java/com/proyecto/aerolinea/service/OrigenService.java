package com.proyecto.aerolinea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.proyecto.aerolinea.dao.OrigenDAO;
import com.proyecto.aerolinea.entity.Origen;
import com.proyecto.aerolinea.serviceImpl.ICrudImpl;

@Service
public class OrigenService extends ICrudImpl<Origen, Integer> {

	@Autowired
	private OrigenDAO repoori;

	@Override
	public JpaRepository<Origen, Integer> getJpaRepository() {

		return repoori;
	}

}
