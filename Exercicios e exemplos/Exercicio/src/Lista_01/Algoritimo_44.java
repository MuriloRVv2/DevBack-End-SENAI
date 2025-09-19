package Lista_01;

import java.util.Scanner;

public class Algoritimo_44 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int base;
		
		System.out.println("Entre com um número: ");
		numero = sc.nextInt();
		
		System.out.println("Entre com a base logaritmica: ");
		base = sc.nextInt();
		
		double log = Math.log(numero) / Math.log(base);
		
		System.out.printf("Resultado: %.2f%n",  log);
		
		
		
	}
	
}
