package Lista_01;

import java.util.Scanner;

public class Algoritimo_36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero01;
		int numero02;
		int soma;
		
		
		System.out.println("Digite um número para somar: ");
		numero01 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		numero02 = sc.nextInt();
		
		soma = numero01 + numero02;
		
		System.out.println("A soma dos números " + numero01 + " e " + numero02 + " é " + soma);
		
	}
	
}
