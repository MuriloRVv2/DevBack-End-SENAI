package Lista_01;

import java.util.Scanner;

public class Algoritmo_105 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String estado;
		String rj = "RIO DE JANEIRO", sp = "SÃO PAULO", mg = "MINAS GERAIS";
		
		System.out.println("Digite o estado que você mora: ");
		estado = sc.nextLine() .toUpperCase();
		
		if(estado.equals(rj)) {
			
			System.out.println("Você é carioca");
			
		}
		else if(estado.equals(sp)) {
			
			System.out.println("Você é paulista");
			
		}
		else if(estado.equals(mg)) {
			
			System.out.println("Você é mineiro");
			
		}
		else {
			
			System.out.println("Você é de outro estado");
			
		}
		
	}
	
}
