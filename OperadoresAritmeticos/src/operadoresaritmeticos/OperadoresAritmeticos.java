/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author jardel
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Cálculo da média declarando int e float
            float N1 = 3;
            float N2 = (float) 9.5;
            float media = N2 / N1;
            float arredondar = Math.round(media);
            System.out.println("O arredondamento da média é: " + arredondar);
        
        
        // Utilização de pré incremento
        int preIncremento = 5;
        int valorPreIn = 5 + ++preIncremento;
        System.out.format("O resultado com pré-incremento é %d \n", valorPreIn);
        
        // Utilização de pós incremento
        int posIncremento = 5;
        int valorPosIn = 5 + posIncremento++;
        System.out.format("O resultado com pós-incremento é %d \n", valorPosIn);
        
        // Utilização de pré decremento
        int preDecremento = 5;
        int valorPreDe = 5 + --preDecremento;
        System.out.format("O resultado com pós-decremento é %d \n", valorPreDe);
        
        // Utilização de pós decremento
        int posDecremento = 5;
        int valorPosDe = 5 + posDecremento--;
        System.out.format("O resultado com pós-decremento é %d \n", valorPosDe);
        
        // Operação de atribuição com += -= *= /= %=
        int n1 = 4;
        n1 += 3;
        System.out.printf("A soma por atribuição é igual a %d \n", n1);
        
        int n2 = 4;
        n2 -= 3;
        System.out.printf("A subtração por atribuição é igual a %d \n", n2);
        
        int n3 = 4;
        n3 *= 3;
        System.out.printf("A multiplicação por atribuição é igual a %d \n", n3);
        
        float n4 = 4;
        n4 /= 3;
        System.out.printf("A divisão por atribuição é igual a %.1f \n", n4);
        
        float n5 = 4;
        n5 %= 3;
        System.out.printf("O resto da divisão por atribuição é igual a %.1f \n", n5);
        
        
    }
    
}
