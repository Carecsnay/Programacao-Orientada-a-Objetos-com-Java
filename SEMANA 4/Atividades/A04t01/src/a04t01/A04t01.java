package a04t01;

import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A04t01 {

    /*
    
     Crie um programa que solicite o valor inicial e o valor final e mostre um contador progressivo;

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número inicial!");
        int numeroInicial = sc.nextInt();

        System.out.println("Agora digite o número final!");
        int numeroFinal = sc.nextInt();

        System.out.println("Contando na ordem crescente de " + numeroInicial + " até " + numeroFinal + "!");
        for (int contador = numeroInicial; contador <= numeroFinal; contador++) {
            System.out.println(contador);
        }
    }

}