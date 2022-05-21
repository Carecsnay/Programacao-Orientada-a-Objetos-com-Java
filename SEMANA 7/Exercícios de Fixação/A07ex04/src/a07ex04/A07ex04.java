package a07ex04;

public class A07ex04 {
/* Crie as classes Estado (nome, sigla), Cidade (nome, Estado) e instancie os objetos sp, mg, rj
e rs. Instancie também os objetos barretos e frutal. Mostre, a partir do objeto barretos, o seu
nome e a sigla do seu estado. Os construtores vazio e completo devem ser adicionados nas classes.*/
    
    public static void main(String[] args) {
       Estado sp = new Estado("São Paulo", "SP");
       Estado mg = new Estado("Minas Gerais", "MG");
       Estado rj = new Estado("Rio de Janeiro", "RJ");
       Estado rs = new Estado("Rio Grande do Sul", "RS");
       
       Cidade barretos = new Cidade("Barretos", sp);
       Cidade frutal = new Cidade("Frutal", mg);
       Cidade angraDosReis = new Cidade("Angra dos Reis", rj);
       Cidade portoAlegre = new Cidade ("Porto Alegre", rs);
       
        System.out.println(barretos.getNome()+"-"+(barretos.getEstado().getSigla()));
        System.out.println(frutal.getNome()+"-"+(frutal.getEstado().getSigla()));
        System.out.println(angraDosReis.getNome()+"-"+(angraDosReis.getEstado().getSigla()));
        System.out.println(portoAlegre.getNome()+"-"+(portoAlegre.getEstado().getSigla()));
       
    }
    
}
