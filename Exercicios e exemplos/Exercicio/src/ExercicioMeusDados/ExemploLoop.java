package ExercicioMeusDados;

import java.util.Scanner;

public class ExemploLoop {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		int num, total, cont = 0;
		
		/*
		while (cont <= 20) {
			
			System.out.println("Volta número " + cont);
			Thread.sleep(1000);
			cont++;
			
		}
		*/
		
		/*
		System.out.println("Digite um número para tabuada: ");
		num = sc.nextInt();
		
		while(cont <= 10) {
			
			total = num * cont;
			System.out.println(num + "  X  " + cont + " : " + total);
			Thread.sleep(1000);
			cont++;
			
		}
	*/
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		while(true) {
			
			if(num >= 0) {
				
				System.out.println("Digite um número: ");
				num = sc.nextInt();
				total = num * 3;
				System.out.println(total);
			
			} else {
				System.out.println("Fim");
				break;
			}
			
		}
		
		
	}
	
}
