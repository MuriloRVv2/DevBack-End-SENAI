package Lista_01;

import java.util.Scanner;

public class Algoritmo_265 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, acm = 0;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		while (true) {
			
			if(num > 0) {
				
				if(num >= 100 && num <= 200) {
					
					acm = acm + 1;
					
				} else {
					break;
				}
				
				System.out.println("Digite um número: ");
				num = sc.nextInt();
				
			}
			
		}
		System.out.println("Qntd de números digitados foi: " + acm);
		
	}
	
}
