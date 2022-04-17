package a02t02;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class A02t02 {
/*
    
    2 - 
    Crie um programa que possua as variáveis: nome, nota1 e nota2. 
    O programa deve mostrar o nome e a média das notas (A02t02.jar);

*/   
    
    public static void main(String[] args) {
        String nomeUsuario = "BRUNO BENICIO DE ANDRADE LIMA";
        float nota1 = (float) 8.5;
        float nota2 = (float) 10.00;
        float mediaNotas = (nota1+nota2)/2;

        System.out.println("Meu nome é: "+nomeUsuario);
        System.out.println("Minhas notas foram: " +nota1+ " e " +nota2);
        System.out.println("A média de minhas notas é: "+mediaNotas);
    }      
}
