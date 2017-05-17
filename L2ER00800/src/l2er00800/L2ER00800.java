/*
O fatorial de um número consiste em um importante mecanismo nos estudos 
envolvendo Análise Combinatória, pois a multiplicação de números naturais 
consecutivos é muito utilizada nos processos de contagem. Fatorial de um 
número consiste em multiplicar o número por todos os seus antecessores 
até o número 1.  
 
Observe a definição a seguir:  
Representamos o fatorial de um número por n! e o desenvolvimento por n! = n * 
(n – 1) * (n – 2) * (n – 3) * ... * 4 * 3 * 2 * 1 para n ≥ 2. Caso n = 1, 
temos 1! = 1 e n = 0, temos 0! = 1.  
 
Exemplo 1  
 
3! = 3 * 2 * 1 = 6  
4! = 4 * 3 * 2 * 1 = 24  
5! = 5 * 4 * 3 * 2 * 1 = 120  
6! = 6 * 5 * 4 * 3 * 2 * 1 = 720  
7! = 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040 
 */
package l2er00800;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER00800 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int nr, nmr;
        float fatorial = 1;
        
        System.out.println("..:: FATORIAL ::..");
        System.out.println("Digite um Número Inteiro: ");
        nmr = input.nextInt();
        
        
        for (nr = 1; nr <= nmr; nr++) {
            fatorial = fatorial * nr;
            
            
        }
        System.out.println("O fatorial de " + nmr + " é: " + fatorial);
    }
    
}
