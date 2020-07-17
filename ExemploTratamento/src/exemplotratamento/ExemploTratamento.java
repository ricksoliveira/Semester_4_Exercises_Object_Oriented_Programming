package exemplotratamento;

import javax.swing.JOptionPane;

public class ExemploTratamento {
    
    public static void main(String[] args) {
        
        try{
            String aux1 = JOptionPane.showInputDialog("Digite um valor: ");
            double num1 = Integer.parseInt(aux1.toString());
            
            String aux2 = JOptionPane.showInputDialog("Digite outro valor: ");
            double num2 = Integer.parseInt(aux2.toString());
            
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 -  num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 *  num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 /  num2));
        }
        
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro de conversão! \n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Divisão por zero! \n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Operação cancelada antes de terminar. \n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        finally{
            JOptionPane.showMessageDialog(null, "Final da execução");
        }
        
    }
    
}
