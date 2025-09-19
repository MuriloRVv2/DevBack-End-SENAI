package Lista_01;

import java.util.Scanner;

public class Algoritmo_42 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double angulos;
		
		System.out.println("Digite o valor do ângulo: ");
		angulos = sc.nextDouble();
		
		double radianos = Math.toRadians(angulos);
		
		 double cst = 1.0 / Math.sin(radianos);
		 double cot = 1.0 / Math.tan(radianos);
		 double sen = Math.sin(radianos);
		 double cos = Math.cos(radianos);
		 double tan = Math.tan(radianos);

		 System.out.println("Valor do Sen: " + sen +
		 								"\nValor do Cos: " + cos +
		 								"\nValor da Tan: " + tan +
		 								"\nValor do Cossecante: " + cst +
		 								"\nValor do Cotangente: " + cot);
		
	}
	
}
