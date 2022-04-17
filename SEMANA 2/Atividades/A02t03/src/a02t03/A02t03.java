package a02t03;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A02t03 {
/*
    
    3 - Crie um programa que receba como argumento dois valores (utilize o vetor args[]) 
    e mostre o resto da divisão, produto, média e potência entre esses valores (A02t03.jar);
    
*/   
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]);
        
        int modulo = num1%num2;
        int produto = num1*num2;
        int media = (num1*num2)/2;
        int potencia = (int) Math.pow(num1, num2);
        
        System.out.println("----------------------------------");
        System.out.println("O resto da divisão seria: " +modulo);
        System.out.println("Fórmula: num1 % num2");
        System.out.println("");
        
        System.out.println("O produto seria: "+produto);
        System.out.println("Fórmula: num1 * num2");
        System.out.println("");
        
        System.out.println("A média seria: " +media);
        System.out.println("Fórmula: (num1 * num2) / 2");
        System.out.println("");
        
        System.out.println("A potência seria: "+potencia);
        System.out.println("Fórmula: Math.pow(num1, num2)" );
        System.out.println("----------------------------------");
    }
}