package Lista_01;

import java.util.Scanner;

public class Algoritmo_104 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nome;
		char sexo;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite seu sexo: ");
		sexo = sc.nextLine() .charAt(0);
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(sexo == 'F'  && idade < 25|| sexo == 'f' && idade < 25 ) {
			
			System.out.println(nome + " ACEITA!");
			
		} else {
			
			System.out.println(nome + " NÃO ACEITA");
			
		}
		
		
		
	}
	
}
