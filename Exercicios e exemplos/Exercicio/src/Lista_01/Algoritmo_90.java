package Lista_01;

import java.util.Scanner;

public class Algoritmo_90 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Entre com um número: ");
		numero = sc.nextInt();
		
		if(numero >= 20) {
			
			System.out.println("Número: " + numero);
			
		} else {
			
			System.out.println("Número menor que 20");
			
		}
		
	}
	
}
