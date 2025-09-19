package Lista_01;

import java.util.Scanner;

public class Algoritmo_72 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double deposito;
		double taxaJuros = 0.06;
		
		System.out.println("Insira o valor do depósito: ");
		deposito = sc.nextDouble();
		
		double rendimento = deposito * taxaJuros;
		double valorTotal = rendimento + deposito;
		
		System.out.printf("O valor do rendimento foi de: %.2f",  rendimento);
		System.out.printf("\nO valor total com o rendimento é de: %.2f",  valorTotal);
		
		
		
		
		
	}
	
}
