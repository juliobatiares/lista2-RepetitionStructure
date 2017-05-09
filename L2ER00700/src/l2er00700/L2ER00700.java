/*
Ler um número, calcular e escrever quantos divisores ele possui.  
Um número é divisor de outro quando o resto da divisão for igual a 0. 

Portanto: 
    12 é divisível por 1, 2, 3, 4, 6 e 12.  
    36 é divisível por 1, 2, 3, 4, 6, 9, 12, 18 e 36.  
    48 é divisível por 1, 2, 3, 4, 6, 8, 12, 16, 24 e 48.  
 
    Observações importantes:   O menor divisor natural de um número é 
    sempre o número 1.  O maior divisor de um número é o próprio número. 
    O zero não é divisor de nenhum número.  Os divisores de um número 
    formam um conjunto finito. 
 */
package l2er00700;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER00700 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n1, nm, resto = 0;
        
        System.out.println("Informe um número Inteiro: ");
        n1 = input.nextInt();
        
        for (nm = 1; nm <= n1; nm++) {
            
            resto = n1 % nm;
            
            if (resto == 0) {
                System.out.println("Divisor é: " + nm);
            }
            
        }
    }
    
}
