package br.unipe.java.unidade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		System.out.println("Informe o nome do chachorro: ");
		cachorro.nome = leitor.nextLine();
		cachorro.late();
		
		
		Carro ferrari = new Carro();
		ferrari.retroceder();
		ferrari.avancar();
		ferrari.setCor("prata");
		System.out.println(ferrari.getCor());
		
		Carro fusca = new Carro();
		fusca.abastecer();
		fusca.parar();
		
		
		
		
	}

}
