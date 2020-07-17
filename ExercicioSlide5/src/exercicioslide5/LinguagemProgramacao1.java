package exercicioslide5;

import javax.swing.JOptionPane;

public class LinguagemProgramacao1 extends Disciplina implements Pratica {
    
    private String laboratorio;

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    public LinguagemProgramacao1(){
        
    }
    
    @Override
    public String obterLaboratorio(){
        return laboratorio;
    }
    
    @Override
    public float CalculaMedia(){
        String entrada;
        float nota1, nota2;
        
        entrada = JOptionPane.showInputDialog("Digite nota 1");
        nota1 = Float.parseFloat(entrada);
        
        entrada = JOptionPane.showInputDialog("Digite nota 2");
        nota2 = Float.parseFloat(entrada);
        
        return (nota1+nota2)/2;
    }
    
}