package pets;

public abstract class Animal {
    
    private String nome;
    
    // Constructor
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    // Specific Methods
    
    public abstract void comer();
    
    // Getters and Setters

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
}
