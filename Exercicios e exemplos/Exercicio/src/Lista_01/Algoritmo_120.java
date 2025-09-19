package Lista_01;

import java.util.Scanner;

public class Algoritmo_120 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;
        double maior, intermediario, menor;
        
        System.out.println("Digite o 1° n°: ");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o 2° n°: ");
        num2 = sc.nextDouble();
        
        System.out.println("Digite o 3° n°: ");
        num3 = sc.nextDouble();
        
        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                intermediario = num2;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                intermediario = num1;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                intermediario = num1;
                menor = num2;
            } else {
                intermediario = num2;
                menor = num1;
            }
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Intermediário: " + intermediario);
        System.out.println("Menor: " + menor);
    }
}
