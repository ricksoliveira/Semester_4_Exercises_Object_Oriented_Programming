package cpu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CPU {

    public static void main(String[] args) {
        
        int opcao=0;
        Scanner s = new Scanner(System.in);
        do{
            try{
                opcao = s.nextInt();
            }catch(InputMismatchException e){
                System.out.println("");
            }
        }while(opcao != 1);
    }
    
}
