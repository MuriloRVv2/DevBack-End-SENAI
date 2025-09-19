package Lista_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Algoritimo_32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int num = sc.nextInt();
		System.out.println(num);
		sc.close();
		
		///////////////////////////////////////////////////////////////////////
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		JOptionPane.showMessageDialog(null, num);
		
		///////////////////////////////////////////////////////////////////////
		
	}
	
}
