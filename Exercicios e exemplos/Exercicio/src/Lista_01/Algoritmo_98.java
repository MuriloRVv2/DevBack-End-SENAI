package Lista_01;

import java.util.Scanner;

public class Algoritmo_98 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioB,  valorPres, limitePrest;
		
		System.out.println("Entre com o valor do salário bruto: ");
		salarioB = sc.nextDouble();
		
		System.out.println("Entre com o valor da prestação: ");
		valorPres = sc.nextDouble();
		
		limitePrest = salarioB * 0.30;
		
		if(valorPres <= limitePrest) {
			
			System.out.println("Empréstimo pode ser concedido.");
			
		} else if(valorPres > limitePrest) {
			
			System.out.println("Empréstimo não pode ser concedido.");
			
		}
		
		
	}
	
}
