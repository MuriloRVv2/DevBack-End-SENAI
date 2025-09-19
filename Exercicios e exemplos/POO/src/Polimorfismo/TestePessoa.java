package Polimorfismo;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa("Docinho", "doc@inho.com", "TV");
		
		System.out.println("Altere a configuração como desejado; " +
											"\nNome: " + pessoa.getNome() +
											"\nEndereço: " + pessoa.getEndereco() +
											"\nEmail: " + pessoa.getEmail());
		
		System.out.println("\n\n\n"
											+ "Digite seu nome: ");
		pessoa.setNome(sc.nextLine());
		System.out.println("Digite seu email: ");
		pessoa.setEmail(sc.nextLine());
		System.out.println("Digite seu endereço: ");
		pessoa.setEndereco(sc.nextLine());
		
		System.out.println("Configurações alteradas:  " +
												"\nNome: " + pessoa.getNome() +
												"\nEndereço: " + pessoa.getEndereco() +
												"\nEmail: " + pessoa.getEmail());
		
		
	}
	
}
