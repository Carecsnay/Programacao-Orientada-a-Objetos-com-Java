package forca;

import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        int vidas = 7;
        String palavra = "Teste";
        String palpites = "";
        Scanner sc = new Scanner(System.in);

        while (vidas > 0) {
            for (int i = 0; i < palavra.length(); i++) {
                char x = palavra.charAt(i); //mostra as palavras verdadeiras e mostra _ nas palavras erradas
                if (palpites.matches(".*"+x+".*")) { //verifica se as respostas estão contidas em X
                System.out.print(x+" ");
                }
                
                else {
                    System.out.print("_ ");
                }
            }

            System.out.println("\n\nVidas Restantes = "+vidas+", Digite uma letra: ");
            String letraDigitada = sc.next();

            if (!letraDigitada.matches("[a-z]|[A-Z]")) { //verifica se é uma letra! MAIUSC ou minusc.
                continue; //se não for uma letra o programa volta para o inicio do while.
            }

            if (palavra.matches(".*" + letraDigitada + ".*")) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Errou!");
                vidas--;
            }
            palpites += letraDigitada;
        }
        System.out.println("Game Over!");
    }
}
