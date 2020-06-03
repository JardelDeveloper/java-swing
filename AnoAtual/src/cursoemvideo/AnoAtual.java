/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jardel
 */
public class AnoAtual {
    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("y");
        String dataFormatada = formatar.format(data);
        System.out.println(dataFormatada);
    }
}
