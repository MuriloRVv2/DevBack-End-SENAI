package Lista_01;

import java.util.Scanner;

public class Algoritmo_106 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;

		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		char caractere = (char) nome.charAt(0);
		
		if(caractere == 'A' || caractere == 'a') {
			
			System.out.println("Seu nome: " + nome);
			
		} else {
			
			System.out.println("Seu nome não é válido");
			
		}
		
		
	}
	
}
