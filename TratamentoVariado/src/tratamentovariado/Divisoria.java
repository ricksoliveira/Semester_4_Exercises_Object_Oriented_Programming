package tratamentovariado;

public class Divisoria {
    
    public void barrasSimples(){
        for(int i=0; i<25; i++){
            System.out.print("─");
        }
        System.out.println("");
    }
    
    public void barrasDuplas(){
        for(int i=0; i<25; i++){
            System.out.print("═");
        }
        System.out.println("");
    }
    
    public void cls(){
        for(int i=0; i<45; i++){
            System.out.println("");
        }
    }
    
}
