package Lista_01;

import java.util.Scanner;

public class Algoritimo_48 {

	public static void main(String[] args) {
		
		//100 quilowats = 1/7 de 1518
		
		Scanner sc = new Scanner(System.in);
		
		double salarioMin = 1518.0;
		double quilowatts;
		double desconto = 0.10;
		
		System.out.println("Digite quantos quilowatts a residência gasta?");
		quilowatts = sc.nextDouble();
		
		double valorQuilowatts  = salarioMin / 7;
		double uniQuilowatt = valorQuilowatts / 100; 
		double valorTotalQuilowatts = uniQuilowatt * quilowatts;
		desconto = valorTotalQuilowatts - (valorTotalQuilowatts * desconto);
		
		System.out.printf("O valor de cada quilowatt é de: R$ %.2f%n", uniQuilowatt);
		System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotalQuilowatts);
		System.out.printf("O novo valor a ser pago com deconto é: R$ %.2f%n", desconto);
		
		sc.close();
		
	}
	
}
