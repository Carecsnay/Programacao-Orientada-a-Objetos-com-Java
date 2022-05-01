package a04t03;

import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A04t03 {

    /*
    
    Crie um programa que solicite um texto como entrada e mostre como retorno o mesmo texto, sem as vogais. 
    Exemplo: “Aprendendo Java” resulta em “prndnd Jv”;
    
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra a ser removido todas as vogais");
        String palavraDigitada1 = sc.next();
        
        System.out.println("Digite a primeira palavra a ser removido todas as vogais");
        String palavraDigitada2 = sc.next();
        
        palavraDigitada1 = palavraDigitada1.replace('a', ' ');
        palavraDigitada1 = palavraDigitada1.replace('A', ' ');
        palavraDigitada1 = palavraDigitada1.replace('e', ' ');
        palavraDigitada1 = palavraDigitada1.replace('E', ' ');
        palavraDigitada1 = palavraDigitada1.replace('i', ' ');
        palavraDigitada1 = palavraDigitada1.replace('I', ' ');
        palavraDigitada1 = palavraDigitada1.replace('o', ' ');
        palavraDigitada1 = palavraDigitada1.replace('O', ' ');
        palavraDigitada1 = palavraDigitada1.replace('u', ' ');
        palavraDigitada1 = palavraDigitada1.replace('U', ' ');
        palavraDigitada1 = palavraDigitada1.replaceAll("\\s+", "");
        
        palavraDigitada2 = palavraDigitada2.replace('a', ' ');
        palavraDigitada2 = palavraDigitada2.replace('A', ' ');
        palavraDigitada2 = palavraDigitada2.replace('e', ' ');
        palavraDigitada2 = palavraDigitada2.replace('E', ' ');
        palavraDigitada2 = palavraDigitada2.replace('i', ' ');
        palavraDigitada2 = palavraDigitada2.replace('I', ' ');
        palavraDigitada2 = palavraDigitada2.replace('o', ' ');
        palavraDigitada2 = palavraDigitada2.replace('O', ' ');
        palavraDigitada2 = palavraDigitada2.replace('u', ' ');
        palavraDigitada2 = palavraDigitada2.replace('U', ' ');
        palavraDigitada2 = palavraDigitada2.replaceAll("\\s+", "");
        
        System.out.println("As palavras sem as vogais ficou: "+palavraDigitada1+ " " +palavraDigitada2);
    }
}
