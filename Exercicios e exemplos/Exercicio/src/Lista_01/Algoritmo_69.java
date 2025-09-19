package Lista_01;

import java.util.Scanner;

public class Algoritmo_69 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numerador;
		double denominador;
		
		System.out.println("Entre com o numerador: ");
		numerador = sc.nextInt();
		
		System.out.println("Entre com denominador: ");
		denominador = sc.nextInt();
		
		double resultado = numerador / denominador;
		
		System.out.println("O resultado da fração é: " + resultado);
		
	}
	
}
