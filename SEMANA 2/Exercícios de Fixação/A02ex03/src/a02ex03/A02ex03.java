package a02ex03;

public class A02ex03 {
/*
  A02ex06
● Vamos criar um programa que receba dois
inteiros como argumento:
– O resultado deve ser a soma dos dois argumentos.

*/
    
    public static void main(String[] args) {
        
        int valorSoma = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
                
        System.out.println("A soma dos dois números é: "+valorSoma);
    }
}
