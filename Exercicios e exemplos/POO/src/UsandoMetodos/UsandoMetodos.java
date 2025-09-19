package UsandoMetodos;

import java.util.Scanner;

public class UsandoMetodos {

	String endereco;
	String nome;
	double total;
	
	public void solicitar() {
		
		System.out.println("Vazio sem parametro");
		//Variavel de escopo local
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		nome = sc.nextLine();
		System.out.println(nome);
		System.out.println("================================");
	}
	
}
