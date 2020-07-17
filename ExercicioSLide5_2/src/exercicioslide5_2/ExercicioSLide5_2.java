package exercicioslide5_2;

import java.util.Scanner;

public class ExercicioSLide5_2 {

    public static void main(String[] args) {
        
        String opcao;
        float base, altura;
        int lado;
        
        System.out.print("Digite qual Polígono você quer calcular: ");
        Scanner leitor = new Scanner(System.in);
        opcao = leitor.nextLine();
        
        if("quadrado".equals(opcao)){
            
            System.out.print("Digite o tamanho do Lado: ");
            lado = leitor.nextInt();
            
            Quadrado q1 = new Quadrado(4, lado);
            
            System.out.println("Área do quadrado: " + q1.calcularArea() + " cm²");
            
        }
        
        else if("triangulo".equals(opcao)){
            
            System.out.print("Digite a base: ");
            base = leitor.nextInt();
            
            System.out.print("Digite a altura: ");
            altura = leitor.nextInt();
            
            Triangulo t1 = new Triangulo(3, base, altura);
            System.out.println("Area do triangulo: " + t1.calcularArea() + " cm²");
            
        }
        
        else if("triangulo retangulo".equals(opcao)){
            
            System.out.print("Digite a base: ");
            base = leitor.nextInt();
            
            System.out.print("Digite a altura: ");
            altura = leitor.nextInt();
            
            TrianguloRetangulo tr1 = new TrianguloRetangulo(3, base, altura);
            tr1.setCatetos(base, altura);
            
            System.out.println("Hipotenusa do Triangulo Retangulo: " + tr1.calcularHipotenusa() + " cm");
            
        }
        
        else{
            
            System.out.println("Erro! Digite apenas uma das 3 opções abaixo:");
            System.out.println("'quadrado'\n'triangulo'\n'triangulo retangulo'");
            
        }
        
    }
    
}