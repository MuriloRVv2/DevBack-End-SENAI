package Lista_01;

import java.util.Scanner;

public class Algoritimo_59 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double catetoB;
		double catetoC;
		
		System.out.println("Entre com o primeiro lado do triângulo: ");
		catetoB = sc.nextDouble();
		
		System.out.println("Entre com o segundo lado do triângulo: ");
		catetoC = sc.nextDouble();
		
		double hipotenusa = Math.sqrt(Math.pow(catetoB, 2) + Math.pow(catetoC, 2));
		
		System.out.println("Hipotenusa: " + hipotenusa);
		
		
	}
	
}
