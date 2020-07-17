package prova1_exercicio3;

public class LivrosDisponiveis {
    
    private String nome[] = new String[7];
    private String autor[] = new String[7];
    
    // Constructor
    
    public LivrosDisponiveis(){
        
        nome[0] = "Dom Casmurro";
        nome[1] = "Memorias Posthumas de Braz Cubas";
        nome[2] = "Quincas Borba";
        nome[3] = "Os Filhos do Padre Anselmo";
        nome[4] = "Pérolas e Diamantes: Contos Infantis";
        nome[5] = "A Cidade e as Serras";
        nome[6] = "O Mandarim";
        
        autor[0] = "Machado de Assis";
        autor[1] = "Machado de Assis";
        autor[2] = "Machado de Assis";
        autor[3] = "António José da Costa Couto";
        autor[4] = "Jacob Grimm e Wilhelm Grimm";
        autor[5] = "Eça de Queirós";
        autor[6] = "Eça de Queirós";
        
    }
    
    // Specific Methods
    
    public void modificaLivro(int i){
        nome[i] += "  * ADQUIRIDO *";
    }
    
    // Getters and Setters
    
    public String getNome(int i){
        return nome[i];
    }
    
    public String getAutor(int i){
        return autor[i];
    }
    
}
