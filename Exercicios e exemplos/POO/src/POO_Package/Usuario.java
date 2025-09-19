package POO_Package;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa mulher = new Pessoa();
		Pessoa homem= new Pessoa();
		
		System.out.println("Digite o nome da mulher: ");
		mulher.nome = sc.nextLine();
		System.out.println("Digite o endereço da mulher: ");
		mulher.endereco= sc.nextLine();
		
		System.out.println("Digite o nome do homem: ");
		homem.nome = sc.nextLine();
		System.out.println("Digite o endereço do homem: ");
		homem.endereco= sc.nextLine();
		
		System.out.println("Nome: " + mulher.nome + "\nEndereço: " + mulher.endereco);
		System.out.println("\nNome: " + homem.nome + "\nEndereço: " + homem.endereco);
		
		
	}
	
}
