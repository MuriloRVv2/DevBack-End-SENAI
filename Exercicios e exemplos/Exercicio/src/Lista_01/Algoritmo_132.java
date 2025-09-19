package Lista_01;

import java.util.Scanner;

public class Algoritmo_132 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String op;
		double reais, dolar, francoSui, libraEster, marcoAlema;
		
		System.out.println("Digite o valor em R$(Reais): ");
		reais = sc.nextDouble();
		
		libraEster = 6.25 * reais;
		dolar = 5.00 * reais;
		francoSui = 5.50 * reais;
		marcoAlema = 2.85 * reais;
		
		System.out.println("Digite a moeda que deseja converter: "
											+ "\n\n"
											+ "F - Franco Suiço \nL - Libra Esterlina \nD - Dólar Americano \nM - Marco Alemão");
		op = sc.next();
		switch (op) {
		case "F":
			System.out.println("Valor convertido: \n"
											+		"Franco Suíço: " + francoSui);	
		break;
		case "L": 
			System.out.println("Valor convertido: \n"
											+		 "Libra Esterlina: " + libraEster);
		break;
		case "D": 
			System.out.println("Valor convertido: \n"
											+		 "Dólar Americano: " + dolar);
		break;
		case "M": 
			System.out.println("Valor convertido: \n"
											+		 "Marco Alemão: " + marcoAlema);
		break;
		default:System.out.println("Moeda inválida ou não disponível para conversão.");
			break;
		}
		
		
		
	}
	
}
