package laços;
import java.util.Scanner;
public class Ex1{
    
    public static void main(String[] args){
        int i, n, r_impar = 1, r_par = 1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("meu fala quantos numero: ");
        n = entrada.nextInt();
        
        for(i=1; i<=n; i++){
            if(i%2!=0){
                r_impar = r_impar * i;
            }
        }
        System.out.printf("res dos impares: %d\n", r_impar);
        
        for(i=1; i<=n; i++){
            if(i%2==0){
                r_par = r_par * i;
            }
        }
        System.out.printf("res dos pares: %d\n", r_par);
    }
}
