package Lista_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Algoritimo_35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Seu nome é " + nome);
		
		System.out.println("Digite seu endereço: ");
		endereco = sc.nextLine();
		System.out.println("Seu endereço é " + endereco);
		
		System.out.println("Digite seu telefone: ");
		telefone = sc.nextLine();
		System.out.println("Seu telefone é " + telefone);
		
		///////////////////////////////////////////////////////////////////
		
		String nomeJPane = "";
		String enderecoJPane = "";
		String telefoneJPane = "";
		
		nomeJPane = JOptionPane.showInputDialog("Digite o seu nome: " + nomeJPane);
		JOptionPane.showMessageDialog(null, "Seu nome é " + nomeJPane);
		enderecoJPane = JOptionPane.showInputDialog("Digite seu endereço: " + enderecoJPane);
		JOptionPane.showMessageDialog(null, "Seu endereço é " + enderecoJPane);
		telefoneJPane = JOptionPane.showInputDialog("Digite seu telefone: " + telefoneJPane);
		JOptionPane.showMessageDialog(null, "Seu telefone é " + telefoneJPane);
		
		
	}
	
}
