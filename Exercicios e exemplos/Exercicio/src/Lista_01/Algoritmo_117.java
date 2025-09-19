package Lista_01;

import java.util.Scanner;

public class Algoritmo_117 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3, maior;
		
		System.out.println("Digite o 1° n°: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o 2° n°: ");
		num2 = sc.nextDouble();
		
		System.out.println("Digite o 3° n°: ");
		num3 = sc.nextDouble();
		
		if(num1 > num2 && num1 > num3) {
			
			maior = num1;
			System.out.println(maior);
			
		}
		else if(num2 > num1 && num2 > num3) {
			
			maior = num2;
			System.out.println(maior);
			
		}
		else if(num3 > num1 && num3 > num2) {
			
			maior = num3;
			System.out.println(maior);
			
		} else {
			
			System.out.println("Números iguais");
			
		}
		
		
	}
	
}
