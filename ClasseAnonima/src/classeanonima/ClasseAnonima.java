package classeanonima;

public class ClasseAnonima {

    public static void main(String[] args) {
        
        Animal  a1 = new Animal();
        System.out.println("Animal 1 está " + a1.andar());
        
        Animal a2 = new Animal(){
            public String andar(){
                return "ANDANDO RÁPIDO";
            }
        };
        
        System.out.println("Animal 2 está " + a2.andar());
        
    }
    
}
