package a06ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A06ex07 {

    /*
* 
*  Crie um programa que receba como parâmetro um array de nomes de times e retorne o mesmo array ordenado e com os nomes em letras  *  maiúsculas.    
*
     */
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual produtos você quer mostrar?");
        
            System.out.println("["+i+++"] "+"Frutaria");
            System.out.println("["+i+++"] "+"Condimentos");
            System.out.println("["+i+++"] "+"Mercearia\n");
            int codigo = sc.nextInt();
            
            System.out.println(getProdutos(codigo));
    }

    private static List<String> getProdutos(int codigo) {
        List<String> produtosFab1 = new ArrayList<>();
        produtosFab1.add("Maçã");
        produtosFab1.add("Manga");
        produtosFab1.add("Abacate");

        List<String> produtosFab2 = new ArrayList<>();
        produtosFab2.add("Sal");
        produtosFab2.add("Pimenta");
        produtosFab2.add("Açafrão");

        List<String> produtosFab3 = new ArrayList<>();
        produtosFab3.add("Arroz");
        produtosFab3.add("Feijão");
        produtosFab3.add("Macarrão");
        
        switch (codigo) {
            case 1 -> {
                return produtosFab1;
            }
            case 2 -> {
                return produtosFab2;
            }
            case 3 -> {
                return produtosFab3;
            }
            
            default -> System.out.println("Escolha entre 1 e 3.");
        }
        return getProdutos(codigo);
    }
}
