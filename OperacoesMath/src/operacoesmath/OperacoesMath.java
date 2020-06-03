/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesmath;

/**
 *
 * @author jardel
 */
public class OperacoesMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi = Math.PI;
        float raizQuadrada = (float) Math.sqrt(81);
        float raizCubica = (float) Math.cbrt(27);
        int potencia2 = (int) Math.pow(5, 2);
        System.out.printf("Valor de PI: " + pi + "\n");
        System.out.printf("Raiz quadrada: " + raizQuadrada + "\n");
        System.out.printf("Raiz cúbica: " + raizCubica + "\n");
        System.out.printf("Exponenciação/Potência: " + potencia2 + "\n");
    }
    
}
