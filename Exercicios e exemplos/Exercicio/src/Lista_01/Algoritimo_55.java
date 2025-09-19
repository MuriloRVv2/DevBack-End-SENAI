package Lista_01;

import java.util.Scanner;

public class Algoritimo_55 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double diagonalMaior;
		double diagonalMenor;

		System.out.println("Entre com a diagonal maior: ");
		diagonalMaior = sc.nextDouble();
		
		System.out.println("Entre com a diagonal menor: ");
		diagonalMenor = sc.nextDouble();
		
		double area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.printf("A área do losango é de: %.2f",  area);
		
		
		
	}
	
}
