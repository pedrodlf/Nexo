package com.nexo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Nexo {

	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private Long idComercial;
	@Column
	private Long idCliente;
	
	public Nexo(Long id, Long idComercial, Long idCliente) {
		super();
		this.id = id;
		this.idComercial = idComercial;
		this.idCliente = idCliente;
	}

	public Nexo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdComercial() {
		return idComercial;
	}

	public void setIdComercial(Long idComercial) {
		this.idComercial = idComercial;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
