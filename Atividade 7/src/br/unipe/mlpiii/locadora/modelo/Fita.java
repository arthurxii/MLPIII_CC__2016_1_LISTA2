package br.unipe.mlpiii.locadora.modelo;

public class Fita {
	private String titulo;
	private double preço;
	private String autor;
	private int tipo;
	private enum Categoria{
		lançamento, infantil;
	}
	public Fita(String titulo, int tipo, double preco) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.preço = preco;
}
	public double calcularLocacao(){
		if (tipo == 1){
			preço += ((preço * 20)/100);
		} else if (tipo == 2) {
			preço -= ((preço * 40)/100);
		}
		return preço;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}	
