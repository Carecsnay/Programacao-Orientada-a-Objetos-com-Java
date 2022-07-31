//---------------------------------------
//Author: Eric Richard Ortolan Chrystovam
//---------------------------------------
package a9ex01;

import java.text.DateFormat;
import java.util.Date;

public class A9ex01 {
    
    public static void main(String[] args) {
     //classe date e dateformat
        Date Hoje = new Date(); // Quando se cria uma nova data sem especificar nada ela pega e vira a data de hoje
        System.out.println(Hoje);
        DateFormat DF = DateFormat.getDateTimeInstance(); // jeito de formatar a data do sistema 
        DateFormat dff=DateFormat.getDateInstance();
        System.out.println(DF.format(Hoje));
        
        System.out.println(dff.format(Hoje));
        
        


    }

}
