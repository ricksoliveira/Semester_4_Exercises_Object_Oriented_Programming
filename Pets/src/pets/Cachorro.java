package pets;

public class Cachorro extends Animal implements Vigilante {
    
    private String raca;
    
    public Cachorro(String n, String r){
        super(n);
        raca = r;
    }
    
    @Override
    public void comer(){
        System.out.println("Nhac!");
    }
    
    @Override
    public void vigiar(){
        System.out.println("Au Au Au!");
    }
    
}
