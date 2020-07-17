/*

    Nome: Henrique Servidoni de Oliveira
    RA: 2760481821017

    Programa de identificação de tipo de triângulo

*/

package ex4.teste.es3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4TesteES3 {

    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        int a[] = new int[3];
        int cont = 1;
        boolean erro;
        
        System.out.println("Calcular o tipo de um triângulo\n");
        System.out.println("Digite o valor dos 3 ângulos\n");
        
        do{
            do{
                erro = false;
                try{
                    do{
                        System.out.println("Angulo 1: ");
                        a[0] = leitor.nextInt();
                        if(a[0] < 1 || a[0] > 178){
                            System.out.println("\nVocê digitou um ângulo inválido.");
                            System.out.println("Digite um valor maior que 0 e menor que 179.\n");
                        }
                    }while(a[0] < 1 || a[0] > 178);
                    
                    do{
                        System.out.println("Angulo 2: ");
                        a[1] = leitor.nextInt();
                        if(a[1] < 1 || a[1] > 178){
                            System.out.println("\nVocê digitou um ângulo inválido.");
                            System.out.println("Digite um valor maior que 0 e menor que 179.\n");
                        }
                    }while(a[1] < 1 || a[1] > 178);
                    
                    do{
                        System.out.println("Angulo 3: ");
                        a[2] = leitor.nextInt();
                        if(a[2] < 1 || a[2] > 178){
                            System.out.println("\nVocê digitou um ângulo inválido.");
                            System.out.println("Digite um valor maior que 0 e menor que 179.\n");
                        }
                    }while(a[2] < 1 || a[2] > 178);
                }
                catch(InputMismatchException e){
                    System.out.println("\nPor favor digite apenas números inteiros.\n");
                    erro = true;
                    leitor.next();
                }
            }while(erro == true);
            
            if(a[0]+a[1]+a[2] != 180){
                System.out.println("\nOs ângulos digitados não formam um triângulo.");
                System.out.println("A soma dos ângulos deve ser sempre 180 graus.\n");
            }
        }while(a[0]+a[1]+a[2] != 180);
        
        for(int i=0; i<3; i++){
            for(int j=i+1; j<3; j++){
                if(a[i] == a[j]){
                    cont++;
                }
            }
        }
        
        switch(cont){
            case 1:
                System.out.println("\nO triângulo é do tipo: ESCALENO.\n");
                break;
                
            case 2:
                System.out.println("\nO triângulo é do tipo: ISÓSCELES.\n");
                break;
                
            case 4:
                System.out.println("\nO triângulo é do tipo: EQUILÁTERO.\n");
                break;
                
            default:
                break;
        }
        
    }
}