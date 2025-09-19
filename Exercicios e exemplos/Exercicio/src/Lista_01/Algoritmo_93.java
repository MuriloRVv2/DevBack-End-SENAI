package Lista_01;

import java.util.Scanner;

public class Algoritmo_93 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		double raiz = Math.sqrt(num);
		double quadrado = Math.pow(num, 2);
		
		if(num >= 0) {
			
			System.out.println("A raiz do número é: " + raiz);
			
		} else if(num < 0) {
			
			System.out.println("O quadrado do número é: " + quadrado);
			
		}
		
		
	}
	
}
