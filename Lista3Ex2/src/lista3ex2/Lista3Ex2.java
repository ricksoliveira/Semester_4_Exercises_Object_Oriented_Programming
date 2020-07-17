package lista3ex2;

public class Lista3Ex2 {

    public static void main(String[] args) {
        
        Alfa a1 = new Alfa(5);
        Beta b1 = new Beta(5);
        Pluviometro pA = new Pluviometro("A");
        Pluviometro pB = new Pluviometro("B");
        Pluviometro pC = new Pluviometro("C");
        
        for(int i=0; i<294; i++){
            a1.inserePluviometro(pC);
        }
        System.out.println("Lotacao atual: " + a1.getLotacao());
        a1.inserePluviometro(pC);
        
        System.out.println("\n\n");
        
        b1.inserePluviometro(pA);
        b1.inserePluviometro(pB);
        b1.inserePluviometro(pC);
        
        b1.imprimeVetor();
        
        b1.inserePluviometro(pB);
        
        b1.imprimeVetor();
        
    }
    
}
