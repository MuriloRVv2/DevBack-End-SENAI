package Lista_01;

import java.util.Scanner;

public class Algoritimo_52 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double lado;
		
		System.out.println("Entre com o lado do quadrado: ");
		lado = sc.nextDouble();
		
		double perimetro;
		perimetro = lado * 4;
		double area;
		area = Math.pow(lado, 2);
		double diagonal;
		diagonal = lado * Math.sqrt(2);
		
		System.out.println("O perimetro do quadrado é de: " + perimetro);
		System.out.println("A area do quadrado é de: " + area);
		System.out.println("A diagonal do quadrado é de: " + diagonal);
		
		
		
	}
	
}
