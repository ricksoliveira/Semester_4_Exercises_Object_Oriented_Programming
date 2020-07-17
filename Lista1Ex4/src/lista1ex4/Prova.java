package lista1ex4;

public class Prova {
    
    private int q = 0;
    private int resposta[] = new int[15];
    private Gabarito gabarito;
    
    // Constructor
    
    public Prova(Gabarito gabarito){
        this.gabarito = gabarito;
    }
    
    // Specific Methods
    
    public void respostaAluno(char resp){
        
        if(q == 15){
            System.out.println("Erro, esse aluno já respondeu as 15 questões.");
            return;
        }
        
        resposta[q] = resp;
        setQ(q+1);
    }
    
    public int acertos(){
        
        int cont = 0;
        
        for(int i=0; i<15; i++){
            if(gabarito.respostaQuestao(i+1) == resposta[i]){
                cont++;
            }
        }
        return cont;
    }
    
    public double nota(){
        
        double nota = 0;
        
        for(int i=0; i<10; i++){
            if(gabarito.respostaQuestao(i+1) == resposta[i]){
                nota += 0.5;
            }
        }
        
        for(int i=10; i<15; i++){
            if(gabarito.respostaQuestao(i+1) == resposta[i]){
                nota += 1;
            }
        }
        
        return nota;
        
    }
    
    public double maior(Prova p){
                
        if(p.acertos() > this.acertos()){
            return p.acertos();
        }
        
        else if(p.acertos() < this.acertos()){
            return this.acertos();
        }
        
        else{
            
            if(p.nota() > this.nota()){
                return p.nota();
            }
        
            else if(p.nota() < this.nota()){
                return this.nota();
            }
            
            else{
                return this.nota();
            }
        }
    }
    
    // Getters and Setters
    
    public void setQ(int q){
        this.q = q;
    }
    
}
