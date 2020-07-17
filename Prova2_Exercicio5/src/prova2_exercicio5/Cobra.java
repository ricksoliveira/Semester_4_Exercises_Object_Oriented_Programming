package prova2_exercicio5;

public class Cobra extends Animal{

    public Cobra(String nome){
        super(nome);
    }
    
    @Override
    public void andar(){
        System.out.println("Eu ando como uma cobra que na verdade não anda, rasteja.");
    }
    
}
