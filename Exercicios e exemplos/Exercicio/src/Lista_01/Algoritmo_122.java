package Lista_01;

import java.util.Scanner;

public class Algoritmo_122 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC;

		System.out.println("Digite o valor do lado A: ");
		ladoA = sc.nextDouble();
		
		System.out.println("Digite o valor do lado B: ");
		ladoB = sc.nextDouble();
		
		System.out.println("Digite o valor do lado C: ");
		ladoC = sc.nextDouble();
		
		if(ladoA + ladoB > ladoC || ladoA + ladoC > ladoB || ladoB + ladoC > ladoA) {
			
			System.out.println("É um triângulo");
			
		} else {
			System.out.println("Não é um triângulo.");
		}

		
		
	}
	
}
