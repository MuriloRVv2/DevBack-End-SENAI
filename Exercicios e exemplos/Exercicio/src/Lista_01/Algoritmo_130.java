package Lista_01;

import java.util.Scanner;

public class Algoritmo_130 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorProduto, valorVenda;
		
		System.out.println("Entre com o valor do produto: ");
		valorProduto = sc.nextDouble();
		
		if(valorProduto < 20.00) {
			valorVenda = (valorProduto * 0.45) + valorProduto;
			System.out.println("Valor venda com lucro de 45%: " + valorVenda );
		}
		else if(valorProduto >= 20.00) {
			valorVenda = (valorProduto * 0.30) + valorProduto;
			System.out.println("Valor da venda com lucro de 30%");
		}
		
		
		
	}
	
}
