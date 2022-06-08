package a08ex04;

/**
 *
 * @author BRUNO
 */
public class Produto implements BandoDeDados{

    @Override
    public void salvar() {
        System.out.println("Produto salvo!");
    }

    @Override
    public void excluir() {
        System.out.println("Produto excluído!");
    }
    
}
