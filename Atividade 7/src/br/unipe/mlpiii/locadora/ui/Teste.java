package br.unipe.mlpiii.locadora.ui;

import br.unipe.mlpiii.locadora.modelo.Fita;

public class Teste {

	public static void main(String[] args) {
		
			Fita filme1 = new Fita("Harry Potter", 1, 12.00);
			Fita filme2 = new Fita("Lilo e Stitch", 2, 7.00);
			
			System.out.println("O Filme lançamento que é " + filme1.getTitulo() + " custa?");
			System.out.println(filme1.calcularLocacao());
			System.out.println("O Filme infantil que é " + filme2.getTitulo() + " custa?");
			System.out.println(filme2.calcularLocacao());

		}
			

	}


