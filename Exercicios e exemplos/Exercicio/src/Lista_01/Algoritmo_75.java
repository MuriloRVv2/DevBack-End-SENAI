package Lista_01;

import java.util.Scanner;

public class Algoritmo_75 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peso;
		double novoPeso;
		
		System.out.println("Entre com o seu peso(kg): ");
		peso = sc.nextDouble();
		
		double grama = peso * 1000;
		
		
		System.out.println("Seu peso em gramas é de: " + grama);
		
		
		System.out.println("Você engordou? ");
		boolean quest = sc.nextBoolean();

		
		if(quest != false) {
			
			System.out.println("Quanto você engordou? ");
			novoPeso = sc.nextDouble();
			
			double gramaNovo = (novoPeso + peso) * 1000;
			double novoPesoG = gramaNovo;
			double porcentagem = novoPeso * peso / 100;
			
			if(porcentagem >= 12) {
				
				System.out.println("Seu novo peso em gramas é de: " + novoPesoG );
				
			}
			
		} else {
			
			System.out.println("Obrigado por usar o programa");
			
		}
		
		
		
		
		
	}
	
}
