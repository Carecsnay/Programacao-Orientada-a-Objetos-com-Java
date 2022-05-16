package a06ex02;

public class A06ex02 {

/*
* 
*   1. Crie um programa que utilize o método latir com o parâmetro booleano;
*   2. Altere o programa para utilizar o método latir com dois parâmetros.
*
*/
    
    public static void main(String[] args) {
        // Declaração de Constante (algo que não tem variações, valores fixos que você utilizará em seu programa)
        
        final boolean MUITO = true;
        latir(MUITO);
        for (int i = 0; i < 10; i++) {
            latir(false);            
        }
    }
    
        // Métodos com parâmetros são obrigados serem informados os valores quando chamados.
    private static void latir(boolean MUITO) {
        if (MUITO) {
            System.out.println("Au Au Au");
        }
        
        else {
            System.out.println("Au");   
        }
    }
}
