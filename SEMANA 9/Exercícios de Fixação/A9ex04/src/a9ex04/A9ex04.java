//---------------------------------------
//Author: Eric Richard Ortolan Chrystovam
//---------------------------------------
package a9ex04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A9ex04 {
    
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/y HH:mm:ss");
        
        Date Hoje= new Date();
        
        System.out.println("Esse Programa foi executado as: " +formato.format(Hoje));
        


    }

}
