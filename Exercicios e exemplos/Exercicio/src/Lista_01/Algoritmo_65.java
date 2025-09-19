package Lista_01;

import java.util.Scanner;

public class Algoritmo_65 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double volume = 3.14159;
		double raio;
		double altura;
		
		System.out.println("Entre com o raio da lata: ");
		raio = sc.nextDouble();
		
		System.out.println("Entre com a altura da lata: ");
		altura = sc.nextDouble();
		
		double formula = volume * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume total da lata é de: " + formula);
		
		
		
	}
	
}
