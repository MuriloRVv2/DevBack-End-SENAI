package Calculadora;

import java.util.Scanner;

public class Solicitacao {

	CalculoCientifico calc = new CalculoCientifico();
	Scanner sc = new Scanner(System.in);
	String op;
	
	public void solicitarOp() {
				
		System.out.println("Digite um valor: ");
		calc.setValor_01(sc.nextDouble());
		
		System.out.println("Digite outro valor: ");
		calc.setValor_02(sc.nextDouble());

		System.out.println("=============CALCULADORA==============");
		System.out.println("\n\nDigite a operação: " +
										"\nSomar (+)" +
										"\nSubtrair (-)" +
										"\nMultiplicar (*)" +
										"\nDivisão (/)" +
										"\nRaiz Quadrada (r)");
		op = sc.next();
		
		switch (op) {
		case "+":calc.somar(calc.getValor_01(), calc.getValor_02());
		break;
		case "-":calc.subtracao(calc.getValor_01(), calc.getValor_02());
		break;
		case "*":calc.multiplicacao(calc.getValor_01(), calc.getValor_02());
		break;
		case "/":calc.divisao(calc.getValor_01(), calc.getValor_02());
		break;
		case "r":calc.raizQuadrada();
		break;
		
		default: System.out.println("Operação inválida");
			break;
		}

		
	}
	
}
