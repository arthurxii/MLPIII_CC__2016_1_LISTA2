package br.unipe.mlpiii.locadora.modelo;

public class Fita {
	private String titulo;
	private double pre�o;
	private String autor;
	private int tipo;
	private enum Categoria{
		lan�amento, infantil;
	}
	public Fita(String titulo, int tipo, double preco) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.pre�o = preco;
}
	public double calcularLocacao(){
		if (tipo == 1){
			pre�o += ((pre�o * 20)/100);
		} else if (tipo == 2) {
			pre�o -= ((pre�o * 40)/100);
		}
		return pre�o;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}	
