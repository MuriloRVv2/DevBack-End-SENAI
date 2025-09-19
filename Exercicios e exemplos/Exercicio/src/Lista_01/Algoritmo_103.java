package Lista_01;

import java.util.Scanner;

public class Algoritmo_103 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dataNascimento, ano, verificarIdade, verificarAno ;
		
		System.out.println("Entre com seu ano de nascimento: ");
		dataNascimento = sc.nextInt();
		
		System.out.println("Em qual ano estamos? ");
		ano = sc.nextInt();
		
		verificarIdade = ano - dataNascimento;
		
		System.out.println("Seu ano de nascimento é: " + dataNascimento +
										"\nEstamos no ano de " + ano);
		
		if  (dataNascimento >= ano) {
			
			System.out.println("Ano inválido");
			
		}
		
		
	}
	
	
}
