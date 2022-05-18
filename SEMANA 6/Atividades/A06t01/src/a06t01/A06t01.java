package a06t01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A06t01 {

    /**
     * Crie um método que retorne o nome do indivíduo de acordo com o código inteiro passado por parâmetro;
     */
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual nome você quer descobrir");
        System.out.println("Nome "+"["+i+++"]");
        System.out.println("Nome "+"["+i+++"]");
        System.out.println("Nome "+"["+i+++"]");
        int codigo = sc.nextInt();

        System.out.println(getNomes(codigo));
    }

    private static List<String> getNomes(int codigo) {
        List<String> nome1 = new ArrayList<>();
        nome1.add("Bruno");

        List<String> nome2 = new ArrayList<>();
        nome2.add("Marcia");

        List<String> nome3 = new ArrayList<>();
        nome3.add("Leon");

        switch (codigo) {
            case 1:
                return nome1;
            case 2:
                return nome2;
            case 3:
                return nome3;
            default:
                System.out.println("Escolha entre 1 e 3.");
        }
        return getNomes(codigo);
    }
}

