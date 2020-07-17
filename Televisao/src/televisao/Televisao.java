package televisao;

public class Televisao {

    public static void main(String[] args) {
        
        // Essa classe é um exemplo de sobrecarga no construtor (3 construtores)
        
        TV tv1 = new TV();
        TV tv2 = new TV(600);
        TV tv3 = new TV(555, 18);
        
        tv1.aumentaVolume();
        
        tv1.mostrar();
        tv2.mostrar();
        tv3.mostrar();
        
    }
    
}
