package a05ex03;

import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A05ex03 {

    /*
Crie um programa que apresente uma matriz que represente um tabuleiro de damas; O programa deve solicitar a posição inicial da peça (número da linha e numero da coluna) e a posição final da peça, apresentando o resultado do tabuleiro após o movimento;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j; //i representa as linhas e j as colunas;
        int incremento = 0;

        int[][] tabuleiro = new int[8][8]; //Sabendo que o tabuleiro possui 64 casas, criamos uma matriz 8x8 (8*8=64)

        //Preenchendo o tabuleiro
        for (i = 0; i < 8; i++) { //linha se inicia com 0, devido ao indice dos vetores começarem com 0.
            for (j = 0; j < 8; j++) {
                tabuleiro[i][j] = incremento;
            }
        }

        //Exibindo o tabuleiro
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print("[" + i + "][" + j + "]" + tabuleiro[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        int peca = 1;

        System.out.println("Digite a linha que você quer colocar a peça!");
        int a = sc.nextInt();
        
        System.out.println("Digite a coluna que você quer colocar a peça!");
        int b = sc.nextInt();
        
        tabuleiro[a][b] = peca;
        
        for(a = 0; a < 8; a++){
            for(b = 0; b < 8; b++) {
                System.out.print("[" +a+"]["+b+"]"+tabuleiro[a][b]+" ");
            }
        System.out.print("\n");
        }
        
    }
}
