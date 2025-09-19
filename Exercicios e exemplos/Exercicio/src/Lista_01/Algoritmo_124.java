package Lista_01;

import java.util.Scanner;

public class Algoritmo_124 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anguloA, anguloB, anguloC;

		System.out.println("Digite o ângulo do lado A: ");
		anguloA = sc.nextInt();

		System.out.println("Digite o ângulo do lado B: ");
		anguloB = sc.nextInt();

		System.out.println("Digite o ângulo do lado C: ");
		anguloC = sc.nextInt();
		
		if(anguloA < 90 && anguloB < 90 && anguloC < 90) {
			
			System.out.println("Triângulo acutângulo");
			
		} else if(anguloA == 90 || anguloB == 90 || anguloC == 90) {
			
			System.out.println("Triângulo retângulo");
			
		} else {
			System.out.println("Triângulo obtusângulo");
		}

		
	}
	
}
