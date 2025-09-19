package Lista_01;

import java.util.Scanner;

public class Algoritmo_79 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double aplicacaoM;
		double taxa;
		int tempoM;
		
		System.out.println("Entre com o valor da aplicação mensal: ");
		aplicacaoM = sc.nextDouble();
		
		System.out.println("Entre com a porcentagem da taxa: ");
		taxa = sc.nextDouble();
		
		double porcentagem = taxa / 100;
		
		System.out.println("Entre com o tempo em meses: ");
		tempoM = sc.nextInt();
		
		double valorAcumulado = aplicacaoM * (Math.pow(1 + taxa, tempoM) - 1) / taxa;
		
		System.out.printf("O valor total acumulado: %.2f", valorAcumulado);
		
	}
	
}
