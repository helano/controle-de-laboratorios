package com.model;

import java.io.Serializable;

public class Chave implements Serializable  {

	private static final long serialVersionUID = 1L;
	private long id;
	private String nomeSala;
    private String numero;
    private String bloco;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeSala() {
		return nomeSala;
	}
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		
		return "Chave [id=" + id + ", nomeSala=" + nomeSala + ", numero=" + numero + ", bloco=" + bloco + "]";
	
	}
    
}
