package Lista_01;

import java.util.Scanner;

public class Algoritmo_108 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		int nomeDesejado = nome.indexOf("josé");
		int nomeDesejado1 = nome.indexOf("José");
		int nomeDesejado2 = nome.indexOf("JOSÉ");
		
		if(nomeDesejado == 0 || nomeDesejado1 == 0 || nomeDesejado2 == 0) {
			
			System.out.println(nome);
			
		} else {
			
			System.out.println("ERRO");
			
		}
		
		
		
		
		
		
	}
	
}
