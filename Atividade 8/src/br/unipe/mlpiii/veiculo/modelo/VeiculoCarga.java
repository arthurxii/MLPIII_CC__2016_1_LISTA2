package br.unipe.mlpiii.veiculo.modelo;

public class VeiculoCarga extends Veiculo {
	protected double capacidadeCarga;
	
	public VeiculoCarga(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, double capacidadeCarga) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.capacidadeCarga = capacidadeCarga;
	}
	

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}


	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

}
