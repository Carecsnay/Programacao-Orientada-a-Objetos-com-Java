package a09ex05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BRUNO
 */
public class A09ex05 {

    public static void main(String[] args) {
        try {
            //entrada de dados
            System.out.println("Descubra o dia da semana que você nasceu");
            System.out.print("1º Digite a sua data de nascimento (DD/MM/AAAA): ");
            Scanner scan = new Scanner(System.in);
            String d = scan.next();

            //critérios da formatação
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            /* Pega o objeto escaneado em String e transforma em um objeto do tipo DATE;
            A IDE sugere criar uma try catch o código pode gerar uma exceção; */
            Date data = df.parse(d);

            //Apresentação do dia da semana, de acordo com a documentação a letrinha "E" refere-se ao dia da semana correspondente, "EEEE" mostra também o dia da semana, porém com o nome completo;
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

            //Validando se o usuário nasceu em UMA "feira" ou em UM "sabado ou domingo".
            if (sdf.format(data).contains("feira")) {
                System.out.println("Você nasceu em uma" + sdf.format(data));
            } else {
                System.out.println("Você nasceu em um" + sdf.format(data));
            }

        } catch (ParseException ex) {
            Logger.getLogger(A09ex05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
