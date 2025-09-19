package Lista_01;

import java.util.Scanner;

public class Algoritimo_46 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double saldo;
		double reajuste = 100 * 0.01;
		
		System.out.println("Entre com o saldo da aplicação: ");
		saldo = sc.nextDouble();
		double novoValor = saldo + ((saldo  / 100)*reajuste);
		System.out.printf("O novo saldo é de:  %.2f%n", novoValor);
		
		
	}
	
}
