package contas.bancarias;

public class ContasBancarias {

    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        cc.setSaldo(500);
        cc.setLimite(360);
        
        cp.setSaldo(4500);
        cp.setRendimento(0.007);
        
        GeradorExtrato ge = new GeradorExtrato();
        
        ge.imprimirExtrato(cc, "cc");
        ge.imprimirExtrato(cp, "cp");

    }
    
}
