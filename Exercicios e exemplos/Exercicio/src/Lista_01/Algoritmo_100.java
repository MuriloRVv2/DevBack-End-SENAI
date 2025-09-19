package Lista_01;

import java.util.Scanner;

public class Algoritmo_100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,  unidade, dezena, centena, milhar;
		
		
		System.out.println("Entrar com um número de 4 digitos: ");
		num = sc.nextInt();
		
		unidade = num % 10;
		dezena = (num / 10) % 10;
		centena =  num / 100;
		milhar = num / 1000;

		int novoNumero = milhar * 10 + centena;
		
		if(novoNumero % 4 == 0) {
			
			System.out.println("É multiplo de 4");
			
		} else {
			
			System.out.println("Não é multiplo de 4");
			
		}
		
		
		
	}
	
}
