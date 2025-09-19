package Lista_01;

import java.util.Scanner;

public class Algoritmo_115 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextDouble();

		num1 = (int) Math.sqrt(num1);
		num2 = Math.pow(num2, 2);
		
		if(num1 > num2 ) {
			
			System.out.println( "Número ao ²: " + num2 + 
												"\nRaiz do número: " + num1);
			
		} 		
		
	}
	
}
