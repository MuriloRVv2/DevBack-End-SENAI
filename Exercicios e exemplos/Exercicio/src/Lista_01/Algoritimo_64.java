package Lista_01;

import java.util.Scanner;

public class Algoritimo_64 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double celsius;
		
		System.out.println("Entre com a temperatura em °Celsius: ");
		celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("A temperatura de °Celsius para °Fahrenheit é: " + fahrenheit);
		
	}
	
}
