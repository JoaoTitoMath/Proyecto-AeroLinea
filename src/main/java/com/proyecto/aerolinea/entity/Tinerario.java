package com.proyecto.aerolinea.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_tinerario")
@Data
public class Tinerario {

	@Id
	@Column(name = "id_tinerario")
	private Integer codigo;

	private Date fecha;

	private String hora;

	@ManyToOne
	@JoinColumn(name = "id_origen")
	public Origen origen;

	@ManyToOne
	@JoinColumn(name = "id_destino")
	public Destino destino;

}
