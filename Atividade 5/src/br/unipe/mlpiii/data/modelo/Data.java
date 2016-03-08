package br.unipe.mlpiii.data.modelo;

public class Data {
	private int dia;  
	private int mes;  
	private int ano;    
	
	public Data() {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Data(int dia, int mes) { 
		this.dia = dia;
		this.mes = mes;
		this.ano = 2016; 
	}
	  public String toString() {
		  return dia + "/" + mes + "/" + ano;  
		  }

}
