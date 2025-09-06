//ler um número qualquer e dizer se ele é positivo

import java.util.Scanner;

public class SoPositivo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print ("Digite um numero: ");
    double numero = scanner.nextDouble();
    if (numero > 0) {
        System.out.println(numero + "positivo");
    }
    scanner.close();
    }
}
