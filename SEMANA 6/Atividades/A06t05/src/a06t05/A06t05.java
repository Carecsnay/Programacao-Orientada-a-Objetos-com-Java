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

        if (codigo > 7) {
            System.out.println("Opção inválida, escolha de 1 a 7!");
        } 
        
        else {

            System.out.println("Digite a opção de exibição do texto:");
            System.out.println("[" + i++ + "] Via prompt");
            System.out.println("[" + i++ + "] Via interface gŕafica");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    imprimir(diaSemana(codigo), codigo);
                    break;
                case 2:
                    imprimir(diaSemana(codigo));
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    private static String diaSemana(int codigoInseridoPeloUsuario) {
        List<String> dias = new ArrayList<>();
        dias.add("Domingo");
        dias.add("Segunda-Feira");
        dias.add("Terça-Feira");
        dias.add("Quarta-Feira");
        dias.add("Quinta-Feira");
        dias.add("Sexta-Feira");
        dias.add("Sábado");

        switch (codigoInseridoPeloUsuario) {
            case 1:
                return dias.get(0);
            case 2:
                return dias.get(1);
            case 3:
                return dias.get(2);
            case 4:
                return dias.get(3);
            case 5:
                return dias.get(4);
            case 6:
                return dias.get(5);
            case 7:
                return dias.get(6);
            default:
                System.out.println("Opção inválida!");
                break;
        }
        return diaSemana(codigoInseridoPeloUsuario);
    }

    private static String imprimir(String diaSemanaPrompt, int numeroSemana) {
        System.out.println("O dia escolhido foi: " + diaSemana(numeroSemana));
        return diaSemana(numeroSemana);
    }

    private static String imprimir(String diaSemanaInterfaceGrafica) {
        JOptionPane.showMessageDialog(null, "O dia escolhido foi: " + diaSemanaInterfaceGrafica, "Interface Gráfica", 2);
        return diaSemanaInterfaceGrafica;
    }
}
