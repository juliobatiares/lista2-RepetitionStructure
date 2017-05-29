/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2er01000;


/**
 *
 * @author Julio Batista
 */
public class L2ER01000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int i = 1, div = 50;
        double res; 
        
        for (i = 1; i <= 50; i++) {
            res = (Math.pow(2, i) / div);
            
            System.out.println("2 elevado à " + i + " dividido por " + div + " é igual à : " + res);
        
            div--;    
            
        }
        
    }
    
}
