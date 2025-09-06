//Questão 35
import java.util.Scanner;

public class JavaAtividade {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Entrada dos catetos
        System.out.print("Digite o valor do cateto A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor do cateto B: ");
        double B = scanner.nextDouble();

        // Cálculo da hipotenusa
         double hipotenusa = Math.sqrt(A * A + B * B);

        // Saída do resultado
        System.out.printf("A hipotenusa do triângulo com catetos %.2f e %.2f é: %.2f%n", A, B, hipotenusa);

        scanner.close();


    }
}







