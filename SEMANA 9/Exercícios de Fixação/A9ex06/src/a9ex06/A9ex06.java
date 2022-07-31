//---------------------------------------
//Author: Eric Richard Ortolan Chrystovam
//---------------------------------------
package a9ex06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class A9ex06 {

    public static void main(String[] args) throws ParseException {

        String SData_envio = JOP_question.question("digite a data de envio do produto", "\\d{1,2}/\\d{1,2}/\\d{4}", "Data invalida");
        String SPrazo = JOP_question.question("Digite o prazo em dias", "\\d+", "Digite um numero inteiro");
        int prazo = Integer.parseInt(SPrazo);

        SimpleDateFormat Fpadrao = new SimpleDateFormat("dd/MM/yyyy");

        Date Data_envio = Fpadrao.parse(SData_envio);

        Calendar c = Calendar.getInstance();
        c.setTime(Data_envio);
        c.add(Calendar.DATE, prazo);
        
        JOptionPane.showMessageDialog(null,"Provavel data de recebimento : "+ Fpadrao.format(c.getTime()));
       
    }

}
