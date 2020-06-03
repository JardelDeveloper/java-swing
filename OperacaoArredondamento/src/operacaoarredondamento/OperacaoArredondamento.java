/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacaoarredondamento;

/**
 *
 * @author jardel
 */
public class OperacaoArredondamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y = -50;
        float x = (float) 8.6;
        int abs = (int) Math.abs(y);
        int arBaixo = (int) Math.floor(x);
        int arCima = (int) Math.ceil(x);
        int arAritmetico = (int) Math.round(x);
        System.out.println("Valor absoluto: " + abs);
        System.out.println("Arredondamento para baixo: " + arBaixo);
        System.out.println("Arredondamento para cima: " + arCima);
        System.out.println("Arredondamento para aritmetico: " + arAritmetico);
    }
    
}
