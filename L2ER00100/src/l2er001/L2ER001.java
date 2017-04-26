/*
 Crie um programa que entre com cinco números e imprima o quadrado de cada número. 
 */
package l2er001;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int i, num, result;
        
        for (i = 1; i <= 5; i++) {
            System.out.println(i + "º Número: ");
            num = input.nextInt();
            
            result = num * num;
            
            System.out.println("O quadrado de " + num + " é " + result);
            System.out.println();
        }
    }
}
