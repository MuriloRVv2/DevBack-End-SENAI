package Lista_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Algoritimo_34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int sucessor;
		int antecessor;
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		int numero1;
		int sucessor1;
		int antecessor1;
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Digite um valor para ver seu antecessor e seu sucessor: ");
		numero = sc.nextInt();
		sucessor = numero + 1;
		antecessor = numero - 1;
		System.out.println("O sucessor do número é: " + sucessor);
		System.out.println("O antecessor do número é: " + antecessor);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para ver seu antecessor e seu sucessor: "));
		sucessor1 = numero1 + 1;
		antecessor1 = numero1 - 1;
		JOptionPane.showMessageDialog(null, "O sucessor do número é: " + sucessor1 + 
																		"\nO antecessor do número é: " + antecessor1);
		
	}
	
}
