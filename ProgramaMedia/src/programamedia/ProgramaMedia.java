/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author jardel
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n1 = teclado.nextFloat();
        
        if (n1<0 || n1>10) {
            System.out.println("Nota inválida, insira novamente");
        }
        else {
            System.out.println("Segunda nota: ");
            float n2 = teclado.nextFloat();
 
            if (n2<0 || n2>10){
                System.out.println("Nota inválida, insira novamente");
            }
            else {
                float media = (n1+n2)/2;
                    System.out.println("Sua média foi " + media);
                
                if (media>=0 && media<=5) {            
                    System.out.println("Suas notas foram muito baixas, estude mais");
                }
                if (media>5 && media<7) {
                    System.out.println("Suas notas precisam aumentar mais um pouco para conseguir a média 7, estude");
                }
                if (media>=7 && media<=8) {
                    System.out.println("Parabéns, você está na média!");
                }
                if (media>8 && media <=10) {
                    System.out.println("Parabéns, você está acima da média!");
                }
            }           
        }               
    }
}   

