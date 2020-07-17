package lista1ex6;

public class VetorOrdenado {
    
    private int tamanho = 0;
    private final int inicial;
    private String[] vetor;
    
    // Constructor
    
    public VetorOrdenado(int tamInicial){
        this.inicial = tamInicial;
        this.vetor = new String[tamInicial];
    }
    
    // Specific Methods
    
    public void insert(String frase){
        
        if(getTamanho() < getInicial()){
        
            for(int i=0; i<this.inicial; i++){
                if(this.vetor[i] == null){
                    this.vetor[i] = frase;
                    vetor[i] = vetor[i].toLowerCase();
                    setTamanho(tamanho+1);
                    
                    if(getTamanho() == 1){
                        break;
                    }
                    
                    else{
                        organiza();
                        break;
                    }
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
    
    private void organiza(){
        
        String aux;
        
        for(int i=0; i<this.tamanho; i++){
            for(int j=1; j<this.tamanho; j++){
                if(this.vetor[i].compareTo(this.vetor[j]) != 1 && this.tamanho != this.inicial){
                    aux = this.vetor[i];
                    this.vetor[i] = this.vetor[j];
                    this.vetor[j] = aux;
                }
            }
        }
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
