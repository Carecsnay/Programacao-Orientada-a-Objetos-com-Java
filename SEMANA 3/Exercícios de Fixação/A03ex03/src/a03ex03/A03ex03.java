package a03ex03;

public class A03ex03 {

    public static void main(String[] args) {

        try {
            float div = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.printf("O resultado da divisão entre %s e %s é: %.2f \n", args[0], args[1], div);
        } 
                
        catch (ArithmeticException e1) {
            System.out.println("Divisão de inteiros por 0 não é permitido!");
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("É necessário passar pelo menos dois argumentos");
        }
        catch (Exception e) {
            /* Primeira excessão genérica (coloca no final)*/
            System.out.println("O programa só aceita valores do tipo inteiro!");
        }
    }
}
