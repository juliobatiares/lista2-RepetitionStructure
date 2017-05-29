/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2er01100;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER01100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        int i = 1, n1, resto = 0, soma = 0;
        
        System.out.println("Digite um número Inteiro: ");
        n1 = input.nextInt();
        
        for (i = 1; i <= n1; i++) {
            
            resto = n1 % i;
            
            if (resto == 0) {
                //System.out.println(i);
                soma = soma + i;
            }
            
        }
        
        soma = soma - i;
        
        if (soma == i) {
                System.out.println(n1 + " é um número perfeito.");
            } else {
                System.out.println(n1 + " NAO é um número perfeito.");
            }
        
    }
    
}
