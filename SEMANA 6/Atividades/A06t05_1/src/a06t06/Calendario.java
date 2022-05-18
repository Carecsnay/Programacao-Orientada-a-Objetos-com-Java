package a06t06;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Calendario {
    protected static String diaSemana(int codigoInserido) {
        List<String> dias = new ArrayList<>();
        dias.add("Domingo");
        dias.add("Segunda-Feira");
        dias.add("Terça-Feira");
        dias.add("Quarta-Feira");
        dias.add("Quinta-Feira");
        dias.add("Sexta-Feira");
        dias.add("Sábado");

        switch (codigoInserido) {
            case 1:
                return dias.get(0);
            case 2:
                return dias.get(1);
            case 3:
                return dias.get(2);
            case 4:
                return dias.get(3);
            case 5:
                return dias.get(4);
            case 6:
                return dias.get(5);
            case 7:
                return dias.get(6);
            default:
                System.out.println("Opção inválida!");
        }
        return diaSemana(codigoInserido);
    }
    
    protected static String imprimir(String diaSemanaPrompt, int numeroSemana) {
        System.out.println("O dia escolhido foi: "+diaSemana(numeroSemana));
        return diaSemana(numeroSemana);
    }
    
    protected static String imprimir(String diaSemanaInterfaceGrafica) {
        JOptionPane.showMessageDialog(null, "O dia escolhido foi: "+diaSemanaInterfaceGrafica, "Interface Gráfica", 2);
        return diaSemanaInterfaceGrafica;
    }    
}
