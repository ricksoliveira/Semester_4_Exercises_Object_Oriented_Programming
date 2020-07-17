package conchamágica;

import java.util.Random;

public class Bola8 {
    
    private String v[] = new String[8];
    
    public Bola8(){
        v[0] = "Algum dia.";
        v[1] = "Sim!";
        v[2] = "Não";
        v[3] = "Creio que não.";
        v[4] = "Pergunte outra vez.";
        v[5] = "Melhor nem te responder.";
        v[6] = "Pergunte só outro dia.";
        v[7] = "Segundo a consulta aos astros realizada pelo grande Astrólogo Olavo de Carvalho, não.";
    }
    
    public String perguntar(){
        Random n = new Random();
        return v[n.nextInt(8)];
    }
    
    
}
