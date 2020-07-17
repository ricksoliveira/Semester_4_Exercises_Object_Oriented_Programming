package prova2_exercicio5;

public class Urso extends Animal{

    public Urso(String nome){
        super(nome);
    }
    
    @Override
    public void andar(){
        System.out.println("Eu ando como um urso na floresta.");
    }
    
}
