package Lista_01;

import java.util.Scanner;

public class Algoritmo_67 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorP;
		double taxa;//Porcentagem
		double tempo;//dias
		
		System.out.println("Entre com o valor: ");
		valorP = sc.nextDouble();
		
		System.out.println("Entre com o valor da taxa: ");
		taxa = sc.nextDouble();
		
		System.out.println("Entre com o tempo: ");
		tempo = sc.nextDouble();
		
		double prestacao = valorP + (valorP * (taxa / 100) * tempo);
		
		System.out.println("O valor da prestação em atraso é de: " + prestacao);
		
		
		
	}
	
}
