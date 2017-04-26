/*
Criar um programa que leia um número que será o limite superior de um intervalo e
imprimir todos os números ímpares menores do que esse número. 
*/
package l2er00300;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER00300 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        int i, num, result;
        
        System.out.println("Digite um número inteiro: ");
        num = input.nextInt();
        System.out.println();
        
        System.out.println("Os números ímpares menores que " + num + " são: ");
        
        for (i = 1; i <= num; i++) {
            
            result = i % 2;
            
            if (result != 0) {
                System.out.println(i);
            }
        }
    }
    
}
