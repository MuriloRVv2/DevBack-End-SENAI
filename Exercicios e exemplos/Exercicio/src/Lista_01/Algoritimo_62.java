package Lista_01;

import java.util.Scanner;

public class Algoritimo_62 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorP;
		double desconto = 100 * 0.09;
		
		System.out.println("Entre com o valor do produto: ");
		valorP = sc.nextDouble();
		
		double novoValor = valorP - desconto;

		System.out.println("O novo valor do produto é de: " + novoValor);
		
		
		
	}
	
}
