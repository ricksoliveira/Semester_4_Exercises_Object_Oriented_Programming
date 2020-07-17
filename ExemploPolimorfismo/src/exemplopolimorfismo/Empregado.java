package exemplopolimorfismo;

public class Empregado {
    
    private String nome;
    private double salario;
    
    public Empregado(String nome, double salario){
        this.nome = nome;
        this. salario = salario;        
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void aumentaSalario(double perc){
        double aumento = salario * (perc/100);
        salario += aumento;
    }
    
}
