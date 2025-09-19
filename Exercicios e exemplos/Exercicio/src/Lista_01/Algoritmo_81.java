package Lista_01;

import java.util.Scanner;

public class Algoritmo_81 {

	public static void main(String[] args) {
		
				
				Scanner sc = new Scanner(System.in);
				
				int numero;
				
				
				System.out.println("Entre com um número: ");
				numero = sc.nextInt();
				
				int unidade = numero % 10;
				int dezena = (numero / 10) % 10;
				int centena =  numero / 100;
				int numero1 = unidade * 100 + dezena * 10 + centena;
				
				int novoNumero = numero1;
				
				int soma = numero + novoNumero;
				
				int digito1 = soma % 10;
				int digito2 = (soma / 10) % 10;
				int digito3 = (soma / 100) % 10;
				
				int resultado = digito1 * 1 + digito2 * 2 + digito3 * 3;
				
				int verificar = resultado % 10;
				
				System.out.println("Número: " + numero +
								   "\nInvertido: " + novoNumero +
								   "\nSoma: " + soma +
								   "\nResultado multiplicação: " + resultado +
								   "\nVerficar: " + verificar);

				
				
				

		
	}
	
}
