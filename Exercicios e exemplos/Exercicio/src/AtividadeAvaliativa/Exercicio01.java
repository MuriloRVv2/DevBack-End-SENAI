package AtividadeAvaliativa;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioAtual, novoSalario, valorAumento, percentual;
		
		System.out.println("=============== OLÁ FUNCIONÁRIO ==================");
		System.out.println("\n=============== Digite seu salário ===============");
		
		salarioAtual = sc.nextDouble();
		
		if(salarioAtual <= 1000.00) {
			
			System.out.println("Você receberá um aumento de 40% ");
			percentual = 0.40;
			valorAumento = percentual * salarioAtual;
			novoSalario = valorAumento + salarioAtual;
			
			System.out.println("Salário antigo: " + salarioAtual
							+ "\nValor do aumento: " + valorAumento
							+ "\nNovo salário: " + novoSalario);
			
		} if (salarioAtual > 1000.00) {
			
			System.out.println("Você receberá um aumento de 30%");
			percentual = 0.30;
			valorAumento = percentual * salarioAtual;
			novoSalario = valorAumento + salarioAtual;
			
			System.out.println("Salário antigo: " + salarioAtual
							+ "\nValor do aumento: " + valorAumento
							+ "\nNovo salário: " + novoSalario);
		}	
	}
}
