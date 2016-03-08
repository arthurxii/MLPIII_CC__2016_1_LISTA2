package br.unipe.mlpiii.veiculo.ui;

import br.unipe.mlpiii.veiculo.modelo.VeiculoCarga;
import br.unipe.mlpiii.veiculo.modelo.VeiculoPasseio;

public class Main {

	public static void main(String[] args) {
		VeiculoCarga pesadao = new VeiculoCarga("MOW-3530", "Fiat Palio", "2016", 2014, 5, 200, 150, 1000);
		VeiculoPasseio suave = new VeiculoPasseio("JVM-2257", "Bugatti Veyron", "2016", 2012, 3, 230, 120, true, 2);
		
		System.out.println("O Kilometro inicial é " + pesadao.getKmInicial() + ", O kilomentro final é " + pesadao.getKmFinal() + ", Qual o valor no veiculo de carga? ");
		System.out.println("O preço por kilometro é " + pesadao.getValorKmRodado() + " Na marca " + pesadao.getMarca() + " Que suporta " + pesadao.getCapacidadeCarga() + " Kg" + ", O valor é R$ " + pesadao.calcularLocacao());
		System.out.println("Já no veiculo de passeio o kilometro inicial é " + suave.getKmInicial() + " O kilometro final é " + suave.getKmFinal() + " Quanto custa? ");
		System.out.println("O preço por kilometro é " + suave.getValorKmRodado() + ", Na marca " + suave.getMarca() + ", O valor é " + suave.calcularLocacao());


	}
}

