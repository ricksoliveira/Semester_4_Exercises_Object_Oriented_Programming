package tratamentovariado;

public class Calculadora {
    
    private double num1, num2;
    
    // Constructor
    
    // Specific Methods
    
    public void mostrarMenu(){
        System.out.println("  [+] - Somar.");
        System.out.println("  [-] - Subtrair.");
        System.out.println("  [*] - Multiplicar.");
        System.out.println("  [/] - Dividir.");
        System.out.println("  [0] - Voltar.");
    }
    
    public double somar(){
        return num1 + num2;
    }
    
    public double subtrair(){
        return num1 - num2;
    }
    
    public double multiplicar(){
        return num1 * num2;
    }
    
    public double dividir(){
        return num1 / num2;
    }
    
    // Getters and Setters
    
    public void setNum1(double num1){
        this.num1 = num1;
    }
    
    public void setNum2(double num2){
        this.num2 = num2;
    }

    public double getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }
    
}
