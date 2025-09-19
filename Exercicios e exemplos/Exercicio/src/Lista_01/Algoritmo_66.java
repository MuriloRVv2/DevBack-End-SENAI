package Lista_01;

import java.util.Scanner;

public class Algoritmo_66 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double litros;
		double tempo;
		double velocidade;
		
		System.out.println("Entre com o tempo da viagem: ");
		tempo = sc.nextDouble();
		
		System.out.println("Entre com a velocidade média do veículo: ");
		velocidade = sc.nextDouble();
		
		double distancia = tempo * velocidade;
		litros = distancia / 12;
		
		System.out.println("Velocidade média: " + velocidade + 
										"\nTempo gasto: " + tempo + 
										"\nDistância percorrida: " + distancia +
										"\nLitros usados: " + litros);
		
		
		
	}
	
}
