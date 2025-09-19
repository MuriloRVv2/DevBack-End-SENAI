package BombaAgua;

import java.util.Scanner;

public class UsaBomba {

	public static void main(String[] args) throws InterruptedException {
		
		Bomba2 bomba1 = new Bomba2();
		Scanner sc = new Scanner(System.in);
		
		int cont;
		
		System.out.println("Digite o tempo para desligar a bomba: ");
		cont = sc.nextInt();
		
		bomba1.ligar(cont);
		
	}
	
}
