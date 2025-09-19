package Lista_01;

import java.util.Scanner;

public class Algoritmo_264 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0
					,num, media;
		
		int acm = 0;
		
		System.out.println("Digite um número positivo: ");
		num = sc.nextInt();
		
		while (true) {
			
			if(num >= 0) {
				
				soma = soma + num;
				acm = acm + 1;
				
			} else {
				break;
			}
			System.out.println("Digite um número positivo: ");
			num = sc.nextInt();
			
		}
		
		media = soma / acm;
		System.out.println("Média: " + media);
	}
	
}
