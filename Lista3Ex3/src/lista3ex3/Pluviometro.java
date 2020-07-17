package lista3ex3;

public class Pluviometro {
    
    protected String tipo;
    
    // Constructor
    
    public Pluviometro(String tipo){
        this.tipo = tipo;
    }
    
    // Specific Methods
    
    // Getters and Setters
    
    public String getTipo(){
        return tipo;
    }
    
    public double getPeso(){
        
        switch(this.tipo){
            
            case "A":
                return 1;
            
            case "B":
                return 5;
                
            case "C":
                return 17;
                
            default:
                System.out.println("ERRO! Tipo inválido.");
                return -1;
        }
    }
    
    public double getCapacidade(){
        
        switch(this.tipo){
            
            case "A":
                return 250;
            
            case "B":
                return 600;
                
            case "C":
                return 4000;
                
            default:
                System.out.println("ERRO! Tipo inválido.");
                return -1;
        }
    }
    
}
