package a06t06;

import static a06t06.Calendario.diaSemana;
import java.util.Scanner;


/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A06t05 {

    /**
     * Crie uma sobrecarga para cada método do exercício anterior, para receber também o tipo da mensagem que será exibida: 1 para mensagem em texto e 2 para mensagem gráfica;
     */
    public static void main(String[] args) {
        Calendario cld = new Calendario();

        int i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha de 1 a 7 para retornar um dia da semana: ");
        int codigo = sc.nextInt();

        if (codigo > 7) {
            System.out.println("Opção inválida, escolha de 1 a 7!");
        } else {
            System.out.println("Digite a opção de exibição do texto:");
            System.out.println("[" + i++ + "] Via prompt");
            System.out.println("[" + i++ + "] Via interface gŕafica");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cld.imprimir(diaSemana(codigo), codigo);
                    break;
                case 2:
                    cld.imprimir(diaSemana(codigo));
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

    }
}
