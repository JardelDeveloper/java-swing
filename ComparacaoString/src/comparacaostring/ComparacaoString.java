/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author jardel
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String resultadoIgual;
        String resultadoEquals;
        // Comparação de objeto
        resultadoIgual = (nome1==nome3)?"igual":"diferente"; 
        //Comparação de conteúdo de cada objeto
        resultadoEquals = (nome1.equals(nome3))?"igual":"diferente"; 
        System.out.println(resultadoIgual);
        System.out.println(resultadoEquals);
    }
    
}
