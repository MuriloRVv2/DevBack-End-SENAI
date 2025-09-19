package Lista_01;

import java.util.Scanner;

public class Algoritmo_96 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		double divisao3 = (int) num % 3;
		double divisao7 = (int) num % 7;
		
		if(divisao3 == 0 && divisao7 == 0) {
			
			System.out.println("O número é divisivel por 3 e por 7.");
			
		} else if(divisao3 >= 1 && divisao7 >= 1 || divisao3 < 0 && divisao7 < 0) {
			
			System.out.println("O número não é divisivel por 3 nem por 7.");
			
		}
		
		
		
	}
	
}
