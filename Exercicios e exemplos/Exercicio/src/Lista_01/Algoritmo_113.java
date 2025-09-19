package Lista_01;

import java.util.Scanner;

public class Algoritmo_113 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
		if(num1 < num2) {
			
			System.out.println( num1 + ", " + num2);
			
		} else if (num2 < num1) {
			
			System.out.println(num2 + ", " + num1);
			
		} else { 
			
			System.out.println("Os números são iguais");
			
		}
		
	}
	
}
