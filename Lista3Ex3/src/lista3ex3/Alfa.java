package lista3ex3;

public class Alfa extends Caminhao {
    
    private final int capacidadeMax = 5000;
    private int lotacao = 0;
    
    public Alfa(int quant){
        super(quant);
    }
    
    @Override
    public void inserePluviometro(Pluviometro p){
        
        if(lotacao == 5000 || lotacao + p.getPeso() > 5000){
            System.out.println("Erro, o caminhão ja está lotado");
        }
        else{
             lotacao += p.getPeso();
        }
        
    }
    
    public int getLotacao(){
        return lotacao;
    }
    
}
