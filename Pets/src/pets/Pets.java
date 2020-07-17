package pets;

public class Pets {

    public static void main(String[] args) {
        
        // Essa classe é um exemplo de sobrescrita de métodos (2 comer() diferentes)
        
        GatoPobre gp1 = new GatoPobre("Miseravel");
        GatoRico gr1 = new GatoRico("Riquinho");
        Gato g1 = new Gato("Normal");
        
        gp1.comer();
        gr1.comer();
        
        Cachorro c1 = new Cachorro("Dogo", "Maltes");
        
        c1.comer();
        c1.vigiar();
        
        Guarda gua1 = new Guarda();
        
        gua1.saudar();
        gua1.vigiar();
        gua1.atirar();
        
    }
    
}
