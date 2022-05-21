package a07t01;

public class Produto {

    private String nome;
    private String modelo;
    private Fabricante fabricante;

    public Produto() {
    }

    public Produto(String nome, String modelo, Fabricante fabricante) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    
}
