package com.proyecto.aerolinea.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_destino")
@Data
public class Destino {

	@Id
	@Column(name = "id_destino")
	private Integer codigo;

	@Column(name = "ciudad_destino")
	private String ciudad;

}
