package BombaAgua;

public class Bomba2 {

	boolean status;
	int cont;
	
	public void ligar(int cont) throws InterruptedException {
		
		this.cont = cont;
		status = true;
		
		while (cont > 0) {
			System.out.println("Tempo restante:  " + cont);
			Thread.sleep(5);
			cont --;
		}
		
		desligar();
		
	}
	
	public void desligar() {
		
		status = false;
		System.out.println("Bomba desligada");
		
	}
	
}
