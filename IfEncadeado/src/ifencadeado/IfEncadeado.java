/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifencadeado;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jardel
 */
public class IfEncadeado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anoAtual = LocalDate.now().getYear();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = teclado.nextInt();
        int idade = anoAtual - anoNascimento;
        if (idade < 16){
            System.out.println("Não pode votar");
        }
        else if (idade >= 16 && idade <18 || idade >70){
            System.out.println("Voto opcional");
        }
        else{
            System.out.println("Voto obrigatório");
        }
    }
    
}
