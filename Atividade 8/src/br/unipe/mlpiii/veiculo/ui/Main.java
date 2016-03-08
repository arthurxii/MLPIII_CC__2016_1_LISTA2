package br.unipe.mlpiii.veiculo.ui;

import br.unipe.mlpiii.veiculo.modelo.VeiculoCarga;
import br.unipe.mlpiii.veiculo.modelo.VeiculoPasseio;

public class Main {

	public static void main(String[] args) {
		VeiculoCarga pesadao = new VeiculoCarga("MOW-3530", "Fiat Palio", "2016", 2014, 5, 200, 150, 1000);
		VeiculoPasseio suave = new VeiculoPasseio("JVM-2257", "Bugatti Veyron", "2016", 2012, 3, 230, 120, true, 2);
		
		System.out.println("O Kilometro inicial � " + pesadao.getKmInicial() + ", O kilomentro final � " + pesadao.getKmFinal() + ", Qual o valor no veiculo de carga? ");
		System.out.println("O pre�o por kilometro � " + pesadao.getValorKmRodado() + " Na marca " + pesadao.getMarca() + " Que suporta " + pesadao.getCapacidadeCarga() + " Kg" + ", O valor � R$ " + pesadao.calcularLocacao());
		System.out.println("J� no veiculo de passeio o kilometro inicial � " + suave.getKmInicial() + " O kilometro final � " + suave.getKmFinal() + " Quanto custa? ");
		System.out.println("O pre�o por kilometro � " + suave.getValorKmRodado() + ", Na marca " + suave.getMarca() + ", O valor � " + suave.calcularLocacao());


	}
}

