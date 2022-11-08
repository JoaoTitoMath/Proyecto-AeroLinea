package com.proyecto.aerolinea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.aerolinea.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
