package a06t03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A06t03 {

    /**
     * Crie um método chamado 'imprimir' que mostre uma mensagem gráfica com o texto passado por parâmetro;
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto a ser convertido em uma mensagem gráfica: ");
        String texto = sc.nextLine();

        System.out.println(imprimir(texto));
    }

    private static String imprimir(String convertido) {
        JOptionPane.showMessageDialog(null, convertido, "Convertido", 2);
        return convertido;
    }
}
