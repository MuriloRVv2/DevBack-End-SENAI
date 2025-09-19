package Lista_01;

import java.util.Scanner;

public class Algoritimo_53 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ladoA;
		double ladoB;
		double ladoC;
		
		System.out.println("Entre com o lado A: ");
		ladoA = sc.nextDouble();
		System.out.println("Entre com o lado B: ");
		ladoB = sc.nextDouble();
		System.out.println("Entre com o lado C: ");
		ladoC = sc.nextDouble();
		
		double diagonal;
		diagonal = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2) + Math.pow(ladoC, 2));
		
		System.out.println("A diagonal do paralelepipedo é de: " + diagonal);
		
		
	}
	
}
