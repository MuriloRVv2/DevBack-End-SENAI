package Lista_01;

import java.util.Scanner;

public class Algoritimo_43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numero;
		
		System.out.println("Entre com um número: ");
		numero = sc.nextDouble();
		
		double log = Math.log10(numero);
		
		System.out.println("O logaritimo de " + numero + " é: " + log);
		
		
	}
	
}
