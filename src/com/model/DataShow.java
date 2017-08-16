package com.model;

import java.io.Serializable;

public class DataShow implements Serializable {
	private int idChave;
	private String marca;
	private String modelo;
	private String codigo;

	public int getIdChave() {
		return idChave;
	}
	public void setIdChave(int idChave) {
		this.idChave = idChave;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "DataShow [idChave=" + idChave + ", marca=" + marca + ", modelo=" + modelo + ", codigo=" + codigo + "]";
	}




}
