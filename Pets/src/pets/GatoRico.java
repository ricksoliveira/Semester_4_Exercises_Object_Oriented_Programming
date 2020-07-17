package pets;

public class GatoRico extends Gato {

    
    // Constructor
    
    public GatoRico(String nome){
        super(nome);
    }
    
    // Specific Methods
    
    @Override
    public void comer(){
        System.out.println("Comeu filé mignon");
    }
    
}
