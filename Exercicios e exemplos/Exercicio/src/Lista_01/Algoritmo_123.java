package Lista_01;

import java.util.Scanner;

public class Algoritmo_123 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC;
		int anguloA, anguloB, anguloC;

		System.out.println("Digite o valor do lado A: ");
		ladoA = sc.nextDouble();
		System.out.println("Digite o ângulo do lado A: ");
		anguloA = sc.nextInt();
		
		System.out.println("Digite o valor do lado B: ");
		ladoB = sc.nextDouble();
		System.out.println("Digite o ângulo do lado B: ");
		anguloB = sc.nextInt();
		
		System.out.println("Digite o valor do lado C: ");
		ladoC = sc.nextDouble();
		System.out.println("Digite o ângulo do lado C: ");
		anguloC = sc.nextInt();
		
		if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
			anguloA = 60;
			anguloB = 60;
			anguloC = 60;
			System.out.println("Triângulo equilátero");
			
		} else if(anguloA == anguloB && ladoA == ladoB || anguloA == anguloC && ladoA == ladoC|| anguloB == anguloC && ladoB == ladoC) {
			
			System.out.println("Triângulo isóceles");
			
		} else {
			System.out.println("Triângulo escaleno");
		}
		
	}
	
}
