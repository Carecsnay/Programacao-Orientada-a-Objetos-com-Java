package a07ex01;

public class A07ex01 {

    public static void main(String[] args) {
        Computador pcMaria = new Computador();
        Computador pcJoaquim = new Computador();

        pcMaria.setMarca("CCE");
        pcMaria.setMemoria("6gb 1600mhz");
        pcMaria.setProcessador("i3-3210U");
        pcMaria.setMonitor("Stock");

        System.out.println("-----------------------------------");
        System.out.println("Specs do Pc da Maria");
        System.out.println("-----------------------------------");
        System.out.println("Marca: " + pcMaria.getMarca());
        System.out.println("Memória: " + pcMaria.getMemoria());
        System.out.println("Processador: " + pcMaria.getProcessador());
        System.out.println("Monitor: " + pcMaria.getMonitor());
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        pcJoaquim.setMarca("Acer");
        pcJoaquim.setMemoria("8gb 4000mhz");
        pcJoaquim.setProcessador("i5-9300H");
        pcJoaquim.setMonitor("Acer Full-HD IPS");
        
        System.out.println("-----------------------------------");
        System.out.println("Specs do Pc do Joaquim");
        System.out.println("-----------------------------------");
        System.out.println("Marca: " + pcJoaquim.getMarca());
        System.out.println("Memória: " + pcJoaquim.getMemoria());
        System.out.println("Processador: " + pcJoaquim.getProcessador());
        System.out.println("Monitor: " + pcJoaquim.getMonitor());
        System.out.println("-----------------------------------");
        
    }
}
