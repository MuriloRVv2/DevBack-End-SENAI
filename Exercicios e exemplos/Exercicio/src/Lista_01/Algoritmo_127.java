package Lista_01;

import java.util.Scanner;

public class Algoritmo_127 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double nota1, nota2, media;
		
		System.out.println("Entre com seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite sua nota da 1ª nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite sua nota da 2ª nota: ");
		nota2 = sc.nextDouble();

		media = (nota1 + nota2)/ 2;
		
		if(media < 3) {
			System.out.println("REPROVADO(A)");
		} else if (media >=7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("PROVA FINAL");
		}
		
	}
	
}
