package Lista_01;

import java.util.Scanner;

public class Algoritimo_41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero01;
		double numero02;
		double numero03;
		double numero04;
		double peso01 = 1;
		double peso02 = 2;
		double peso03 = 3;
		double peso04 = 4;
		
		System.out.println("Entre com o primeiro número: ");
		numero01 = sc.nextDouble();
		System.out.println("Entre com o segundo número: ");
		numero02 = sc.nextDouble();
		System.out.println("Entre com o terceiro número: ");
		numero03 = sc.nextDouble();
		System.out.println("Entre com o quarto e último número: ");
		numero04 = sc.nextDouble();
		
		double mediaP;
		mediaP = (numero01 * peso01 + numero02 * peso02 + numero03 * peso03 + numero04 * peso04)/(peso01 + peso02 + peso03 + peso04);
		
		
		System.out.println("A média ponderada dos números: " + numero01 + ", " + numero02 + ", " + numero03 + ", " + numero04  + " é de:" + mediaP);
		
		
	}
	
}
