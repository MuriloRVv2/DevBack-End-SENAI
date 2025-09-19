package GPS;

public class GPS {

	
	private String idioma;
	private String rota;
	
	public GPS () {
		
		this.idioma = "português";
		this.rota= "Av. Brasil";
		
	}
	
	public GPS(String rota, String idioma) {	
			this.idioma = idioma;
			this.rota = rota;
	}
	
	public void definirIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public void definirRota(String rota) {
		this.rota = rota;
	}
	
	public void mostrar() {
		System.out.println("Idioma: " + idioma);
		System.out.println("Rota: " + rota);
	}
	
	
	
	
}
