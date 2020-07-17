package prova1_exercicio3;

public class Cliente {
    
    private LivrosDisponiveis paraCompra;
    private LivrosAdquiridos jaComprei;
    
    // Constructor
    
    public Cliente(LivrosDisponiveis paraCompra, LivrosAdquiridos jaComprei){
        this.jaComprei = jaComprei;
        this.paraCompra = paraCompra;
    }
    
    // Specific Methods
    
    public void verAdquiridos(){
        int i;
        
        System.out.println("###### LISTA DE LIVROS ADQUIRIDOS:\n");
        
        for(i=0; i<7; i++){
            System.out.println("Livro " + (i+1) + " - Nome: " + jaComprei.getNome(i));
            System.out.println("\t  Autor: " + jaComprei.getAutor(i) + "\n\n");
        }
        
    }
    
    public void verDisponiveis(){
        int i;
        
        System.out.println("###### CATÁLOGO DE LIVROS DISPONÍVEIS PARA A COMPRA:\n");
        
        for(i=0; i<7; i++){
            System.out.println("Livro " + (i+1) + " - Nome: " + paraCompra.getNome(i));
            System.out.println("\t  Autor: " + paraCompra.getAutor(i) + "\n\n");
        }
    }
    
    public void comprarLivro(int i){
        jaComprei.adicionaLivro(i-1, paraCompra);
        paraCompra.modificaLivro(i-1);
    }
    
    public String lerLivro(int i){
        return "Você acabou de ler o livro: " + jaComprei.getNome(i-1) +
               " por " + jaComprei.getAutor(i-1);
    }
    
    // Getters and Setters
    
}
