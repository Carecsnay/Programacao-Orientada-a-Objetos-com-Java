package a06t02;

import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A06t02 {

    /**
     * Crie um método que retorne o nome do indivíduo de acordo com o código inteiro passado por parâmetro;
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();

        System.out.println("Dentre os números informados o maior é o: "+maiorNumero(num1, num2));
    }

    private static int maiorNumero(int num1, int num2) {
        return Integer.max(num2, num2);
    }
}
