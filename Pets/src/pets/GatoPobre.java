package pets;

public class GatoPobre extends Gato {

    
    // Constructor
    
    public GatoPobre(String nome){
        super(nome);
    }
    
    // Specific Methods
    
    @Override
    public void comer(){
        System.out.println("Comeu bife bem passado de ontem");
    }
    
    
}
