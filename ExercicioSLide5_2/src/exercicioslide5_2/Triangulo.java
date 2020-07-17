package exercicioslide5_2;

public class Triangulo extends Poligono {
    
    private double base;
    private double altura;

    public Triangulo(int numeroLados, double base, double altura) {
        super(numeroLados);
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularAltura(){
        double altura = 0;
        
        // diagrama errado eu acho
        
        return altura;
    }
    
    @Override
    public double calcularArea(){
        double area;
        
        area = (base * altura)/2;
        
        return area;
    }
    
}
