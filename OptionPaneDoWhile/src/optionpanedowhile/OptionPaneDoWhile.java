/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optionpanedowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author jardel
 */
public class OptionPaneDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, somatorio = 0;
        do {
           numero= Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um número:1<br><em>Valor 0 interrompe</em></html>"));
           somatorio += numero;
         //JOptionPane.showMessageDialog(null, "O valor informado foi: " + n);
        } while (numero!=0);
        JOptionPane.showMessageDialog(null, "O resultado do somatório é: " + somatorio);
    }
}
