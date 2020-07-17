package exerciciosite;

public class Endereco {
    
    private String rua, bairro, cidade, estado, complemento;
    private int cep;
    
    public Endereco(String cidade, String rua, String complemento, int cep){
        this.cidade = cidade;
        this.rua = rua;
        this.complemento = complemento;
        this.cep = cep;
    }
    
}
