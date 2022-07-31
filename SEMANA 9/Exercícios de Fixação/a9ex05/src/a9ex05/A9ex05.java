//---------------------------------------
//Author: Eric Richard Ortolan Chrystovam
//---------------------------------------
package a9ex05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A9ex05 {

    public static void main(String[] args) throws ParseException {
        try {
            
            
            SimpleDateFormat Formato_dia_da_semana = new SimpleDateFormat("EEEE"); // formato que da o dia da semana
            SimpleDateFormat Formato_aniversario = new SimpleDateFormat("dd/MM/yyyy"); // formato que eu quero que entre 
            //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
            String data = JOP_question.question("Escreva uma data de nascimento", "\\d{1,2}/\\d{1,2}/\\d{4}", "Escreva uma dasta de nascimento valida\n exemplo: 29/08/2002"); // ve se o que foi escrito é realmente uma data de nascimento

            

            Date Data_de_nascimento = Formato_aniversario.parse(data);

            System.out.println(Formato_dia_da_semana.format(Data_de_nascimento));
            
            
        } catch (ParseException e) {
            System.out.println("erro");
        }catch(NullPointerException e1){/*botao cancel*/}

    }

}
