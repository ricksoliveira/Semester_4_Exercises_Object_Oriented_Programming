package prova1_exercicio3;

public class LivrosAdquiridos {
    
    private int quant;
    private String nome[] = new String[7];
    private String autor[] = new String[7];
    
    // Constructor
    
    public LivrosAdquiridos(){
        this.quant = 0;
    }
    
    // Specific Methods
    
    public void adicionaLivro(int i, LivrosDisponiveis paraCompra){
        
        if(quant == 0){
            nome[0] = paraCompra.getNome(i);
            autor[0] = paraCompra.getAutor(i);
            quant++;
        }
        
        else{
            for(int j=quant; j<7; j++){
                if(nome[j] == null){
                    nome[j] = paraCompra.getNome(i);
                    autor[j] = paraCompra.getAutor(i);
                    quant++;
                    break;
                }
            }
        }
        
    }
    
    // Getters and Setters
    
    public String getNome(int i){
        if(nome[i] == null){
            return "--- Espaço Disponível ---";
        }
        return nome[i];
    }
    
    public String getAutor(int i){
        if(autor[i] == null){
            return " ";
        }
        return autor[i];
    }
    
}
