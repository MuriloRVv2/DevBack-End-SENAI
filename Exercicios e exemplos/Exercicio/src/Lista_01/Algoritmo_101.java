package Lista_01;

import java.util.Scanner;

public class Algoritmo_101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if (num >= 20 && num <= 90) {
			
			System.out.println("Está compreendido entre 20 e 90");
			
		} else {
			
			System.out.println("Não está compreendido entre 20 e 90");
			
		}
		
		
	}
	
}
