package Lista_01;

import java.util.Scanner;

public class Algoritmo_125 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(idade < 18) {
			System.out.println("Menor de idade");
		} else if (idade >= 18 && idade < 65) {
			System.out.println("Maior de idade");
		} else if(idade >= 65) {
			System.out.println("Maior que 65 anos");
		}
		
		
	}
	
}
