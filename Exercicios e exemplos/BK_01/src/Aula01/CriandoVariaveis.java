package Aula01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CriandoVariaveis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String aux = JOptionPane.showInputDialog(null, "Digite um número: ");
		JOptionPane.showMessageDialog(null,"Valor String: " +  aux);
		int numero = sc.nextInt();
		numero = Integer.parseInt(aux);
		JOptionPane.showMessageDialog(null, "Valor convertido " + numero);
		
	}
	
}
