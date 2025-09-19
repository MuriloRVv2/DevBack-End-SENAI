package Lista_01;

import java.util.Scanner;

public class Algoritimo_37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero01;
		int numero02;
		int mult;
		
		
		System.out.println("Digite um número para multiplicar: ");
		numero01 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		numero02 = sc.nextInt();
		
		mult = numero01 * numero02;
		
		System.out.println("A soma dos números " + numero01 + " e " + numero02 + " é " + mult);
		
	}
	
}
