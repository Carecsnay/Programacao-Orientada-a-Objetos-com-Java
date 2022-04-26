package forca;
import java.util.scanner;

public class Forca {
    public static void main(String[] args) {
        int vidas = 7;
        String palavra = args[0];

        scanner.scanner sc = new scanner(System.in);
        
        while (vidas > 0) {
            System.out.println("Restam "+vidas+" chances Digite uma letra: ");
            String letraDigitada = sc.next();

            if palavra.match(".*"+letraDigitada+".*");
                System.out.println("Parabéns, você acertou!");
            else
                System.out.println("Tente novamente, você errou! Restam "+vidas+" chances");
                vidas--;
        }
    }
}