package For;

public class UsandoFor {

	public static void main(String[] args) throws InterruptedException {
		
		int cont = 0;
		
		int [][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
	/*
		int []vetor = {1,2,3,4,5,6};
		
		for ( cont = 0; cont <= vetor.length; cont++) {
			System.out.println(cont);
		}
		*/
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				System.out.print(matriz[i][j]);
				Thread.sleep(1000);
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
}
