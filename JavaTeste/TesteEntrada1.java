import java.util.Scanner;

public class TesteEntrada1 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println( "Digite um inteiro:");
        int a = input.nextInt();
        System.out.println( "Voce digitou: " + a);
        System.out.println( "Digite um real: ");
        double x = input.nextDouble();
        System.out.println( "Voce digitou: " + x);
        input.close();
    }
}
