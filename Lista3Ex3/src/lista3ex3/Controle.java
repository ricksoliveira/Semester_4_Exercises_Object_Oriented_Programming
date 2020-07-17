package lista3ex3;

import java.util.Scanner;

public class Controle {
    
    public static String leString(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        return leitor.next();
    }
    
    public static int leInteiro(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        return leitor.nextInt();
    }
    
}
