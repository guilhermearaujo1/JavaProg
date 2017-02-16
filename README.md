# JavaProg
package br.unipe.java.unidade1;

import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		int z = 0;
		Scanner leitor = new Scanner(System.in);
		z = leitor.nextInt();
		
		while (z > 0) {
			System.out.println("Agora são: " +z);
			z = z - 1;
			System.out.println("Pego uma garrafa, passo para frente.");
			System.out.println("Agora são "+z+"cervejas na freezer");
			
			if(z==0){
				System.out.println("Suas cervejas acabaram, quantas cervejas deseja adicionar");
				z = leitor.nextInt();
				System.out.println(z + "Adicionadas");
			}
		}
		
	}
}
