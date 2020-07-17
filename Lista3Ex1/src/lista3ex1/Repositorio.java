package lista3ex1;

public interface Repositorio {
    
    public void guarda(Pessoa nova);
    public Pessoa recupera(String CPF);
    public Pessoa primeiro();
    public Pessoa proximo();
    
}
