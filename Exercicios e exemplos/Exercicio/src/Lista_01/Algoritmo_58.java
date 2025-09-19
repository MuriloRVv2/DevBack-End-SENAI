package Lista_01;

import java.util.Scanner;

public class Algoritmo_58 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double log64 = Math.log(64) / Math.log(2);

		System.out.println("Entre com o valor do primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Entre com o valor do segundo número: ");
		num2 = sc.nextDouble();

		System.out.println("Entre com o valor do terceiro número: ");
		num3 = sc.nextDouble();
		
		double x = num1 + (num2 / num3 + num1) + 2 * (num1 - num2) + log64;

		System.out.println(x);
		
		
		
		
		
	}
	
}
