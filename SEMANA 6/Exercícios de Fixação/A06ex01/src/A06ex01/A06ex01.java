package A06ex01;

public class A06ex01 {
/*
* 
*   1. Crie um programa que contenha o método latir();
*   2. Adicione ao programa o método miar() e o método mugir()    
*
*/
    public static void main(String[] args) {
        latir();
        mugir();
        miar();
    }
    
    // criação do método (função) sem parâmetro (void), o escopo privado garante a segurança de alterações acidentais, sendo somente acessíveis através dos métodos.
    
    private static void latir () {
        System.out.println("Au");
    }
    private static void mugir () {
        System.out.println("Muuuu");
    }
    private static void miar () {
        System.out.println("Miau");
    }
}
