package Lista_01;

import java.util.Scanner;

public class Algoritmo_77 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero1;
		double numero2;
		
		System.out.println("Entre com o primeiro número: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		numero2 = sc.nextDouble();
		
		double diferencaValores = Math.pow((numero1 - numero2), 2);
		double diferencaQuadrados = numero1 - numero2;
		
		System.out.println("A diferença do primeiro valor pelo segundo: " + diferencaValores);
		System.out.println("A diferença dos quadrados: " + diferencaQuadrados);
		
	} 
	
}
