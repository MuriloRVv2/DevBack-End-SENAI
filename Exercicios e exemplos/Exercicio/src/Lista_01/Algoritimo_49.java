package Lista_01;

import java.util.Scanner;

public class Algoritimo_49 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int tamanho;
		
		System.out.println("Digite seu nome completo: ");
		nome = sc.nextLine();
		
		tamanho = nome.length();
		
		
		System.out.println("Nome completo: " + nome + 
										"\nPrimeiro caractere: " + nome .charAt(0) + 
										"\nÚltimo caractere: " + nome .charAt(tamanho-1) + 
										"\nDo primeiro ao terceiro caractere: " + nome.substring(0, 3) +  										
										"\nQuarto caractere: " + nome .charAt(3) +
										"\nTodos menos o primeiro: " + nome.substring(1, tamanho) +
										"\nOs dois últimos: " + nome.substring(tamanho -2));
		
		
	}
	
}
