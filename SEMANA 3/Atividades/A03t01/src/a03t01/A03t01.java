package a03t01;

import java.util.Scanner; //Importando Scanner

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

*/

public class A03t01 {
    
//Crie um programa que calcule a quantidade necessária de tijolos a partir da largura e altura de uma parede informada, 
//sabendo que são necessários 20 tijolos para construir cada metro quadrado de parede (utilize a classe Scanner);
    
    public static void main(String[] args) {
    //Instanciando o Scanner
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Digite a largura da parede!");
        float width = scan.nextFloat();
        
        System.out.println("Agora digite a altura da parede!");
        float height = scan.nextFloat();
        
        float calc = (height * width) * 20;
        
        System.out.println("Para construir uma parede de "+height+" M de altura e "+width+" M de largura, serão necessários: "+calc+" tijolos!");
        
    }
    
}