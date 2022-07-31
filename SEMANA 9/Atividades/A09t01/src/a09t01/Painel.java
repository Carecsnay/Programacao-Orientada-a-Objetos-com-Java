package a09t01;

import javax.swing.JOptionPane;

public abstract class Painel {

    static String questao (String Resposta) {
        
        String texto;
        
            texto = JOptionPane.showInputDialog(Resposta);
            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null,"Campo deve ser preenchido!");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Data Armazenada!");
            }
        
        return texto;
    }

}