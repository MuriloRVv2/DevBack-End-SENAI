package Lista_01;

import java.util.Scanner;

public class Algoritmo_110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
		if(num1 == num2) {
			
			System.out.println("Os números são iguais.");
			
		} else {
			
			System.out.println("Os números são diferentes.");
			
		}
		
	}
	
}
