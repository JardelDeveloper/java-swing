/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertaoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author jardel
 */
public class AlertaOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        s += n;
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html><span style='color: red';><u>Olá Mundo!</u></span></html>", "Teste", JOptionPane.ERROR_MESSAGE);
    }
    
}
