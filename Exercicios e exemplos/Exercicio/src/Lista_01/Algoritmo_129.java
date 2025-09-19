package Lista_01;

import java.util.Scanner;

public class Algoritmo_129 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, desconto;
		
		System.out.println("Digite o salário: ");
		salario = sc.nextDouble();
		
		if(salario <= 600.00) {
			System.out.println("ISENTO");
		}
		else if(salario > 600.00 && salario <= 1200.00) {
			desconto = (0.20 * salario) - salario;
			System.out.println("Desconto de 20% " + desconto);
		}
		else if(salario > 1200.00 && salario <= 2000.00) {
			desconto = (0.25 * salario) - salario;
			System.out.println("Desconto de 25% " + desconto);
		}
		else if(salario > 2000.00) {
			desconto = (0.30 * salario) - salario;
			System.out.println("Desconto de 30% " + desconto);
		}
	}
	
}
