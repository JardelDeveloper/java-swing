/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author jardel
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Uso da classe Scanner para criar um objeto com entrada e saída de dados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("%s tirou nota %.1f \n", nome, nota);
        
        // Exemplo padrão:
        //System.out.println("A nota é " + nota); 
        // Exemplo de printf
        //System.out.printf("A nota do %s foi %.2f \n", nome, nota);
        // Exemplo de format
        //System.out.format("A nota do %s foi %.2f \n", nome, nota);
    }
    
}
