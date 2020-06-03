/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author jardel
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 
            Conversão de int para string
            int idade = 30;
            String valor = Integer.toString(idade);
            System.out.println(valor);
        */
        /*
            Conversão de string para int
            String valor = "30";
            int idade = Integer.parseInt(valor);
            System.out.println(idade);
        */
            
        // Conversão de string para float
           String valor = "30.5";
           float idade = Float.parseFloat(valor);
           System.out.printf("%.2f \n", idade);
    }
    
}
