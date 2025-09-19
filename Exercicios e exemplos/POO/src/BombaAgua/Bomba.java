package BombaAgua;

public class Bomba {

	boolean status;

	public void ligar() throws InterruptedException {
		int cont = 5;
		status =  true;
		while (cont > 0) {
			System.out.println("Tempo restante: " + cont);
			cont --;
			Thread.sleep(1000);
		}
		
	}
	
	public void desligar() {
		status = false;
		System.out.println("Bomba desligada");
	}
	
	
	
	
	
}
