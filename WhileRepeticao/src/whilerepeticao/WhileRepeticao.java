/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilerepeticao;

/**
 *
 * @author jardel
 */
public class WhileRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc<15) {
            cc++;
            if (cc == 5 || cc == 7 || cc == 9){
                continue;
            }
            if (cc == 14){
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
