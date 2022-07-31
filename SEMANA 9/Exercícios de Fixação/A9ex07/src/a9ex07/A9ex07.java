//---------------------------------------
//Author: Eric Richard Ortolan Chrystovam
//---------------------------------------
package a9ex07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class A9ex07 {
    
    public static void main(String[] args) throws ParseException {
        String SData_validade = JOP_question.question("digite a data de validade do produto", "\\d{1,2}/\\d{1,2}/\\d{4}", "Data invalida");
       
        
        SimpleDateFormat Fpadrao = new SimpleDateFormat("dd/MM/yyyy");
        
        Date hoje=new Date();
        Date Data_validade = Fpadrao.parse(SData_validade);
        
        long dias_mili=Data_validade.getTime()-hoje.getTime();
        
        System.out.println("Faltam "+dias_mili/1000/60/60/24 +" dias para o prazo de validade acabar");
        
        
  
    }

}
