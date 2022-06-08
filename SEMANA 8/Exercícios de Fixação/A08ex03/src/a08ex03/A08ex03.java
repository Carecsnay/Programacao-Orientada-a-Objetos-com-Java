package a08ex03;

/**
 *
 * @author BRUNO
 */
public class A08ex03 {

    /*
    ● Copie as classes Movel e Mesa para o projeto atual; ok
    ● Transforme a classe Movel para abstrata; ok
    ● Tente instanciar um objeto movel1 da classe Movel (deve
    dar erro); ok
    ● Instancie o objeto mesa1 da classe Mesa (deve
    funcionar).
     */
    public static void main(String[] args) {
        // Movel movel1 = new Movel(); (não consigo instanciar por ela ser abstrata).
        Movel movel1 = new Mesa();
        movel1.meuNome();

    }

}
