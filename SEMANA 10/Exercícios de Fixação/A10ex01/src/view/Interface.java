
package view;

import controller.ProdutoController;
import model.Produto;
/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */

public class Interface {

    public static void main(String[] args) {
        Produto p = new Produto ();
        p.setNome("Teclado");
        p.setPreco(10f);
        
        ProdutoController pc = new ProdutoController();
        if (pc.salvar(p))
            System.out.println("Produto cadastrado com sucesso.");
        else 
            System.out.println("Erro ao cadastrar o produto.");
           
    }
    
}
