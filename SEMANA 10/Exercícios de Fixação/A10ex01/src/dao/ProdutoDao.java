
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author BRUNO
 */
public class ProdutoDao {
    
    public boolean salvar (Produto produto) {
        return true;
    }
    
    public boolean excluir (int id) {
        return true;
    }
    
    public Produto alterar (Produto produto) {
        return produto;
    }
    
    public List<Produto> buscar (String filtro) {
        return new ArrayList<Produto>();
    }
}
