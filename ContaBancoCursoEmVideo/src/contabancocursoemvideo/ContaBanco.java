package contabancocursoemvideo;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    protected double saldo;
    private boolean status;
    
    // Constructor
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }
    
    // Specific Methods
    
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        
        if("cc".equals(tipo)){
            setSaldo(50);
        }
        else if("cp".equals(tipo)){
            setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Erro, retire todo o dinheiro para fechar a conta.");
        }
        
        else if(saldo < 0){
            System.out.println("Erro, a conta está em débito.");
        }
        
        else{
            setStatus(false);
            System.out.println("Conta Fechada com sucesso.");
        }
    }
    
    public void depositar(int deposito){
        if(getStatus()){
            setSaldo(getSaldo() + deposito);
        }
        
        else{
            System.out.println("Erro, a conta está fechada.");
        }
    }
    
    public void sacar(int saque){
        if(getStatus()){
            if(saldo < saque){
                System.out.println("Erro, saldo insuficiente. Digite uma quantia menor do que seu saldo.");
            }
            
            else{
                setSaldo(getSaldo() - saque);
            }
        }
        
        else{
            System.out.println("Erro, a conta está fechada.");
        }
    }
    
    public void pagarMensal(){
        if(getStatus()){
            if("cc".equals(tipo)){
                setSaldo(getSaldo() - 12);
            }
            
            else if("cp".equals(tipo)){
                setSaldo(getSaldo() - 20);
            }
        }
        
        else{
            System.out.println("Erro, impossível realizar cobrança mensal.");
        }
    }
    
    // Getters and Setters

    public int getNumConta(){
        return numConta;
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
}
