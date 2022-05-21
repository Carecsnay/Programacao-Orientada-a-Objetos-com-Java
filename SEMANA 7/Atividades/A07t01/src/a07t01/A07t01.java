package a07t01;

public class A07t01 {

    /*    Crie as classes Fabricante (nome), Produto(nome, modelo e Fabricante) e instancie os objetos logitech, dell e samsung. Instancie também os objetos hd, mouse e teclado. Mostre, a partir do objeto hd, o seu nome, modelo e a nome do seu fabricante. Os construtores vazio e completo devem ser adicionados nas classes.*/
    
    public static void main(String[] args) {
        Fabricante logitech = new Fabricante("Logitech");
        Fabricante dell = new Fabricante("Dell");
        Fabricante samsung = new Fabricante("Samsung");
        
        //Produto HD Samsung
        Produto HD = new Produto("SSD 870 EVO", "MZ-77E500", samsung);
        System.out.println("Armazenamento: "+HD.getNome());
        System.out.println("Modelo: "+HD.getModelo());
        System.out.println("Fabricante: "+HD.getFabricante().getNome());
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("");
        
        //Bonus
        //Produto Camera Logitech
        Produto camera = new Produto("Webcam Full HD Logitech", "C920s", logitech);
        System.out.println("Armazenamento: "+camera.getNome());
        System.out.println("Modelo: "+camera.getModelo());
        System.out.println("Fabricante: "+camera.getFabricante().getNome());
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("");
        
        //Bonus
        //Produto Notebook Dell
        Produto notebook = new Produto("Dell Inspiron", "i135378B20C", dell);
        System.out.println("Armazenamento: "+notebook.getNome());
        System.out.println("Modelo: "+notebook.getModelo());
        System.out.println("Fabricante: "+notebook.getFabricante().getNome());
       
    }
}
