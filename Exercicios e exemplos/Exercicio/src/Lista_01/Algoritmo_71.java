package Lista_01;

import java.util.Scanner;

public class Algoritmo_71 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		int minuto;
		
		System.out.println("Entre apenas com a hora: ");
		hora = sc.nextInt();
		
		System.out.println("Entre com os minutos: ");
		minuto = sc.nextInt();
		
		int tempo = (hora * 60) + minuto;
		
		System.out.println("Se passaram " + tempo + " minutos desde o ínicio do dia.");
		
		
		
	}
	
}
