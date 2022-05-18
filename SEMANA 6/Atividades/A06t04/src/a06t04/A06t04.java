package a06t04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A06t04 {

    /**
     * Crie uma sobrecarga para cada método do exercício anterior, para receber também o tipo da mensagem que será exibida: 
     * 1 para mensagem em texto e 2 para mensagem gráfica;
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha de 1 a 7 para retornar um dia da semana: ");

        int codigo = sc.nextInt();

        System.out.println(diaSemana(codigo));
    }

    private static String diaSemana(int codigoInserido) { 
        List<String> dias = new ArrayList<>() ;
        dias.add("Domingo");
        dias.add("Segunda-Feira");
        dias.add("Terça-Feira");
        dias.add("Quarta-Feira");
        dias.add("Quinta-Feira");
        dias.add("Sexta-Feira");
        dias.add("Sábado");
                
        System.out.print("Convertendo...o dia escolhido foi: ");
        
        switch (codigoInserido) {
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
        }
        return diaSemana(codigoInserido);
    }
}
