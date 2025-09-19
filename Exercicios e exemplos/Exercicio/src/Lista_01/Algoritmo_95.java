package Lista_01;

import java.util.Scanner;

public class Algoritmo_95 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		double divisao = (int) num % 5;
		
		if(divisao == 0) {
			
			System.out.println("É divisivel por 5.");
			
		} else if (divisao >= 1) {
			
			System.out.println("Não é divisivel por 5.");
			
		}
		
	}
	
}
