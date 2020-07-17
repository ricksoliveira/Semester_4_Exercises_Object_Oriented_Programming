package equacaoquadratica;

import java.util.Scanner;

public class EquacaoQuadratica {

    public static void main(String[] args) {
        
        double a, b, c;
        
        Scanner leitor = new Scanner(System.in);
        ExistenciaA exis1 = new ExistenciaA();
        
        System.out.print("Digite a: ");
        a = leitor.nextDouble();
        
        System.out.print("Digite b: ");
        b = leitor.nextDouble();
        
        System.out.print("Digite c: ");
        c = leitor.nextDouble();
        
        if(exis1.nulo(a)){
            
            Delta d1 = new Delta(a, b, c);
            Raizes r1 = new Raizes(a, b, c);
            
            System.out.println("Delta: " + d1.calculaDelta());
            System.out.println("Raiz 1: " + r1.calculaRaiz1(d1.calculaDelta()));
            System.out.println("Raiz 2: " + r1.calculaRaiz2(d1.calculaDelta()));
            
        }
        else{
            System.out.println("ERRO NAO TEM COMO FIM");
        }
        
    }
    
}
