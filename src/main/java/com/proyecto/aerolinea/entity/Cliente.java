package com.proyecto.aerolinea.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_cliente")
@Data
public class Cliente {

	@Id
	@Column(name = "id_cliente")
	private Integer codigo;

	@Column(name = "cli_nombre")
	private String nombre;

	@Column(name = "cli_edad")
	private int edad;

	@Column(name = "cli_telefono")
	private String telefono;

	@Column(name = "cli_email")
	private String correo;

}
