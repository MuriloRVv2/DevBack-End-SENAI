package Lista_01;

import java.util.Scanner;

public class Algoritmo_68 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A;
		String B;
		
		System.out.println("Entre com o valor de A: ");
		A = sc.nextLine();
		
		System.out.println("Entre com o valor de B: ");
		B = sc.nextLine();
		
		String AB = B; //A para B
		String BA = A; //B para A
		
		System.out.println("Os valores trocados de: \nA = " + AB 
																				+ "\nB = " + BA);
		
	}
	
}
