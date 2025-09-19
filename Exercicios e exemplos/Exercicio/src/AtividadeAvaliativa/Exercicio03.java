package AtividadeAvaliativa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double NIVEL1 = 51.50;
		final double NIVEL2 = 65;
		final double NIVEL3 = 80;
		final double NIVEL4 = 100;
		double  valorFinal;
		String entrada;
		int dia;
		
		System.out.println("===== ESCOLA DO TIO SAM =====");
		System.out.println("Digite o plano escolhido: "
					+   "\nNivel I - R$51,50 (1)"
					+   "\nNivel II - R$65,00 (2)"
					+   "\nNivel III - R$80,00 (3)"
					+   "\nNivel IV - R$100,00 (4)");
		
		entrada = sc.nextLine();
		
		System.out.println("Digite o dia do pagamento: ");
		dia = sc.nextInt();
		
		switch (entrada) {
		case "1":
			if(dia == 1 && dia > 0) {
				valorFinal = NIVEL1 - (NIVEL1 * 0.15);
				System.out.println("Valor do plano sem desconto: " + NIVEL1
											+ "\nPercentual aplicado: 15%" 
											+ "\nValor final mensalidade: " + valorFinal);
			} if(dia <= 5 && dia > 1) {
				valorFinal = NIVEL1 - (NIVEL1 * 0.10);
				System.out.println("Valor do plano sem desconto: " + NIVEL1
											+ "\nPercentual aplicado: 10%" 
											+ "\nValor final mensalidade: " + valorFinal);
			} if(dia <= 10 && dia > 5) {
				valorFinal = NIVEL1 - (NIVEL1 * 0.0389);
				System.out.println("Valor do plano sem desconto: " + NIVEL1
											+ "\nPercentual aplicado: 3,89%" 
											+ "\nValor final mensalidade: " + valorFinal);
			} if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + NIVEL1
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + NIVEL1);
			}
			break;
		case "2":
			if(dia <= 3) {
				valorFinal = NIVEL2 - (NIVEL2 * 0.15);
				System.out.println("Valor do plano sem desconto: " + NIVEL2
											+ "\nPercentual aplicado: 15%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 7 && dia > 3) {
				valorFinal = NIVEL2 - (NIVEL2 * 0.10);
				System.out.println("Valor do plano sem desconto: " + NIVEL2
											+ "\nPercentual aplicado: 10%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 10 && dia > 7) {
				valorFinal = NIVEL2 - (NIVEL2 * 0.0389);
				System.out.println("Valor do plano sem desconto: " + NIVEL2
											+ "\nPercentual aplicado: 3,89%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + NIVEL2
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + NIVEL2);	
			}
			break;
		case "3":
			if(dia <= 3) {
				valorFinal = NIVEL3 - (NIVEL3 * 0.15);
				System.out.println("Valor do plano sem desconto: " + NIVEL3
											+ "\nPercentual aplicado: 15%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 7 && dia > 3) {
				valorFinal = NIVEL3 - (NIVEL3 * 0.10);
				System.out.println("Valor do plano sem desconto: " + NIVEL3
											+ "\nPercentual aplicado: 10%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 10 && dia > 7) {
				valorFinal = NIVEL3 - (NIVEL3 * 0.0389);
				System.out.println("Valor do plano sem desconto: " + NIVEL3
											+ "\nPercentual aplicado: 3,89%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + NIVEL3
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + NIVEL3);	
			}
			break;
		case "4":
			if(dia <= 3) {
				valorFinal = NIVEL4 - (NIVEL4 * 0.15);
				System.out.println("Valor do plano sem desconto: " + NIVEL4
											+ "\nPercentual aplicado: 15%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 7 && dia > 3) {
				valorFinal = NIVEL4 - (NIVEL4 * 0.10);
				System.out.println("Valor do plano sem desconto: " + NIVEL4
											+ "\nPercentual aplicado: 10%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 10 && dia > 7) {
				valorFinal = NIVEL4 - (NIVEL4 * 0.0389);
				System.out.println("Valor do plano sem desconto: " + NIVEL4
											+ "\nPercentual aplicado: 3,89%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + NIVEL4
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + NIVEL4);
			}
			break;
						default:System.out.println("Plano inválido");
			break;
		}
	}	
}
