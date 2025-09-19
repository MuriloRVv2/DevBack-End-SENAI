package ExercicioMeusDados;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MeusDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entrada;
		
		System.out.println("========== Roubo de dados :) =============");
		
		JOptionPane.showInputDialog("Digite seu nome: ");
		entrada = sc.nextLine();
		JOptionPane.showMessageDialog(null, "Nome: " + entrada);
		
		System.out.println("Digite seu endereço:: ");
		entrada = sc.nextLine();
		JOptionPane.showMessageDialog(null, "Endereço: " + entrada);
		
		String ler = JOptionPane.showInputDialog("Digite seu telefone: ");
		int entrada2 = sc.nextInt();
		entrada2 = Integer.parseInt(ler);
		JOptionPane.showMessageDialog(null, "Telefone: " + entrada2 );
		
		
		
		
	}
	
}
