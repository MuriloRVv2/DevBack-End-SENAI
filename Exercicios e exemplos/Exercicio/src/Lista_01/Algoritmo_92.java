package Lista_01;

import java.util.Scanner;

public class Algoritmo_92 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Entre com o primeiro número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		int soma8 = soma + 8; 
		int soma5 = soma + 5;
		
		if(soma >= 20) {
			
			System.out.println("O resultado é: " + soma +
											"\nO resultado somado a 8 é: " + soma8);
			
		} else if (soma < 20) {
			
			System.out.println("O resultado é: " + soma +
											"\nO resultado somado a 5 é: " + soma5);
			
		}
		
	}
	
}
