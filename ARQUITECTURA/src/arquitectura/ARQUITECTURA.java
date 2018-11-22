/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;
import java.util.Random;
/**
 *
 * @author Yordy
 */
public class ARQUITECTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
             float numeroAleatorio = (float) (Math.random()*1-6+1)+6;
             System.out.println("Numero aleatorio "+i+": "+numeroAleatorio);
             double res= Math.pow(2.71,numeroAleatorio)/Math.pow(numeroAleatorio,-1);
             double fin=Math.sin(res);
             System.out.println(" = "+fin);
        }

    
    }
    
}
