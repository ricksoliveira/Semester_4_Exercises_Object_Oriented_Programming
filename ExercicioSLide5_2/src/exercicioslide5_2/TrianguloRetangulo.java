package exercicioslide5_2;

public class TrianguloRetangulo extends Triangulo implements Retangulo {
    
    private double catetoAdj;
    private double catetoOpo;
    
    public TrianguloRetangulo(int numeroLados, double base, double altura){
        super(numeroLados, base, altura);
    }
    
    public void setCatetos(double catetoAdj, double catetoOpo){
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;
    }
    
    public double calcularHipotenusa(){
        double hipotenusa;
        
        hipotenusa = Math.sqrt(Math.pow(catetoAdj, 2) + Math.pow(catetoOpo, 2));
        
        return hipotenusa;
    }
}
