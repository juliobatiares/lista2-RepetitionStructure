/*
Crie um programa que imprima todos os números de 1 até 100 e, ao final, imprima a soma
deles. 
 */
package l2er002;

//import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner input = new Scanner (System.in);
        
        int i, soma = 0;
        
        for (i = 1; i <= 100; i++) {
            
            System.out.println(i);
            
            soma = soma + i;
            
        }
        System.out.println("O Fatorial de 1 à 100 é: " + soma);

    }
    
}
