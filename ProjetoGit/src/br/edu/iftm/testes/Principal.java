package br.edu.iftm.testes;

import matematica.Soma;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Ol� mundo!");
		Soma soma = new Soma();
		System.out.println(soma.calcular(5, 10));
	}

}
