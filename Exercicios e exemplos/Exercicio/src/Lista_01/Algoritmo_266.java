package Lista_01;

import java.util.Scanner;

public class Algoritmo_266 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite um nome: ");
		nome = sc.nextLine();
		
		
		
		while (true) {
			
			if(nome.equalsIgnoreCase("FIM")) {
				break;				
			} if(!nome.isEmpty()) {
				
				System.out.println("Nome: " + nome + "\nPrimeiro caracter: " + nome.charAt(0));				
				
			}
			
			System.out.println("Digite um nome: ");
			nome = sc.nextLine();
			
		}
		
	}
	
}
