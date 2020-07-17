package exercicioslide5_2;

public class Quadrado extends Poligono {
    
    private double tamanhoLado;
    private double area;

    public Quadrado(int numeroLados, int tamanhoLado) {
        super(numeroLados);
        this.tamanhoLado = tamanhoLado;
    }
    
    @Override
    public double calcularArea(){
        double area;
        
        area = Math.pow(tamanhoLado, 2);
        
        return area;
    }
    
}
