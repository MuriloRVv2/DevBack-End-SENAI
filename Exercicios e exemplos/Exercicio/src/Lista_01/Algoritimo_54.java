package Lista_01;

import java.util.Scanner;

public class Algoritimo_54 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ladoA;
		double ladoB;
		double ladoC;
		
		System.out.println("Entre com um lado do triângulo: ");
		ladoA = sc.nextDouble();
		
		System.out.println("Entre com o segundo lado do triângulo: ");
		ladoB = sc.nextDouble();
		
		System.out.println("Entre com o terceiro lado do triângulo: ");
		ladoC = sc.nextDouble();
		
		double semiperimetro = (ladoA + ladoB + ladoC) / 2;
		double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
		
		System.out.println("A área do triângulo é de: " + area);
		
	}
	
}
