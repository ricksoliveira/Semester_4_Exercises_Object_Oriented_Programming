package lista3ex3;

public class Beta extends Caminhao {
    
    private String carregando[] = new String[100];
    private int capacidade;
    
    public Beta(int quant){
        super(quant);
    }

    @Override
    public void inserePluviometro(Pluviometro p){
        
        for(int j=0; j<100; j++){
            if(carregando[j] == p.getTipo()){
                System.out.println("O caminhao já está levando este tipo de Pluviometro.");
                return;
            }
        }
        
        for(int i=0; i<100; i++){
            if(carregando[i] == null){
                carregando[i] = p.getTipo();
                return;
            }
        }
        
    }
    
    public void imprimeVetor(){
        
        for (int i=0; i<100; i++){
            if(carregando[i] != null){
                System.out.println(i+1 + " - " + carregando[i]);
            }
        }
        
    }
    
}
