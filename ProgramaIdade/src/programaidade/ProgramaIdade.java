/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author jardel
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anoAtual = LocalDate.now().getYear();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o ano do seu nascimento?");
        int nascimento = teclado.nextInt();
        int idade = anoAtual - nascimento;
        System.out.printf("Você tem %d anos, logo ", idade);
        if (idade>=18) {
            System.out.println("você é maior de idade!");
        } else {
            System.out.println("você é menor de idade!");
        }       
    }   
}
