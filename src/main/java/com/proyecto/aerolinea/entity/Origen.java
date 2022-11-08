package com.proyecto.aerolinea.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_origen")
@Data
public class Origen {
	
	@Id
	@Column(name = "id_origen")
	private Integer codigo;

	@Column(name = "ciudad_origen")
	private String ciudad;

}
