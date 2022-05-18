package a06ex06;

import java.util.Arrays;

public class A06ex06 {
/*
* 
*  Crie um programa que receba como parâmetro um array de nomes de times e retorne o mesmo array ordenado e com os nomes em letras maiúsculas.    
*
*
*/
      public static void main(String[] args) {
          // Inserção dos times
        String [] times = new String []{"Palmeiras", "São Paulo", "Corinthias", "Santos"  };
          System.out.println("Antes da Conversão");
          // array antes da conversão
        for (int i = 0; i < times.length; i++) {
              System.out.println("["+ i +"]" + times[i]); 
            }
        // array depois da conversão
          System.out.println("\nDepois da Conversão");
        for (int ii = 0; ii < times.length; ii++) {
              System.out.println("["+ ii +"]" + converter(times)[ii]); 
          }
        }
      
        // método para conversão, como a a função é privada não tem problema usar o "i" novamente, pois está acessível somente dentro do método, aqui o nome do array deve ser diferente, no caso foi colocado como dados.
      private static String[] converter(String[] dados) {
          for (int i = 0; i < dados.length; i++) {
              dados[i] = dados[i].toUpperCase();
          }
          // organizando arrays em ordem alfabética
          Arrays.sort(dados);
          // retornando os dados organizados
          return dados;
      }
    
}
