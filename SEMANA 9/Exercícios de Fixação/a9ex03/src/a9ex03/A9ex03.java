//---------------------------------------
//Author: Eric Richard Ortolan Chrystovam
//---------------------------------------
package a9ex03;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class A9ex03 {
    
    public static void main(String[] args) {
        DateFormat PtBr = DateFormat.getDateInstance();
        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
          
        System.out.println("Hoje : "+PtBr.format(c.getTime()));
        
        c.add(Calendar.DATE,1);
        System.out.println("Amanha : "+PtBr.format(c.getTime()));
     


    }

}
