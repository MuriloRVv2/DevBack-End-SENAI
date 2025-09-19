package Lista_01;

import java.util.Scanner;

public class Algoritmo_80 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fitas;
		double aluguel;
		
		System.out.println("Quantas fitas você possui em sua locadora? ");
		fitas = sc.nextInt();
		
		System.out.println("Qual o valor por cada aluguel? ");
		aluguel = sc.nextDouble();
		
		double faturamento = ((fitas / 3) * aluguel) * 12;
		
		double atraso = ((fitas / 10) * (aluguel * 0.10));
		
		int fitasEstragadas = (int) (fitas * 0.02);
		int fitasResposicao = fitas / 10;
		int fitasFinais = fitas - fitasEstragadas + fitasResposicao;
		
		System.out.printf("O faturamento anual é de: %.2f", faturamento);
		System.out.printf("\nValor ganho com multas no mês: %.2f", atraso);
		System.out.println("\nA quantidade de fitas no final do ano é de: " + fitasFinais);
		
		
	}
	
}
