/*
Criar um programa que faz o sorteio aleatório de um número inteiro qualquer, 
que esteja no intervalo de 1 a 100. Após esse sorteio, o programa deverá 
permitir ao usuário que o mesmo informe no máximo outros 10 valores, também 
dentro desse intervalo, afim de “descobrir” qual o número que o programa 
escolheu aleatoriamente.
 */
package l2er00500;

import java.util.Scanner;
import java.util.Random;
        
/**
 *
 * @author Julio Batista
 */
public class L2ER00500 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        
        int cont, n1, tent;
        
        n1 = rd.nextInt((100 - 1) + 1) + 1;
        
        System.out.println("Jogo das TENTATIVAS!\nTente adivinhar um número de 1 à 100.");
        
        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Digite a " + cont + "ª tentativa: ");
            tent = input.nextInt();
            
            if ((tent < 1) || (tent > 100)) {
                System.out.println("Digite um valor válido.");
            } else {
                if (tent == n1) {
                   System.out.println("Parabéns, você acertou!!!");
                   System.out.println("O número é " + n1);
                   break;
                } else {
                    System.out.println("Uhhh, quase! Tente outra vez!");
                  }
              }
                
        }
    }
    
}
