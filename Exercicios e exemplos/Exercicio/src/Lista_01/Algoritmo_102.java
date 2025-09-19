package Lista_01;

import java.util.Scanner;

public class Algoritmo_102 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num < 20) {
			
			System.out.println("Número menor que 20");
			
		} else if(num == 20) {
			
			System.out.println("Número igual que 20");
			
		} else if(num > 20) {
			
			System.out.println("Número maior que 20");
			
		}
		
		
		
		
	}
	
}
