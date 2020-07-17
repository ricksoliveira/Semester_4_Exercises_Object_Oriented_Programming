package lista1ex5;

public class Vetor {
    
    private int tamanho = 0;
    private final int inicial;
    private String[] vetor;
    
    // Constructor
    
    public Vetor(int tamInicial){
        this.inicial = tamInicial;
        this.vetor = new String[tamInicial];
    }
    
    // Specific Methods
    
    public void insert(String frase){
        
        if(getTamanho() < getInicial()){
        
            for(int i=0; i<this.inicial; i++){
                if(this.vetor[i] == null){
                    this.vetor[i] = frase;
                    setTamanho(tamanho+1);
                    break;
                }
            }
        }
        
        else{
            String[] vetorNovo = new String[getTamanho()+1];
        
            for(int i=0; i<this.tamanho; i++){
                vetorNovo[i] = this.vetor[i];
            }
            
            vetorNovo[this.tamanho] = frase;
            this.vetor = vetorNovo;
            setTamanho(tamanho+1);
        }
    }
    
    public String get(int posicao){
        return this.vetor[posicao];
    }
    
    // Getters and Setters
    
    public int getTamanho(){    // esse seria o método size();
        return tamanho;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public int getInicial(){
        return inicial;
    }
    
}
