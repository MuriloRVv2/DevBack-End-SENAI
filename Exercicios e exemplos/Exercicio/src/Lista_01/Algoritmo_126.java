package Lista_01;

import java.util.Scanner;

public class Algoritmo_126 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	System.out.println("Digite um número: ");
	num = sc.nextInt();
	
	if(num == 5) {
		System.out.println("igual a 5");
	}
	else if(num == 200) {
		System.out.println("Igual a 200");
	}
	else if(num == 400) {
		System.out.println("Igual a 400");
	} else if(num > 500 && num < 1000) {
		System.out.println("Está no intervalo de 500 e 1000");
	} else {
			System.out.println("Está fora dos escopos anteriores.");
	}
	
	
	
	
	}
}
