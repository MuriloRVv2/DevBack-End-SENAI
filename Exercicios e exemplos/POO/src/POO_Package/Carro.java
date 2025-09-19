package POO_Package;

import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Veiculo fiat = new Veiculo();
		Veiculo chevrolet = new Veiculo();
		Veiculo honda = new Veiculo();
		Veiculo hyundai = new Veiculo();
		Veiculo toyota = new Veiculo();
		
		int escolha;
		System.out.println("Escolha a marca do seu carro: "
										+ "\nCHEVROLET (1)"
										+ "\nFIAT (2)"
										+ "\nHONDA (3)"
										+ "\nHYUNDAI (4)"
										+ "\nTOYOTA (5)");
		escolha = sc.nextInt();
		
		switch (escolha) {
		case 1:System.out.println("Qual o modelo do seu carro Chevrolet?");
					sc.nextLine();
					chevrolet.setModelo(sc.nextLine());
					System.out.println("Qual a cor do seu carro?");
					chevrolet.setCor(sc.nextLine());
					System.out.println("Qual o ano de seu carro?");
					chevrolet.setAno(sc.nextInt());
					
					System.out.println("Modelo: " + chevrolet.getModelo()
													+ "\nCor: " + chevrolet.getCor()
													+ "\nAno: " + chevrolet.getAno());
					
		break;
		case 2:System.out.println("Qual o modelo do seu carro Fiat?");
					sc.nextLine();
					fiat.setModelo(sc.nextLine());
					System.out.println("Qual a cor do seu carro?");
					fiat.setCor(sc.nextLine());
					System.out.println("Qual o ano de seu carro?");
					fiat.setAno(sc.nextInt());

					System.out.println("Modelo: " + fiat.getModelo()
													+ "\nCor: " + fiat.getCor()
													+ "\nAno: " + fiat.getAno());
					
		break;
		case 3:System.out.println("Qual o modelo do seu carro Honda?");
					sc.nextLine();
					honda.setModelo(sc.nextLine());
					System.out.println("Qual a cor do seu carro?");
					honda.setCor(sc.nextLine());
					System.out.println("Qual o ano de seu carro?");
					honda.setAno(sc.nextInt());

					System.out.println("Modelo: " + honda.getModelo()
													+ "\nCor: " + honda.getCor()
													+ "\nAno: " + honda.getAno());
					
		break;
		case 4:System.out.println("Qual o modelo do seu carro Hyundai?");
					sc.nextLine();
					hyundai.setModelo(sc.nextLine());
					System.out.println("Qual a cor do seu carro?");
					hyundai.setCor(sc.nextLine());
					System.out.println("Qual o ano de seu carro?");
					hyundai.setAno(sc.nextInt());

					System.out.println("Modelo: " + hyundai.getModelo()
													+ "\nCor: " + hyundai.getCor()
													+ "\nAno: " + hyundai.getAno());
					
		break;
		case 5:System.out.println("Qual o modelo do seu carro Toyota?");
					sc.nextLine();
					toyota.setModelo(sc.nextLine());
					System.out.println("Qual a cor do seu carro?");
					toyota.setCor(sc.nextLine());
					System.out.println("Qual o ano de seu carro?");
					toyota.setAno(sc.nextInt());

					System.out.println("Modelo: " + toyota.getModelo()
													+ "\nCor: " + toyota.getCor()
													+ "\nAno: " + toyota.getAno());
					
		break;
		default:
			System.out.println("Marca não condiz");
			break;
		}
		
	}
	
}
