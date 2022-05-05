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
        String[][] tabuleiro = new String[8][8];
        Scanner sc = new Scanner (System.in);      
        
        
        //Linha 01
        
        String a = "1";
        tabuleiro[0][0] = a;
        tabuleiro[0][1] = a;
        tabuleiro[0][2] = a;
        tabuleiro[0][3] = a;
        tabuleiro[0][4] = a;
        tabuleiro[0][5] = a;
        tabuleiro[0][6] = a;
        tabuleiro[0][7] = a;
        
        //Linha 02
        String b = "2";
        tabuleiro[1][0] = b;
        tabuleiro[1][1] = b;
        tabuleiro[1][2] = b;
        tabuleiro[1][3] = b;
        tabuleiro[1][4] = b;
        tabuleiro[1][5] = b;
        tabuleiro[1][6] = b;
        tabuleiro[1][7] = b;
        
        //Linha 03
        String c = "3";
        tabuleiro[2][0] = c;
        tabuleiro[2][1] = c;
        tabuleiro[2][2] = c;
        tabuleiro[2][3] = c;
        tabuleiro[2][4] = c;
        tabuleiro[2][5] = c;
        tabuleiro[2][6] = c;
        tabuleiro[2][7] = c;
        
         //Linha 04
         String d = "4";
        tabuleiro[3][0] = d;
        tabuleiro[3][1] = d;
        tabuleiro[3][2] = d;
        tabuleiro[3][3] = d;
        tabuleiro[3][4] = d;
        tabuleiro[3][5] = d;
        tabuleiro[3][6] = d;
        tabuleiro[3][7] = d;
        
         //Linha 05
         String e = "5";
        tabuleiro[4][0] = e;
        tabuleiro[4][1] = e;
        tabuleiro[4][2] = e;
        tabuleiro[4][3] = e;
        tabuleiro[4][4] = e;
        tabuleiro[4][5] = e;
        tabuleiro[4][6] = e;
        tabuleiro[4][7] = e;
        
         //Linha 06
         String f = "6";
        tabuleiro[5][0] = f;
        tabuleiro[5][1] = f;
        tabuleiro[5][2] = f;
        tabuleiro[5][3] = f;
        tabuleiro[5][4] = f;
        tabuleiro[5][5] = f;
        tabuleiro[5][6] = f;
        tabuleiro[5][7] = f;
        
         //Linha 07
         String g = "7";
        tabuleiro[6][0] = g;
        tabuleiro[6][1] = g;
        tabuleiro[6][2] = g;
        tabuleiro[6][3] = g;
        tabuleiro[6][4] = g;
        tabuleiro[6][5] = g;
        tabuleiro[6][6] = g;
        tabuleiro[6][7] = g;
        
         //Linha 08
         String h = "8";
        tabuleiro[7][0] = h;
        tabuleiro[7][1] = h;
        tabuleiro[7][2] = h;
        tabuleiro[7][3] = h;
        tabuleiro[7][4] = h;
        tabuleiro[7][5] = h;
        tabuleiro[7][6] = h;
        tabuleiro[7][7] = h;
        
        for (String [] aux : tabuleiro){
            System.out.println(aux[0]+" "+aux[1]+" "+aux[2]+" "+aux[3]+" "+aux[4]+" "+aux[5]+" "+aux[6]+" "+aux[7]);
        }
        
        System.out.println("Onde você quer colocar a peça?");
    }
}
