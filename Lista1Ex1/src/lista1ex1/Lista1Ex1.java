/*

Nome: Henrique Servidoni de Oliveira
RA: 2760481821017

*/

package lista1ex1;

import java.util.Scanner;

public class Lista1Ex1 {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o nome do Aluno 1: ");
        a1.setNome(leitor.nextLine());
        
        System.out.print("Quanto " + a1.getNome() + " tirou na prova 1? - ");
        a1.setProva1(leitor.nextDouble());
        
        System.out.print("Quanto " + a1.getNome() + " tirou na prova 2? - ");
        a1.setProva2(leitor.nextDouble());
        
        System.out.print("Quanto " + a1.getNome() + " tirou no trabalho 1? - ");
        a1.setTrab1(leitor.nextDouble());
        
        System.out.println("\nMedia de " + a1.getNome() + " é " + a1.calculaMedia());
        
        System.out.println("Pontos restantes para " + a1.getNome() + " passar: " + a1.calculaFinal());
        
    }
    
}
