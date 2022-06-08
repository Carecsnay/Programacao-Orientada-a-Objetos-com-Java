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
            System.out.println("Digite a sua data de nascimento");
            Scanner scan = new Scanner(System.in);
            String d = scan.next();
            
            //critérios da formatação
            DateFormat df = DateFormat.getDateInstance();
            /*
            Pega o objeto escaneado em String e transforma em um objeto do tipo DATE;
            A IDE sugere criar uma try catch o código pode gerar uma exceção; 
            */
            Date data = df.parse(d); 
            
            //Apresentação do dia da semana, de acordo com a documentação a letrinha "E" refere-se ao dia da semana correspondente.;
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE"); 
            
            
            System.out.print("você nasceu: "+sdf.format(data));
               
            
        } catch (ParseException ex) {
            Logger.getLogger(A09ex05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
