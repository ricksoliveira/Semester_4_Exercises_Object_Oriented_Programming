package prova2_exercicio5;

public class Arara extends Animal{

    public Arara(String nome){
        super(nome);
    }
    
    @Override
    public void andar(){
        System.out.println("Eu ando como uma arara que não está voando.");
    }
    
}
