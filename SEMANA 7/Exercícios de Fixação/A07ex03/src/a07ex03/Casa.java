package a07ex03;

public class Casa {
    //private int banheiros;
    //definindo quantidades de banheiros padrão;
    private int banheiros = 1;
    //private String cor;
    //definindo cor padrão
    private String cor = "Verde"; 

    //construtor sem parâmetros
    public Casa() {
    }
    
    //construtor com parâmetros juntos
    public Casa(int banheiros, String cor) {
        this.banheiros = banheiros;
        this.cor = cor;    
    }
    
    //construtor banheiro
    public Casa(int banheiros) {
        this.banheiros = banheiros;
    }
    
    //construtor cor da casa
    public Casa(String cor) {
        this.cor = cor;
    }
    
    //getters & setters
    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
