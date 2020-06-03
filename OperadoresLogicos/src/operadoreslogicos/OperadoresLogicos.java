/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author jardel
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        // resultado = (x<y && y<z);
        //resultado = (x<y || y==z);
        resultado = (x>y ^ z>y);
        System.out.println(resultado);
    }
    
}
