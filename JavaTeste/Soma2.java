import java.util.Scanner;

public class Soma2 {
    public static void main (String[] args) {
        //entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        //processamento
        int soma = numero1 + numero2;
        //saida
        System.out.println("Soma = " + soma);
    }
    
}
