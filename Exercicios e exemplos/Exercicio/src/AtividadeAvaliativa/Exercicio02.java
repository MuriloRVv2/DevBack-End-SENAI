package AtividadeAvaliativa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double BASICO = 80;
		final double INTERMEDIARIO = 120;
		final double AVANCADO = 180;
		final double VIP = 250;
		double  valorFinal;
		String entrada;
		int dia;
		
		System.out.println("===== VIDA ATIVA =====");
		System.out.println("Digite o plano escolhido: "
					+   "\nBásico - R$80,00 (1)"
					+   "\nItermediário - R$120,00 (2)"
					+   "\nAvançado - R$180,00 (3)"
					+   "\nVIP - R$250,00 (4)");
		
		entrada = sc.nextLine();
		
		System.out.println("Digite o dia do pagamento: ");
		dia = sc.nextInt();
		
		switch (entrada) {
		case "1":
			if(dia <= 3) {
				valorFinal = BASICO - (BASICO * 0.12);
				System.out.println("Valor do plano sem desconto: " + BASICO
											+ "\nPercentual aplicado: 12%" 
											+ "\nValor final mensalidade: " + valorFinal);
			} if(dia <= 7 && dia > 3) {
				valorFinal = BASICO - (BASICO * 0.07);
				System.out.println("Valor do plano sem desconto: " + BASICO
											+ "\nPercentual aplicado: 7%" 
											+ "\nValor final mensalidade: " + valorFinal);
			} if(dia <= 10 && dia > 7) {
				valorFinal = BASICO - (BASICO * 0.03);
				System.out.println("Valor do plano sem desconto: " + BASICO
											+ "\nPercentual aplicado: 3%" 
											+ "\nValor final mensalidade: " + valorFinal);
			} if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + BASICO
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + BASICO);
			}
			break;
		case "2":
			if(dia <= 3) {
				valorFinal = INTERMEDIARIO - (INTERMEDIARIO * 0.12);
				System.out.println("Valor do plano sem desconto: " + INTERMEDIARIO
											+ "\nPercentual aplicado: 12%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 7 && dia > 3) {
				valorFinal = INTERMEDIARIO - (INTERMEDIARIO * 0.07);
				System.out.println("Valor do plano sem desconto: " + INTERMEDIARIO
											+ "\nPercentual aplicado: 7%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 10 && dia > 7) {
				valorFinal = INTERMEDIARIO - (INTERMEDIARIO * 0.03);
				System.out.println("Valor do plano sem desconto: " + INTERMEDIARIO
											+ "\nPercentual aplicado: 3%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + INTERMEDIARIO
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + INTERMEDIARIO);	
			}
			break;
		case "3":
			if(dia <= 3) {
				valorFinal = AVANCADO - (AVANCADO * 0.12);
				System.out.println("Valor do plano sem desconto: " + AVANCADO
											+ "\nPercentual aplicado: 12%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 7 && dia > 3) {
				valorFinal = AVANCADO - (AVANCADO * 0.07);
				System.out.println("Valor do plano sem desconto: " + AVANCADO
											+ "\nPercentual aplicado: 7%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 10 && dia > 7) {
				valorFinal = AVANCADO - (AVANCADO * 0.03);
				System.out.println("Valor do plano sem desconto: " + AVANCADO
											+ "\nPercentual aplicado: 3%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + AVANCADO
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + AVANCADO);	
			}
			break;
		case "4":
			if(dia <= 3) {
				valorFinal = VIP - (VIP * 0.12);
				System.out.println("Valor do plano sem desconto: " + VIP
											+ "\nPercentual aplicado: 12%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 7 && dia > 3) {
				valorFinal = VIP - (VIP * 0.07);
				System.out.println("Valor do plano sem desconto: " + VIP
											+ "\nPercentual aplicado: 7%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia <= 10 && dia > 7) {
				valorFinal = VIP - (VIP * 0.03);
				System.out.println("Valor do plano sem desconto: " + VIP
											+ "\nPercentual aplicado: 3%" 
											+ "\nValor final mensalidade: " + valorFinal);
			}
			if(dia > 10) {
				System.out.println("Não possui desconto");
				System.out.println("Valor do plano sem desconto: " + VIP
											+ "\nPercentual aplicado: 0%" 
											+ "\nValor final mensalidade: " + VIP);
			}
			break;
						default:System.out.println("Plano inválido");
			break;
		}
	}	
}
