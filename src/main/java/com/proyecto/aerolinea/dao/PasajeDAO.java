package com.proyecto.aerolinea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.aerolinea.entity.Pasaje;

public interface PasajeDAO extends JpaRepository<Pasaje, Integer>{

}
