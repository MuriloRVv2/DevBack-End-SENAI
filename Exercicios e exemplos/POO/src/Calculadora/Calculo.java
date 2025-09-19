package Calculadora;

public class Calculo {

	//O que tenho(Atributos)
	private double valor_01;
	private double valor_02;
	private double valor_total;
	
	
	//Metodos acessores
	public void setValor_01(double valor01) {
		this.valor_01 = valor01;
	}
	public double getValor_01() {
		return valor_01;
	}
	
	public void setValor_02(double valor02) {
		this.valor_02 = valor02;
	}
	public double getValor_02() {
		return valor_02;
	}

	public double getValor_total() {
		return valor_total;
	}
	
	//O que faço
	
	public void somar(double valor01, double valor02) {
		
		this.valor_total = this.valor_01 + this.valor_02;
		System.out.println(this.valor_total);
		
	}
	public void subtracao(double valor01, double valor02) {
		
		this.valor_total = this.valor_01 - this.valor_02;
		System.out.println(this.valor_total);
		
	}
	public void multiplicacao(double valor01, double valor02) {
		
		this.valor_total = this.valor_01 * this.valor_02;
		System.out.println(this.valor_total);
		
	}
	public void divisao(double valor01, double valor02) {
		
		this.valor_total = this.valor_01 /  this.valor_02;
		System.out.println(this.valor_total);
		
	}
	
	
	
	
	
}
