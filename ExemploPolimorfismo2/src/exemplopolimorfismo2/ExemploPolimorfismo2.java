package exemplopolimorfismo2;

import javax.swing.JOptionPane;

public class ExemploPolimorfismo2 {

    public static void main(String[] args) {
        
        Pessoa p1 = null;
        
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 4"));
        
        switch(tipo){
            
            case 1:
                p1 = new Pessoa();
                break;
                
            case 2:
                p1 = new PessoaJuridica();
                break;
                
            case 3:
                p1 = new PessoaFisica();
                break;
                
            case 4:
                p1 = new Funcionario();
                break;    
                
        }
        
        p1.mostraClasse();
        
    }
    
}
