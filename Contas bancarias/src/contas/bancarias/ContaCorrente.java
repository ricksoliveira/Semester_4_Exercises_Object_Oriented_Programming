package contas.bancarias;

public class ContaCorrente extends Conta {
    
    private double limite;
    
    @Override
    public double getSaldo(){
        return super.getSaldo() + limite;
    }
    
    public double getlimite(){
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
