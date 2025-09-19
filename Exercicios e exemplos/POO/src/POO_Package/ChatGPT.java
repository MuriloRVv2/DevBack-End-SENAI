package POO_Package;

import java.util.Scanner;

public class ChatGPT {

	Scanner sc = new Scanner(System.in);
	
	double num1;
	double num2;
	double total;
	String nome;
	
	public void somar() {
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Olá " + nome + " Digite o número: ");
		num1= sc.nextDouble();
		
		System.out.println("Olá " + nome + " Digite o número: ");
		num2= sc.nextDouble();
	
		total = num1 + num2;
		System.out.println("Total: " + total);
		
	}
	
public void subtrair() {
		
		System.out.println("====== Subtração =====");
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Olá " + nome + " Digite o número: ");
		num1= sc.nextDouble();
		
		System.out.println("Olá " + nome + " Digite o número: ");
		num2= sc.nextDouble();
	
		total = num1 - num2;
		System.out.println("Total: " + total);
		
	}

public void multiplicacao() {
	
	System.out.println("====== Multiplicação =====");
	
	System.out.println("Digite seu nome: ");
	nome = sc.nextLine();
	
	System.out.println("Olá " + nome + " Digite o número: ");
	num1= sc.nextDouble();
	
	System.out.println("Olá " + nome + " Digite o número: ");
	num2= sc.nextDouble();

	total = num1 * num2;
	System.out.println("Total: " + total);
	
}

public void divisao() {
	
	System.out.println("====== Divisão =====");
	
	System.out.println("Digite seu nome: ");
	nome = sc.nextLine();
	
	System.out.println("Olá " + nome + " Digite o número: ");
	num1= sc.nextDouble();
	
	System.out.println("Olá " + nome + " Digite o número: ");
	num2= sc.nextDouble();

	total = num1 / num2;
	System.out.println("Total: " + total);
	
}


	
}
