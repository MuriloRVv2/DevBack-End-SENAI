package POO_Package;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChatGPT gpt = new ChatGPT();
		
		int escolha;
		System.out.println("Escolha uma operação: "
										+ "\n(1) Soma"
										+ "\n(2) Subtração"
										+ "\n(3) Multiplicação"
										+ "\n(4) Divisão");	
		escolha = sc.nextInt();
		
		switch (escolha) {
		case 1:gpt.somar();
		break;
		case 2:gpt.subtrair();
		break;
		case 3:gpt.multiplicacao();
		break;
		case 4:gpt.divisao();
		break;
		default:
			System.out.println("Obrigado por usar o programa");
			break;
		}
		
	}
	
}
