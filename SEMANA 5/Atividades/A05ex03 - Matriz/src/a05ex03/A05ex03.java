package a05ex03;
/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
import java.util.Scanner;
/*
   Crie um programa que apresente uma matriz que represente um tabuleiro de damas; O programa deve solicitar a posição inicial da peça (número da linha    e numero da coluna) e a posição final da peça, apresentando o resultado do tabuleiro após o movimento;
*/
public class A05ex03 {

    public static void main(String[] args) {
        int i, j; //i representa as linhas e j as colunas;
        int incremento = 1;
        
        int[][] tabuleiro = new int[8][8]; //Sabendo que um tabuleiro possui 64 casas, criamos uma matriz 8 por 8 (8*8=64)
        
        //preenchendo o tabuleiro
        for (i=0;i<8;i++){  //linha se inicia em 0 pois os vetores começam com indice 0, ali recebe número 8 porque cada coluna tem 8 linhas e então linha recebe incremento para percorrer todas as 8 posições.
            for (j=0;j<8;j++){
                tabuleiro[i][j]=incremento++;
            } 
        }
        
         //exibindo o tabuleiro
        for (i=0;i<8;i++){  //linha se inicia em 0 pois os vetores começam com indice 0, ali recebe número 8 porque cada coluna tem 8 linhas e então linha recebe incremento para percorrer todas as 8 posições.
            for (j=0;j<8;j++){
                System.out.print("|"+i+"-"+j+"|recebe: "+tabuleiro[i][j]);
            }
            System.out.print("\n");
        }
    }
}
