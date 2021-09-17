package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class TipoCambio {
//mark id as primary key
	@Id
//defining id as column name
	@Column
	private int id;
//defining monedaOrigen as column name
	@Column
	private String monedaOrigen;
//defining monto as column name
	@Column
	private double monto;
//defining monedaDestino as column name
	@Column
	private String monedaDestino;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

}