package a06t05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A06t05 {

    /**
     * Crie uma sobrecarga para cada método do exercício anterior, para receber também o tipo da mensagem que será exibida: 1 para mensagem em texto e 2 para mensagem gráfica;
     */
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha de 1 a 7 para retornar um dia da semana: ");
        int codigo = sc.nextInt();

        System.out.println("Digite a opção de exibição do texto:");
        System.out.println("["+i+++"] Via prompt");
        System.out.println("["+ i+++"] Via interface gŕafica");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            imprimir(diaSemana(codigo), codigo);
        }
        
        else {
            imprimir(diaSemana(codigo));
        }
    }  
}