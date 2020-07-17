package exercicioslide5_2;

public abstract class Poligono {
    
    private int numeroLados;

    protected Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    public abstract double calcularArea();
    
}
