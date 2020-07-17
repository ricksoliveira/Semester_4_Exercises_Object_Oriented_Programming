package lista3blocoa;

import java.util.Scanner;

public class Lista3BlocoA {

    public static void main(String[] args) {
        
        Bixinho A[] = new Bixinho[5];
        Scanner leitor = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            A[i] = new Bixinho(leitor.next(), leitor.next());
        }
        
        System.out.println("\n\n");
        
        for(int i=0; i<5; i++){
            System.out.println(A[i].getNomeAnimal());
            System.out.println(A[i].getNomeEspecie());
            System.out.println("");
            
        }
        
        System.out.println("");
        
        ObjetoFerramenta obj = new ObjetoFerramenta();
        
        obj.classificaEspecies(A);
        
        System.out.println("");
        
        obj.filtraEspecie(A, "Anta");
        
    }
    
}
