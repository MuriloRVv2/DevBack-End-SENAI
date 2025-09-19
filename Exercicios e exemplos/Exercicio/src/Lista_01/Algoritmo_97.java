package Lista_01;

import java.util.Scanner;

public class Algoritmo_97 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		double divisao10 = (int) num % 10;
		double divisao5 = (int) num % 5;
		double divisao2 = (int) num % 2;
		
		if(divisao10 == 0 && divisao5 == 0 && divisao2 == 0) {
			
			System.out.println("O número é divisivel por 10, 5 e 2.");
			
		} else if(divisao10 >= 1 && divisao5 >= 1 && divisao2 >=1 || divisao10 < 0 && divisao5 < 0 && divisao2 < 0) {
			
			System.out.println("O número não é divisivel por 10, 5 e 2.");
			
		}
		
		
		
	}
	
}
