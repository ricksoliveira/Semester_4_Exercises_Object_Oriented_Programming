package exemplopolimorfismo;

public class Gerente extends Empregado{
    
    private double bonus;
    
    public Gerente(String nome, double salario){
        super(nome, salario);
        bonus = 0;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario() + bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
}
