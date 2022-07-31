/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a9ex06;

//--------------------------------------------------------------
import javax.swing.JOptionPane;

//author: Eric Richard Ortolan Chrystovam
//--------------------------------------------------------------
public abstract class JOP_question {

    static String question(String Pergunta, String Comparador, String Erro) {
        String texto;
        while (true) {
            texto = JOptionPane.showInputDialog(Pergunta);
            if (texto.matches(Comparador)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, Erro);
            }
        }
        return texto;
    }

}
