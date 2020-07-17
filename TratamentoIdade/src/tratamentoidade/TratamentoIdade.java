package tratamentoidade;

import javax.swing.JOptionPane;

public class TratamentoIdade {

    public static void main(String[] args) {
        
        try{
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            
            if(idade > 60){
                throw new Exception("Fique em casa PELO AMOR DE DEUS!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Melhor ficar em casa também");
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
