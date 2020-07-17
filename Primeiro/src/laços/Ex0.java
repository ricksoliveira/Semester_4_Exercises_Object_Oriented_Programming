package laços;

import java.util.Scanner;

public class Ex0{
    
    public static void main(String[] args){
        int n, i, menor, num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("meu fala quantos numero: ");
        n = entrada.nextInt();
        
        System.out.print("fala o numero 1: ");
        num = entrada.nextInt();
        menor = num;
        
        for(i=1; i<n; i++){
            System.out.printf("fala o numero %d: ", i+1);
            num = entrada.nextInt();
            
            if(num<menor){
                menor = num;
            }
        }
        System.out.printf("mano o menor é %d: \n", menor);
    }
}