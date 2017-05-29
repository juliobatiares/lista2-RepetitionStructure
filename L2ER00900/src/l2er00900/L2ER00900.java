/*
 * Números primos são os números naturais que têm apenas dois divisores 
 * diferentes: o 1 e ele mesmo. 
 */
package l2er00900;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER00900 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        int i, n1, divisor = 1, primo = 0;
        
        System.out.println(".:: Números Primos::. ");
        System.out.println("Digite um número Inteiro: ");
        
        n1 = input.nextInt();
        
        for (i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                primo = primo + 1;
            }
        }
        
        if (primo == 2) {
            System.out.println(n1 + " é primo.");
        } else {
            System.out.println(n1 + " não é primo.");
        }
                
    }
}
     
