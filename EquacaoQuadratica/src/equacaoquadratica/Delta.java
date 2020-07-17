package equacaoquadratica;

public class Delta extends Equacao {
    
    public double delta;
    
    public Delta(double a, double b, double c) {
        super(a, b, c);
    }
    
    public double calculaDelta(){
        return (b * b) - (4 * a * c);
    }
    
}
