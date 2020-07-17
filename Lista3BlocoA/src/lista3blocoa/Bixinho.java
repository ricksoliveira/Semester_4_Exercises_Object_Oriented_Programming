package lista3blocoa;

public class Bixinho implements Animal {
    
    private String nome;
    private String especie;

    public Bixinho(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }
    
    @Override
    public String getNomeEspecie(){
        return this.especie;
    }

    @Override
    public String getNomeAnimal(){
        return this.nome;
    }
    
    
}
