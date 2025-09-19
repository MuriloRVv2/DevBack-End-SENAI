package ExercicioMeusDados;

import java.util.Scanner;

public class UsandoFor_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, total;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		
		for (int i = 0; i <= 10 ;i++) {
			
			total = num * i;
			System.out.println(num + " X " + i + " = " + total );
			
		}
		
	}
	
}
