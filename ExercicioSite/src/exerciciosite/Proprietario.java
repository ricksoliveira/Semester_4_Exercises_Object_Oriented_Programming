package exerciciosite;

public class Proprietario {
    
    private String nome;
    private int nascimento, endereco, cpf, rg;
    
    public Proprietario(String nome, int cpf, int rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    public String getNome(){
        return nome;
    }

    public void setEndereco(int endereco){
        this.endereco = endereco;
    }

    public int getEndereco(){
        return endereco;
    }

    
}
