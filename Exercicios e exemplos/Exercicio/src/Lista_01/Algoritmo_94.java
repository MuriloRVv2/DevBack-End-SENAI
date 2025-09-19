package Lista_01;

import java.util.Scanner;

public class Algoritmo_94 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		double divisao = (int) num % 3;
		
		if(divisao == 0) {
			
			System.out.println("Múltiplo de 3");
			
		} else if(divisao == 1){
			
			System.out.println("Não é multiplo de 3.");
			
		}
		
		
		
	}
	
}
