package Lista_01;

import java.util.Scanner;

public class Algoritimo_47 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		
		System.out.println("Entre com um número CDU(123): ");
		numero = sc.nextInt();
		
		int unidade = numero % 10;
		int dezena = (numero / 10) % 10;
		int centena =  numero / 100;
		int numero1 = unidade * 100 + dezena * 10 + centena;

		int novoNumero = numero1;
		
		System.out.println("Número original: " + numero);
		System.out.println("Número invertido: " + novoNumero);
		
		
		
	}
	
}
