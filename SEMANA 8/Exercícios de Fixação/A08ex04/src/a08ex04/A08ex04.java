package a08ex04;

/**
 *
 * @author BRUNO
 */
public class A08ex04 {

    public static void main(String[] args) {
        Produto p = new Produto();
        p.salvar();
        p.excluir();
        
        Venda v = new Venda();
        v.salvar();
        v.excluir();
    }
    
}
