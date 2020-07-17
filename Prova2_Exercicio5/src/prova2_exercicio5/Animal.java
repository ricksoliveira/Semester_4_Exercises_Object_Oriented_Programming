package prova2_exercicio5;

public class Animal{
    
    private String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public void andar(){
        System.out.println("Eu ando como um animal genérico.");
    }
    
    public String getNome(){
        return nome;
    }
    
    public class Ordena implements Comparable<Animal>{     // Classe interna para ordenação
        
        @Override
        public int compareTo(Animal anim){
            
            int comp = Animal.this.nome.compareTo(anim.getNome());
            
            if(comp < 0 ){
                return -1;
            }
            else if(comp > 0){
                return 1;
            }
            else{
                return 0;
            }
            
        }
        
    }
    
}
