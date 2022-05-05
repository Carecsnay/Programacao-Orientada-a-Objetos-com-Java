package a05ex03;

import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A05ex03 {

    /*
   Crie um programa que apresente uma matriz que represente um tabuleiro de damas; O programa deve solicitar a posição inicial da peça (número da linha    e numero da coluna) e a posição final da peça, apresentando o resultado do tabuleiro após o movimento;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, j; //i representa as linhas e j as colunas;
        int incremento = 0;

        int[][] tabuleiro = new int[8][8]; //Sabendo que um tabuleiro possui 64 casas, criamos uma matriz 8 por 8 (8*8=64)

        //preenchendo o tabuleiro
        for (i = 0; i < 8; i++) {  //linha se inicia em 0 pois os vetores começam com indice 0, ali recebe número 8 porque cada coluna tem 8 linhas e então linha recebe incremento para percorrer todas as 8 posições.
            for (j = 0; j < 8; j++) {
                tabuleiro[i][j] = incremento;
            }
        }
        
        //exibindo o tabuleiro
        for (i = 0; i < 8; i++) {  //linha se inicia em 0 pois os vetores começam com indice 0, ali recebe número 8 porque cada coluna tem 8 linhas e então linha recebe incremento para percorrer todas as 8 posições.
            for (j = 0; j < 8; j++) {
                if (tabuleiro[i][j] < 10 ) {
                    System.out.print("[" + i + "][" + j + "]:0" + tabuleiro[i][j]+" "); //imprime os valores até 9 sem quebrar o output
                } else {
                    System.out.print("[" + i + "][" + j + "]:" + tabuleiro[i][j]+" ");
                }
            }
            System.out.print("\n"); //quebra quando terminar o loop da linha.
        }
        System.out.println("");
        int peca = 1;
        
        System.out.println("Digite em qual linha você quer colocar a peça?");
        int a = sc.nextInt();
        
        System.out.println("Digite agora em qual coluna você quer colocar a peça?");
        int b = sc.nextInt();
        tabuleiro [a][b] = peca;
        
        for (a = 0; a < 8; a++) {  //linha se inicia em 0 pois os vetores começam com indice 0, ali recebe número 8 porque cada coluna tem 8 linhas e então linha recebe incremento para percorrer todas as 8 posições.
            for (b = 0; b < 8; b++) {
                if (tabuleiro[a][b] < 10 ) {
                    System.out.print("[" + a + "][" + b + "]:0" + tabuleiro[a][b]+" "); //imprime os valores até 9 sem quebrar o output
                } else {
                    System.out.print("[" + a + "][" + b + "]:" + tabuleiro[a][b]+" ");
                }
            }
            System.out.print("\n"); //quebra quando terminar o loop da linha.
        }
    }
}
