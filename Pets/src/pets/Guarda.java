package pets;

public class Guarda extends Pessoa implements Vigilante,Esportista {
    
    @Override
    public void saudar(){
        System.out.println("O guarda está dizendo olá");
    }
    
    @Override
    public void vigiar(){
        System.out.println("TEJE PRESO MELIANTE");
    }
    
    @Override
    public void atirar(){
        System.out.println("pew pew pew");
    }
    
}
