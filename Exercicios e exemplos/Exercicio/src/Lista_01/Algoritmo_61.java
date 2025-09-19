package Lista_01;

import java.util.Scanner;

public class Algoritmo_61 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int termo;
		int razao;
		
		System.out.println("Entre com o termo: ");
		termo = sc.nextInt();
		
		System.out.println("Entre com a razão: ");
		razao = sc.nextInt();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(termo);
			termo = termo * razao;
			
		}
		
		
		

		
	}
	
}
