/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author jardel
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, contador = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número");
            numero = teclado.nextInt();
            contador += numero;
            System.out.println("Quer continuar? [S/N]");
            resposta = teclado.next();
        } while (resposta.equals("S"));
            System.out.printf("A soma dos números é %d \n", contador);
    }
    
}
