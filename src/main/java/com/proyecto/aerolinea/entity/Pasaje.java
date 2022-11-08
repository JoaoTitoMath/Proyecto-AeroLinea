package com.proyecto.aerolinea.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_pasaje")
@Data
public class Pasaje {

	@Column(name = "id_pasaje")
	private Integer codigo;

	@Column(name = "clase_pas")
	private String clase;

	@Column(name = "asiento_pas")
	private String asiento;

	@Column(name = "valor_pas")
	private int valor;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	public Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "id_vuelo")
	public Vuelo vuelo;

}
