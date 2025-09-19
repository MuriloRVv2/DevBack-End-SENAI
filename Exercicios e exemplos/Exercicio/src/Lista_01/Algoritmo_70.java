package Lista_01;

import java.util.Scanner;

public class Algoritmo_70 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double despesas;
		double gorjeta;
		double valorTotal;
		
		System.out.println("Entre com o valor total das despesas do restaurante: ");
		despesas = sc.nextDouble();
		
		gorjeta = despesas * 0.10;
		
		valorTotal = despesas + gorjeta;
		
		System.out.println("O valor total de custos do restaurante é de: " + valorTotal);
		
		
	}
	
}
