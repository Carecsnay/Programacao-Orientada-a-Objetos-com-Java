package a09t01;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class A09t01 {
    
    /*

    Crie um programa que, utilizando JOptionPane, solicite a data de início 
    e data de término do período de férias de um funcionário, mostrando uma 
    lista com o número do dia e a data para todo o período de férias do funcionário.

    */
    
    public static void main(String[] args) throws ParseException {
        // input de dados (data de inicio e fim)
        String SData_inicio = Painel.questao("Data de inicio de ferias");
        String SData_fim = Painel.questao("Data de fim de ferias");
        String Lista="";

        // formato de exibição da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        // passando a data inputada pelo usuário (string) para tipo Date
        Date Data_inicio = sdf.parse(SData_inicio);
        Date Data_fim = sdf.parse(SData_fim);
        
        //não entendi
        float dias = Data_fim.getTime() - Data_inicio.getTime();
        int Intdias = (int) (dias/1000/60/60/24);
        
        //instanciando o calendário
        Calendar calendario = Calendar.getInstance();
        
        //setando o calendário com o valor da variável Data_inicio
        calendario.setTime(Data_inicio);
        
        //loop para imprimir as listas
        for(int i = 1; i < Intdias+2; i++) {
          Lista = Lista+"\n" +i+ "º Dia - "+sdf.format(calendario.getTime());
          calendario.add(Calendar.DATE, 1);
        }
        //Exibição da lista
        JOptionPane.showMessageDialog(null,"Lista de dias de ferias\n" + Lista);    

    }

}