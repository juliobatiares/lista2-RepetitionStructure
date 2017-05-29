/*
 Considere um programa que determina a soma dos n primeiros números pares 
 positivos a partir de um número x informado pelo usuário.  
 */
package l2er00600;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER00600 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int n, n1, par, soma = 0, Continuar = 0;
        
        do {
            System.out.println("Digite um número Inteiro maior que zero: ");
            n1 = input.nextInt();
            System.out.println();
            if (n1 > 0) {
            
                for (n = n1; n <= n1; n++) {
            
                    par = n % 2;
            
                    if (par == 0) {
                        System.out.println(n);
                        soma = soma + n;
                    }
            
                }
                System.out.println("Soma de todos os números pares é: " + soma);
                System.out.println("Deseja Continuar?\n(1) Sim\n(2) Não");
                Continuar = input.nextInt();
            } else {
                System.out.println("Digite um valor válido.\nDeseja Continuar?\n(1) Sim\n(2) Não");
                Continuar = input.nextInt();
            }
        } while (Continuar == 1);

        
    }
    
}