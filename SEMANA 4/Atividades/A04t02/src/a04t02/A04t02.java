package a04t02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A04t02 {

    /*
    
    Crie um programa que solicite a operação (soma, subtração, multiplicação, 
    divisão, resto da divisão, potência), e dois valores a calcular e retorne o resultado formatado com DecimalFormat;
    
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = (DecimalFormat)NumberFormat.getNumberInstance(Locale.getDefault());
        int contador = 1;

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Os valores digitados foram: " + num1 + " e " + num2 + "!");
        System.out.println("Selecione uma opção abaixo!");
        
        System.out.println("["+contador++ + "]" + " Soma");
        System.out.println("["+contador++ + "]" + " Subtração");
        System.out.println("["+contador++ + "]" + " Multiplicação");
        System.out.println("["+contador++ + "]" + " Divisão");
        System.out.println("["+contador++ + "]" + " Módulo");
        System.out.println("["+contador++ + "]" + " Potência");
        
        int opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("A soma entre os números " +num1+ " e " +num2+" é: "+ df.format(num1 + num2));
                break;
            case 2:
                System.out.println("A subtração entre os números " +num1+ " e " +num2+" é: "+ df.format(num1 - num2));
                break;
            case 3:
                System.out.println("A multiplicação entre os números " +num1+ " e " +num2+" é: "+ df.format(num1 * num2));
                break;
            case 4:
                System.out.println("A divisão entre os números " +num1+ " e " +num2+" é: "+ df.format(num1 / num2));
                break;
            case 5:
                System.out.println("O módulo entre os números " +num1+ " e " +num2+" é: "+ df.format(num1 % num2));
                break;
            case 6:
                System.out.println(num1+ " elevado a " +num2+" é: "+ df.format(Math.pow(num1,num2)));
                break;
        }
    }
}