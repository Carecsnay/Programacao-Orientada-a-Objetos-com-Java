package a05ex03;

public class A05ex03 {

    public static void main(String[] args) {
        String[][] tabuleiro = new String[8][8];
        
        //Linha 01
        tabuleiro[0][0] = "1";
        tabuleiro[0][1] = "1";
        tabuleiro[0][2] = "1";
        tabuleiro[0][3] = "1";
        tabuleiro[0][4] = "1";
        tabuleiro[0][5] = "1";
        tabuleiro[0][6] = "1";
        tabuleiro[0][7] = "1";
        
        //Linha 02
        tabuleiro[1][0] = "2";
        tabuleiro[1][1] = "2";
        tabuleiro[1][2] = "2";
        tabuleiro[1][3] = "2";
        tabuleiro[1][4] = "2";
        tabuleiro[1][5] = "2";
        tabuleiro[1][6] = "2";
        tabuleiro[1][7] = "2";
        
        //Linha 03
        tabuleiro[2][0] = "3";
        tabuleiro[2][1] = "3";
        tabuleiro[2][2] = "3";
        tabuleiro[2][3] = "3";
        tabuleiro[2][4] = "3";
        tabuleiro[2][5] = "3";
        tabuleiro[2][6] = "3";
        tabuleiro[2][7] = "3";
        
         //Linha 04
        tabuleiro[3][0] = "4";
        tabuleiro[3][1] = "4";
        tabuleiro[3][2] = "4";
        tabuleiro[3][3] = "4";
        tabuleiro[3][4] = "4";
        tabuleiro[3][5] = "4";
        tabuleiro[3][6] = "4";
        tabuleiro[3][7] = "4";
        
         //Linha 05
        tabuleiro[4][0] = "5";
        tabuleiro[4][1] = "5";
        tabuleiro[4][2] = "5";
        tabuleiro[4][3] = "5";
        tabuleiro[4][4] = "5";
        tabuleiro[4][5] = "5";
        tabuleiro[4][6] = "5";
        tabuleiro[4][7] = "5";
        
         //Linha 06
        tabuleiro[5][0] = "6";
        tabuleiro[5][1] = "6";
        tabuleiro[5][2] = "6";
        tabuleiro[5][3] = "6";
        tabuleiro[5][4] = "6";
        tabuleiro[5][5] = "6";
        tabuleiro[5][6] = "6";
        tabuleiro[5][7] = "6";
        
         //Linha 07
        tabuleiro[6][0] = "7";
        tabuleiro[6][1] = "7";
        tabuleiro[6][2] = "7";
        tabuleiro[6][3] = "7";
        tabuleiro[6][4] = "7";
        tabuleiro[6][5] = "7";
        tabuleiro[6][6] = "7";
        tabuleiro[6][7] = "7";
        
         //Linha 08
        tabuleiro[7][0] = "8";
        tabuleiro[7][1] = "8";
        tabuleiro[7][2] = "8";
        tabuleiro[7][3] = "8";
        tabuleiro[7][4] = "8";
        tabuleiro[7][5] = "8";
        tabuleiro[7][6] = "8";
        tabuleiro[7][7] = "8";
        
        for (String [] aux : tabuleiro){
            System.out.println(aux[0]+" "+aux[1]+" "+aux[2]+" "+aux[3]+" "+aux[4]+" "+aux[5]+" "+aux[6]+" "+aux[7]);
        }
    }
}
