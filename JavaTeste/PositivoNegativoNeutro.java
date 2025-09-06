//Ler um numero e dizer se ele é positivo, negativo ou neutro 

import java.util.Scanner;

public class PositivoNegativoNeutro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite um numero ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println(numero + " e positivo");
        }
        else {
            if (numero < 0) {
                System.out.println(numero + " e negativo");
            }
            else {
                System.out.println(numero + " e neutro");
            }
        }
        scanner.close();
    }
}