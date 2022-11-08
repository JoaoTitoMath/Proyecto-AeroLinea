package com.proyecto.aerolinea.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_vuelo")
@Data
public class Vuelo {

	@Column(name = "id_vuelo")
	private Integer codigo;

	@Column(name = "capacidad_vuelo")
	private int capacidad;

	@Column(name = "modeloavion_vuelo")
	private String modelo;
}
