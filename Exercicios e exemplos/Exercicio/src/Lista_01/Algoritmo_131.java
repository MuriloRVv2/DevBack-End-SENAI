package Lista_01;

import java.util.Scanner;

public class Algoritmo_131 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite o nome do aluno: ");
		nome=sc.next();
		
		char primeiraLetra =  Character.toUpperCase(nome.charAt(0));
		
		if(primeiraLetra >= 'A' && primeiraLetra <= 'K') {
			System.out.println("Sala 101");
		}
		else if(primeiraLetra >= 'L' && primeiraLetra <= 'N') {
			System.out.println("Sala 102");
		}
		else if(primeiraLetra >= 'O' && primeiraLetra <= 'Z') {
			System.out.println("Sala 103");
		}else {
			System.out.println("Nome com caracter inválido.");
		}
		
		
	}
	
}
