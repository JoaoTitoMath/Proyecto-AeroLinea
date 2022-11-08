package com.proyecto.aerolinea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.aerolinea.entity.Vuelo;

public interface VueloDAO extends JpaRepository<Vuelo, Integer> {

}
