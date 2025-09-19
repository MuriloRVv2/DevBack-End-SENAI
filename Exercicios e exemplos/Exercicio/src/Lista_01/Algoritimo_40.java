package Lista_01;

import java.util.Scanner;

public class Algoritimo_40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero01;
		int numero02;
		
		System.out.println("Entre com o primeiro número(dividendo): ");
		numero01 = sc.nextInt();
		int dividendo = numero01;
		
		System.out.println("Entre com o segundo número(divisor): ");
		numero02 = sc.nextInt();
		int divisor = numero02;

		double quociente = dividendo / divisor;
		double resto = dividendo % divisor;
		
		System.out.println("Dividendo: " + dividendo + 
													"\nDivisor: " + divisor + 
													"\nQuociente: " + quociente + 
													"\nResto: " + resto);
		
		
		
		
		
	}
	
}
