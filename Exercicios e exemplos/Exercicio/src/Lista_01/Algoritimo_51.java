package Lista_01;

import java.util.Scanner;

public class Algoritimo_51 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		
		System.out.println("Entre com o raio do circulo: ");
		raio = sc.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("O perímetro do circulo é de: " + perimetro);
		System.out.println("A área do circulo é de: " + area);
		
		
		
	}
	
}
