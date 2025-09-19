package Lista_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Algoritimo_33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int numero1 = sc.nextInt();
		System.out.println("Insira outro número: ");
		int numero2 = sc.nextInt();
		System.out.println("Os dois valores são: " + numero1 + " e " + numero2);
		
		///////////////////////////////////////////////////////////////////
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número: "));	
		JOptionPane.showMessageDialog(null, "Os dois valores são: " + numero1 + " e " + numero2);
		
		
		
	}
	
}
