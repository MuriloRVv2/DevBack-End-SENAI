package Lista_01;

import java.util.Scanner;

public class Algoritmo_78 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ladosN;
		
		System.out.println("Entre com os lados do polígono: ");
		ladosN = sc.nextInt();
		
		int diagonaisND = ladosN * (ladosN - 3) / 2;
		
		System.out.println("A quantidade de diagonais de " + ladosN + " é de: " + diagonaisND);
		
		
		
	}
	
}
