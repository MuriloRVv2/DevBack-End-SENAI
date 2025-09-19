package Lista_01;

import java.util.Scanner;

public class Algoritmo_73 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numeroReal;
		
		System.out.println("Entre com um número real: ");
		numeroReal = sc.nextDouble();
		
		int parteInteira = (int) numeroReal ;
		double parteFracionaria = (numeroReal - parteInteira);
		int arredondado= (int) Math.round(numeroReal);
		
		System.out.println("NÚMERO: " + numeroReal);
		System.out.println("Parte inteira do número real: " + parteInteira
									+ "\nParte fracionaria do número real: " + parteFracionaria
									+ "\nO número real arredondado: " + arredondado);
		
		
	}
	
}
