package Lista_01;

import java.util.Scanner;

public class Algoritmo_109 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		
		System.out.println("Digite o primeiro nome: ");
		nome1 = sc.nextLine();
		
		System.out.println("Digite o segundo nome: ");
		nome2 = sc.nextLine();
		
		if(nome1.compareTo(nome2) < 0) {
			
			System.out.println(nome1 + ", " + nome2);
			
		} else {
			
			System.out.println(nome2 + ", " + nome1);
			
		}
		
		
	}
	
}
