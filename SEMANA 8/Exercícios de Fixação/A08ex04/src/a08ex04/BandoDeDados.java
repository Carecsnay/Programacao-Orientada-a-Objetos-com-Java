package a08ex04;

/**
 *
 * @author BRUNO
 */

/*
    A Interface é como se fosse uma espécie de discriminação de métodos a serem implementados por classes que a utilizem
nesse caso ao utilizar essa interface, a classe é OBRIGADA a implementar tanto o método salvar quanto o método excluir.
*/
public interface BandoDeDados {
    public void salvar();
    public void excluir();
     
}
