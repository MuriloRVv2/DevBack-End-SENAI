package Lista_01;

import java.util.Scanner;

public class Algoritmo_121 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		
		System.out.println("Digite um número(1°): ");
		num1 = sc.nextInt();
		System.out.println("Digite um número(2°): ");
		num2 = sc.nextInt();
		System.out.println("Digite um número(3°): ");
		num3 = sc.nextInt();
		System.out.println("Digite um número(4°): ");
		num4 = sc.nextInt();
		System.out.println("Digite um número(5°): ");
		num5 = sc.nextInt();
		
			int maior = num1;
	        int menor = num1;

	        if (num2 > maior) maior = num2;
	        if (num3 > maior) maior = num3;
	        if (num4 > maior) maior = num4;
	        if (num5 > maior) maior = num5;

	        if (num2 < menor) menor = num2;
	        if (num3 < menor) menor = num3;
	        if (num4 < menor) menor = num4;
	        if (num5 < menor) menor = num5;

	        System.out.println("Maior número: " + maior);
	        System.out.println("Menor número: " + menor);
		
		
		
		
	}
	
}
