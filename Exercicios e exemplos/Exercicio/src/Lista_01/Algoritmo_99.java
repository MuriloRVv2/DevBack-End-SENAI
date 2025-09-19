package Lista_01;

import java.util.Scanner;

public class Algoritmo_99 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, unidade, dezena, centena;
		
		
		System.out.println("Entrar com um número de 3 digitos: ");
		num = sc.nextInt();
		
		unidade = num % 10;
		dezena = (num / 10) % 10;
		centena =  num / 100;

		double div = centena % 2;
		
		if(div == 0) {
			
			System.out.println("É par");
			
		} else if(div >= 1) {
			
			System.out.println("É ímpar");
			
		}
		
		
		
	}
	
}
