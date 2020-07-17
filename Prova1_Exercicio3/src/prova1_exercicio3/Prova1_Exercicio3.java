/*
    Prova 1 - POO - ADS 4º semestre
    Data: 16/05/2020
    Nome: Henrique Servidoni de Oliveira
    RA: 2760481821017
    
    Exercício 3)
*/
package prova1_exercicio3;

import java.util.Scanner;

public class Prova1_Exercicio3 {

    public static void main(String[] args) {
        
        int opcao;
        
        LivrosDisponiveis disp1 = new LivrosDisponiveis();
        LivrosAdquiridos adq1 = new LivrosAdquiridos();
        Cliente c1 = new Cliente(disp1, adq1);
        
        do{
            System.out.println("---------------------------------------");
            System.out.println("O que deseja fazer ?\n");
            System.out.println(" [1] - Ver catálogo de livros.");
            System.out.println(" [2] - Ver meus livros.");
            System.out.println(" [3] - Ler um livro.");
            System.out.println(" [4] - Sair.");
            System.out.println("---------------------------------------");
            
            Scanner leitor = new Scanner(System.in);
            opcao = leitor.nextInt();
            
            switch(opcao){
                
                case 1:
                    
                    for(int p=0; p<40; p++){
                        System.out.println("");
                    }
                    c1.verDisponiveis();
                    
                    System.out.println("---------------------------------------");
                    System.out.println("O que deseja fazer ?\n");
                    System.out.println(" [1] - Comprar um livro.");
                    System.out.println(" [2] - Voltar.");
                    System.out.println("---------------------------------------");
                    opcao = leitor.nextInt();
                    
                    if(opcao == 1){
                        System.out.println("Digite o Número do livro que deseja comprar: ");
                        opcao = leitor.nextInt();
                        c1.comprarLivro(opcao);
                        System.out.println("\n LIVRO COMPRADO COM SUCESSO !\n");
                    }
                    
                    else if(opcao == 2){
                        for(int p=0; p<40; p++){
                            System.out.println("");
                        }
                    }
                    break;
                    
                case 2:
                    
                    for(int p=0; p<40; p++){
                        System.out.println("");
                    }
                    c1.verAdquiridos();
                    break;
                    
                case 3:
                    
                    for(int p=0; p<40; p++){
                        System.out.println("");
                    }
                    c1.verAdquiridos();
                    
                    System.out.println("---------------------------------------");
                    System.out.println("Digite o numero do livro que você deseja ler.\n");
                    System.out.println("---------------------------------------");
                    opcao = leitor.nextInt();
                    
                    System.out.println("---------------------------------------\n");
                    System.out.println(c1.lerLivro(opcao));
                    System.out.println("\n");
                    break;
                    
                default:
                    break;
            }
            
        }while(opcao != 4);
        
    }
    
}
