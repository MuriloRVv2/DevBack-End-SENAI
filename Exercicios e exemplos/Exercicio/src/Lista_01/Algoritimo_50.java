package Lista_01;

import java.util.Scanner;

public class Algoritimo_50 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base;
		double altura;
		
		
		System.out.println("Entre com a base do triângulo(m): ");
		base = sc.nextDouble();
		
		System.out.println("Agora entre com a altura(m): ");
		altura = sc.nextDouble();
		
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		double perimetro = base + altura + diagonal;
		System.out.println("O perímetro do triângulo é: " + perimetro + "(m)");
		
		double area = (base * altura) / 2;
		System.out.println("A área do triângulo é de: " + area + ("m"));
		
		System.out.println("A diagonal(hipotenusa) do triângulo é: " + diagonal);
		
	}
	
}
