package Lista_01;

import java.util.Scanner;

public class Algoritimo_57 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pr1;
		double pr2;
		
		System.out.println("Entre com primeira nota: ");
		pr1 = sc.nextDouble();
		
		System.out.println("Entre com segunda nota: ");
		pr2 = sc.nextDouble();
		
		int media = (int) ((pr1 + pr2) / 2);
		
		System.out.println("A média das notas é: " + media);
		System.out.println("Arredondando: " + Math.round(media));
		
		
	}
	
}
