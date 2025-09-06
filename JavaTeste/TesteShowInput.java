//Ler vários valores de tipos diferentes para testar

import javax.swing.JOptionPane;

public class TesteShowInput {
    public static void main (String[] args) {
        String s;
        s = JOptionPane.showInputDialog ("Digite seu nome: ");
        JOptionPane.showMessageDialog (null,"Ja sei seu nome: " + s );
        s= JOptionPane.showInputDialog("Digite um inteiro: ");
        int i = Integer.parseInt(s);
        JOptionPane.showMessageDialog(null, " O dobro do valor é: " + 2 *i);
        s = JOptionPane.showInputDialog("Digite um ponto flutuante");
        double d = Double.parseDouble (s);
        JOptionPane.showMessageDialog(null, " A raiz desse número é " + Math.sqrt(d));

    }
    
}
