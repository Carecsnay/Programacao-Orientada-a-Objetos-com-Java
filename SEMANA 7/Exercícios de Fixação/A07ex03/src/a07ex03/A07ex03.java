package a07ex03;

public class A07ex03 {

    public static void main(String[] args) {
        Casa house1 = new Casa(2, "Branca"); //utilizando os construtores
        Casa house2 = new Casa("Azul"); //utilizando somente 1 dos construtores
        Casa house3 = new Casa(3); //utilizando somente 1 dos construtores
        
        System.out.println("Casa 1: "+house1.getBanheiros()+" banheiros e na cor: "+house1.getCor());
        System.out.println("Casa 2: "+house2.getBanheiros()+" banheiros e na cor: "+house2.getCor());
        System.out.println("Casa 3: "+house3.getBanheiros()+" banheiros e na cor: "+house3.getCor());
    }
    
}
