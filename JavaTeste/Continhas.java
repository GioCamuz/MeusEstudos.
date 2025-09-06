import java.util.Scanner;

public class Continhas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o numero:");
        int numero =scanner.nextInt();
        int dobro = 2 * numero;
        int quadrado = numero * numero;
        int sucessor = numero + 1;
        System.out.println("dobro = " + dobro + "Quadrado = " + quadrado + "Sucessor = " + sucessor);
        scanner.close();
       }
}