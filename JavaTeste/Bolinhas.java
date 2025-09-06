import java.util.Scanner;

public class Bolinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite o raio: ");
        double raio = scanner.nextDouble();
        scanner.close();
        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = 4/3 * Math.PI * Math.pow(raio, 3);
        System.out.printf("%n.2fComprimento = %.3f, area = %.3f, volume = %.3f", comprimento, area, volume);
        
    }
    
}
