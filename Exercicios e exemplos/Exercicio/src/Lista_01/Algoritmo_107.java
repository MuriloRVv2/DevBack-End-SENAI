package Lista_01;

import java.util.Scanner;

public class Algoritmo_107 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine() .toUpperCase();
		
		int nomeDesejado = nome.indexOf("JOSÉ");
		
		if(nomeDesejado == 0) {
			
			System.out.println(nome);
			
		} else {
			
			System.out.println("ERRO");
			
		}
		
		
		
		
		
		
	}
	
}
