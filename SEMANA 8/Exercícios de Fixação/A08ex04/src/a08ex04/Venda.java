package a08ex04;

/**
 *
 * @author BRUNO
 */
public class Venda implements BandoDeDados{

    @Override
    public void salvar() {
        System.out.println("Venda foi salva!");
    }

    @Override
    public void excluir() {
        System.out.println("Venda foi excluída!");
    }
    
}
