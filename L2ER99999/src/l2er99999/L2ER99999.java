/* LISTA 2 - LÓGICA DE PROGRAMAÇÃO - MOURA LACERDA - 1 SEMESTRE - RIB.PRETO/2017
 *                 ESTRUTURAS DE REPETIÇÃO.
 *
 *
**/
package l2er99999;

import java.util.Random;
import java.util.Scanner;

public class L2ER99999 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner p = new Scanner(System.in);

        int nroEx = 0, continuar = 0;

        do {
            System.out.println("**********************************");
            System.out.println("LISTA 2 - ESTRUTURAS DE REPETIÇÃO.");
            System.out.println("CENTRO UNIVERSITÁRIO MOURA LACERDA.");
            System.out.println("Lógica de Programação - 1º Semestre.");
            System.out.println("**********************************");
            System.out.println();
            System.out.println();

            System.out.println("Olá!\nEscolha o Exercício Desejado:");
            System.out.println();
            System.out.println("> 1. O Quadrado de 5 Números.");
            System.out.println("> 2. Fatorial de 1 à 100.");
            System.out.println("> 3. Todos os Números Ímpares Menores do que o Informado.");
            System.out.println("> 4. Média e Lucro de Produtos.");
            System.out.println("> 5. Jogo das Tentativas.");
            System.out.println("> 6. Soma de pares Inteiros Positivos.");
            System.out.println("> 7. Divisores de um Número Inteiro.");
            System.out.println("> 8. Fatorial de um Número Inteiro.");
            System.out.println("-----------------------------");
            System.out.println("> 0. Informações Sobre o Trabalho.");
            System.out.println();
            System.out.println("Opção (de 0 à 13): ");

            nroEx = p.nextInt();

            if ((nroEx < 0) || (nroEx > 13)) {
                System.out.println("Digite um número válido.");
            }

            switch (nroEx) {

                case 0:
                    System.out.println("SOBRE: ");
                    System.out.println("CENTRO UNIVERSITÁRIO MOURA LACERDA");
                    System.out.println("ANÁLISE E DESENVOLVIMENTO DE SISTEMAS");
                    System.out.println("1º Semestre - 2017 - Ribeirão Preto/SP");
                    System.out.println("Aluno: Julio Batista");
                    System.out.println("RA: 4018733");
                    System.out.println("Prof.Me. José Ferreira Neto");
                    System.out.println("Versão: L2ER99999 v.1.0");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("> 1. .:: O QUADRADO DE 5 NÚMEROS ::.");

                    Scanner input = new Scanner(System.in);

                    int i,
                     num,
                     resultado;

                    for (i = 1; i <= 5; i++) {
                        System.out.println(i + "º Número: ");
                        num = input.nextInt();

                        resultado = num * num;

                        System.out.println("O quadrado de " + num + " é " + resultado);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("> 2. .:: FATORIAL DE 1 À 100 ::.");
                    int lim,
                     soma = 0;

                    for (lim = 1; lim <= 100; lim++) {

                        System.out.println(lim);

                        soma = soma + lim;
                    }
                    System.out.println("O Fatorial de 1 à 100 é: " + soma);
                    break;
                case 3:
                    System.out.println("> 3. .:: TODOS OS NÚMEROS ÍMPARES MENORES QUE O INFORMADO ::.");
                    Scanner sc = new Scanner(System.in);

                    int cont,
                     n1,
                     result;

                    System.out.println("Digite um número inteiro: ");
                    n1 = sc.nextInt();
                    System.out.println();

                    System.out.println("Os números ímpares menores que " + n1 + " são: ");

                    for (cont = 1; cont <= n1; cont++) {

                        result = cont % 2;

                        if (result != 0) {
                            System.out.println(cont);
                        }
                    }
                    break;
                case 4:
                    System.out.println("> 4. .:: MÉDIA E LUCRO DE PRODUTOS ::.");
                    Scanner scn = new Scanner(System.in);

                    float cProd,
                     cTot,
                     cMed = 0,
                     vProd,
                     vTot,
                     vMed = 0,
                     lucPrej;
                    int key,
                     qtdComp;

                    for (key = 1; key <= 10; key++) {

                        System.out.println("Digite o preço de CUSTO do " + key + "º Produto: ");
                        cProd = scn.nextFloat();

                        System.out.println("Digite o preço de VENDA do " + key + "º Produto: ");
                        vProd = scn.nextFloat();

                        System.out.println("Informe a quantidade comprada pelo consumidor: ");
                        qtdComp = scn.nextInt();

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
                    break;
                case 5:
                    Scanner in = new Scanner(System.in);
                    Random rd = new Random();

                    int c1,
                     nm1 = 0,
                     tent,
                     falta;

                    nm1 = rd.nextInt((100 - 1) + 1) + 1;

                    System.out.println("> 5. ..:: Jogo das TENTATIVAS! ::..\nTente adivinhar um número de 1 à 100.");

                    for (c1 = 1; c1 <= 10; c1++) {
                        System.out.println("Digite a " + c1 + "ª tentativa: ");
                        tent = in.nextInt();
                        //Como proceder se quiser que ele não contabilize quando digitar um valor válido?    
                        if ((tent < 1) || (tent > 100)) {
                            System.out.println("Não é um valor válido.");
                        } else {
                            if (tent == nm1) {
                                System.out.println("Parabéns, você acertou!!!");
                                System.out.println("O número é " + nm1);
                                break;
                            } else {
                                falta = 10 - c1;
                                System.out.println("Uhhh, quase! Tente outra vez!\nVocê ainda tem " + falta + " tentativas.");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("> 6. .:: SOMA DE PARES INTEIROS POSITIVOS ::.");
                    Scanner put2 = new Scanner(System.in);

                    int n0,
                     n4,
                     par,
                     sum = 0;

                    System.out.println("Digite um número Inteiro maior que zero: ");
                    n4 = put2.nextInt();
                    System.out.println();
                    if (n4 > 0) {

                        for (n0 = 1; n0 <= n4; n0++) {

                            par = n0 % 2;

                            if (par == 0) {
                                System.out.println(n0);
                                sum = sum + n0;
                            }
                        }
                        System.out.println("Soma de todos os números pares é: " + sum);
                    } else {
                        System.out.println("Digite um valor válido.");
                    }
                    break;
                case 7:
                    System.out.println("> 7. ..:: DIVISORES DE UM NÚMERO INTEIRO ::..");
                    Scanner put3 = new Scanner(System.in);

                    int n3,
                     nm,
                     resto = 0;

                    System.out.println("Informe um número Inteiro: ");
                    n3 = put3.nextInt();

                    System.out.println("Os divisores de " + n3 + " são: ");
                    System.out.println("1");
                    for (nm = 2; nm < n3 / 2; nm++) {

                        resto = n3 % nm;

                        if (resto == 0) {
                            System.out.println(nm);
                        }
                    }
                    System.out.println(n3);
                    break;
                case 8:
                    System.out.println("> 8. ..:: FATORIAL DE UM NÚMERO INTEIRO ::..");
                    Scanner put4 = new Scanner(System.in);

                    int nr,
                     nmr;
                    float fatorial = 1;

                    System.out.println("Digite um Número Inteiro: ");
                    nmr = put4.nextInt();

                    for (nr = 1; nr <= nmr; nr++) {
                        fatorial = fatorial * nr;
                    }
                    System.out.println("O fatorial de " + nmr + " é: " + fatorial);
                    break;
            }

            System.out.println("Deseja Continuar?\n1. Sim.\n2. Não.");
            continuar = p.nextInt();

        } while (continuar == 1);

    }

}
