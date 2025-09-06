// Ler o prêmio da loteria, ler o percentual de aposta de 3 amigos, calcular o valor que cada um leva e exibir

import javax.swing.JOptionPane;

public class Loteria {
    public static void main (String[] args) {
    String aux;
    double premio = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o premio da semana:")
    );
    double ApostaAmigo1 = Double.parseDouble(
        JOptionPane.showInputDialog("Quanto o amigo 1 apostou?")
    );
    double ApostaAmigo2 = Double.parseDouble(
        JOptionPane.showInputDialog("Quanto o amigo 2 apostou?")
    );
    double ApostaAmigo3 = Double.parseDouble(
        JOptionPane.showInputDialog("Quanto o amigo 3 apostou?")
    );
    double apostaTotal = ApostaAmigo1 + ApostaAmigo2 + ApostaAmigo3;

    double premio1 = ApostaAmigo1 / apostaTotal * premio;
    double premio2 = ApostaAmigo2 / apostaTotal * premio;
    double premio3 = ApostaAmigo3 / apostaTotal * premio;

aux = "O amigo 1 recebe R$ " + String.format("%.2f", premio1) + "\nO amigo 2 leva R$ " + String.format("%.2f", premio2) + "\n O amigo 3 leva R$ " + String.format("%.2f", premio3);
JOptionPane.showMessageDialog(null, aux);
    }

}