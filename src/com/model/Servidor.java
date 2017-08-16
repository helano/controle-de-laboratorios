package com.model;

public class Servidor {
	private String  idServidor;
	private String nome ;
	private int cpf;
	private String suap;
	private String funcao;


	public String getIdServidor() {
		return idServidor;
	}
	public void setIdServidor(String idServidor) {
		this.idServidor = idServidor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSuap() {
		return suap;
	}
	public void setSuap(String suap) {
		this.suap = suap;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	@Override
	public String toString() {
		return "Servidor [idServidor=" + idServidor + ", nome=" + nome + ", cpf=" + cpf + ", suap=" + suap + ", funcao="
				+ funcao + "]";
	}






}
