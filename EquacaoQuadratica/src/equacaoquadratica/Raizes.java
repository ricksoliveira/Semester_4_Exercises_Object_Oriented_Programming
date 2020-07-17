package equacaoquadratica;

public class Raizes extends Delta{

    public Raizes(double a, double b, double c) {
        super(a, b, c);
    }
    
    public double calculaRaiz1(double delta){
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    
    public double calculaRaiz2(double delta){
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    
}
