package testeporta;

public class Porta {
    
    boolean aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;
    
    public void abre(){
        aberta = true;
    }
    
    public void fecha(){
        aberta = false;
    }
    
    public void pinta(String cor){
        this.cor = cor;
    }
    
    public boolean estaAberta(){
        return aberta;
    }
    
    public String descricao(){
        String descritas = "aberta: " + this.aberta;
        
        descritas += "\n Cor: " + this.cor;
        descritas += "\n Dimensao X: " + this.dimensaoX;
        descritas += "\n Dimensao Y: " + this.dimensaoY;
        descritas += "\n Dimensao Z: " + this.dimensaoZ;
        
        return descritas;
    }
    
}
