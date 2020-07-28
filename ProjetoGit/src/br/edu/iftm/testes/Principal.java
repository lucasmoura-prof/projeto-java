package br.edu.iftm.testes;

import matematica.Soma;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Olá mundo!!! 123");
		Soma soma = new Soma();
		System.out.println(soma.calcular(5, 10));
		System.out.println(soma.calcular(2, 3));
	}

}
