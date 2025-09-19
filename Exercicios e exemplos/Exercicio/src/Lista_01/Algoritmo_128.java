package Lista_01;

import java.util.Scanner;

public class Algoritmo_128 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String verbo;
		
		System.out.println("Digite um verbo: ");
		verbo = sc.nextLine();
		
		verbo = verbo.substring(verbo.length() -2);
		
		if(verbo.equals("ar")) {
			System.out.println("1ª conjugação");
		} else if(verbo.equals("er")) {
			System.out.println("2ª conjugação");
		} else if (verbo.equals("ir")) {
			System.out.println("3ª conjugação");
		} else {
			System.out.println("Verbo não está no infinitivo");
		}
		
	}
	
}
