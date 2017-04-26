/*
Faça um programa que receba o preço de custo e o preço de venda de 10 produtos. Para
cada produto informe a quantidade que um determinado consumidor comprou. Mostre
como resultado se houve lucro, prejuízo ou empate para cada produto. Informe também a
média de preço de custo e a média do preço de venda unitário. 
*/
package l2er00400;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class L2ER00400 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        float cProd, cTot, cMed = 0, vProd, vTot, vMed = 0, lucPrej;
        int i, qtdComp;
        
        for (i = 1; i <= 10; i++) {
            
            System.out.println("Digite o preço de CUSTO do " + i + "º Produto: ");
            cProd = input.nextFloat();
            
            System.out.println("Digite o preço de VENDA do " + i + "º Produto: ");
            vProd = input.nextFloat();
            
            System.out.println("Informe a quantidade comprada pelo consumidor: ");
            qtdComp = input.nextInt();
            
            cTot = cProd * qtdComp;
            vTot = vProd * qtdComp;
            
            lucPrej = vTot - cTot;
            
            cMed = cMed + cProd;
            vMed = vMed + vProd;
            
            if (lucPrej > 0) {
                System.out.println("Seu lucro foi de: R$" + lucPrej);
                System.out.println();
                System.out.println();
                System.out.println("--------------------------------------------");
                System.out.println();
            } else {
                if (lucPrej == 0) {
                    System.out.println("Empate. Seu produto não teve lucro nem prejuízo.");
                    System.out.println();
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    System.out.println();
                } else {
                    System.out.println("Você teve um prejuízo de: R$" + lucPrej);
                    System.out.println();
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    System.out.println();
                }
            }

        }
             
        cMed = cMed / 10;
        vMed = vMed / 10;
        
        System.out.println("A média de CUSTO de todos os produtos é: R$" + cMed);
        System.out.println("A média de VENDA de todos os produtos é: R$" + vMed);
        
    }
    
}
