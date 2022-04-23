package a03t03;
import javax.swing.JOptionPane;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

*/

public class A03t03 {
    
/*
    Crie uma cópia do programa anterior, que mostre uma mensagem 
    informando se a referida parede é alta, média ou baixa, considerando que o padrão é de 3m a 3,5m de altura.
*/
    
    public static void main(String[] args) {

        String Height = JOptionPane.showInputDialog("Agora digite a altura da parede!");
        float height = Float.parseFloat(Height);
        
        String Width = JOptionPane.showInputDialog("Digite a largura da parede!");
        float width = Float.parseFloat(Width);    
        
        float wallSize = (height);
        float bricksAmount = (height * width) * 20;
        
            JOptionPane.showMessageDialog(null, "Para construir uma parede de "+height+" M de altura e "+width+" M de largura , serão necessários: "+bricksAmount+" tijolos!", "Bruno Benicio de Andrade Lima", JOptionPane.INFORMATION_MESSAGE);
        
        if (wallSize < 3) {
            JOptionPane.showMessageDialog(null, "De acordo com as métricas estabelecidas, a parede é BAIXA!", "Classificação da Parede", JOptionPane.INFORMATION_MESSAGE);
        } 
        
        if (wallSize >= 3.0 & wallSize <= 3.5) {
            JOptionPane.showMessageDialog(null, "De acordo com as métricas estabelecidas, a parede é MÉDIA!", "Classificação da Parede", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (wallSize > 3.5) {
            JOptionPane.showMessageDialog(null, "De acordo com as métricas estabelecidas, a parede é ALTA!", "Classificação da Parede", JOptionPane.INFORMATION_MESSAGE);
        }        
    }
}