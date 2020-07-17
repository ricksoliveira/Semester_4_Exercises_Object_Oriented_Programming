package contas.bancarias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorExtrato {
    
    public void imprimirExtrato(Conta c, String tpConta){
        SimpleDateFormat dtFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date agora = new Date();
        
        System.out.println(dtFormato.format(agora) + " Saldo: " + c.getSaldo());
    }
    
}
