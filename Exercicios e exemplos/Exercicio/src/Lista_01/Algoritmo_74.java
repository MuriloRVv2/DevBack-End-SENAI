package Lista_01;

import java.util.Scanner;

public class Algoritmo_74 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			double salarioMinimoFixo = 1518.00;
			double salarioPessoa;
			
			System.out.println("O salário mínimo atual no Brasil é de: " + salarioMinimoFixo);
			
			System.out.println("Insira seu salário: ");
			salarioPessoa = sc.nextDouble();
			
			int comparacao = (int) (salarioPessoa / salarioMinimoFixo);
			System.out.println("Você possui " + comparacao + " salário(s) minimo(s)");
			
			
			
			
		
	}
	
}
