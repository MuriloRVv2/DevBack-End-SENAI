package Lista_01;

import java.util.Scanner;

public class Algoritmo_263 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, acm = 0;
		
		System.out.println("Digite um número positivo: ");
		num = sc.nextInt();
		
		while (true) {
			
			if (num >= 0) {
				
				acm = acm + 1;
				
			}  else {
				break;
			}
			
			System.out.println("Digite um número positivo: ");
			num = sc.nextInt();
			
		} 
		
		System.out.println("Total de números digitados: " + acm);
		
	}
	
}
