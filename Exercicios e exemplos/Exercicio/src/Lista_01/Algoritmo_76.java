package Lista_01;

import java.util.Scanner;

public class Algoritmo_76 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Entre com um número entre 0 e 60 e veja seu sucessor: ");
		numero = sc.nextInt();
		
		int sucessor = (numero + 1) %61;
		System.out.println("O sucessor é: " + sucessor);
		
		
		
	}
	
}
