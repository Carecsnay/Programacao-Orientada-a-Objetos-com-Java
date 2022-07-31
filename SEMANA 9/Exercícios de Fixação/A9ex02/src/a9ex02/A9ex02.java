//---------------------------------------
//Author: Eric Richard Ortolan Chrystovam
//---------------------------------------
package a9ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class A9ex02 {

    public static void main(String[] args) {
        String data1 = "12 de jan. de 2007";
        String data2 = "10 de nov. de 2010";
        String data3 = "10 de ago. de 2019";

        DateFormat PtBr = DateFormat.getDateInstance();
        try {

            Date data1_ = PtBr.parse(data1);
            System.out.println(PtBr.format(data1_));
            
            Date data2_ = PtBr.parse(data2);
            System.out.println(PtBr.format(data2_));
            
            Date data3_ = PtBr.parse(data3);
            System.out.println(PtBr.format(data3_));

        } catch (ParseException e1) {
            System.out.println("erro");
        }
    }

}
