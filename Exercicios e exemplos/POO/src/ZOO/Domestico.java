package ZOO;

import java.util.Scanner;

public class Domestico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AnimalDom cachorro = new AnimalDom();
		
		System.out.println("Digite o nome do animal: ");
		cachorro.setNome(sc.nextLine());
		System.out.println("Digite a espécie do animal: ");
		cachorro.setEspecie(sc.nextLine());
		System.out.println("Digite a raça do animal: ");
		cachorro.setRaca(sc.nextLine());
		
		System.out.println("Nome: " + cachorro.getNome() + 
									" \nEspécie: " +  cachorro.getEspecie() +
									"\nRaça: " + cachorro.getRaca());
		
	}
	
}
