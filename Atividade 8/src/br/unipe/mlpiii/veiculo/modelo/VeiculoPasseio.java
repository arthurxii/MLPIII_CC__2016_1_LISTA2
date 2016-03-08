package br.unipe.mlpiii.veiculo.modelo;

public class VeiculoPasseio extends Veiculo {
	private boolean possuiAr;
	private int qtdPortas;
	
	public VeiculoPasseio(String string, String marca, String string2, int ano, double valorKmRodado, double KmInicial,
			double KmFinal, boolean b, int chassi) {
		super(string, marca, string2, ano, valorKmRodado, KmInicial, KmFinal);
		this.possuiAr = possuiAr;
		this.qtdPortas = qtdPortas;
		
		
	}


	public boolean isPossuiAr() {
		return possuiAr;
	}

	public void setPossuiAr(boolean possuiAr) {
		this.possuiAr = possuiAr;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
}
