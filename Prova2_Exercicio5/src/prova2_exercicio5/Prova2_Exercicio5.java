/*
    Prova 2 - POO - ADS 4º semestre
    Data: 27/06/2020
    Nome: Henrique Servidoni de Oliveira
    RA: 2760481821017
    
    Exercício 5)
*/
package prova2_exercicio5;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Prova2_Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<Animal> animais = new LinkedList<Animal>();
        int n, i = 0;
        String especie, nomeA;
        boolean erro;
        
        do{
            erro = false;
            try{
                System.out.print("Digite quantos animais deseja adicionar: ");
                n = leitor.nextInt();
                leitor.nextLine();
                    
                    do{
                        System.out.println("Que tipo de animal você quer adicionar ?");
                        System.out.println(" [A] - Arara\n [U] - Urso\n [C] - Cobra\n [G] - Animal genérico  ");
                        especie = leitor.nextLine(); 
                        
                        switch(especie){

                            case "A":
                                System.out.println("Qual o nome da Arara?: ");
                                nomeA = leitor.nextLine();
                                animais.add(new Arara(nomeA));
                                i++;
                                break;

                            case "U":
                                System.out.println("Qual o nome do Urso?: ");
                                nomeA = leitor.nextLine();
                                animais.add(new Urso(nomeA));
                                i++;
                                break;

                            case "C":
                                System.out.println("Qual o nome da Cobra?: ");
                                nomeA = leitor.nextLine();
                                animais.add(new Cobra(nomeA));
                                i++;
                                break;

                            case "G":
                                System.out.println("Qual o nome do animal genérico?: ");
                                nomeA = leitor.nextLine();
                                animais.add(new Cobra(nomeA));
                                i++;
                                break;

                            default:
                                System.out.println("Erro, digite apenas as letras A, U, C ou G (em maísculo)");
                                break;    
                        }     
                    }while((!"A".equals(especie) || !"U".equals(especie) || !"C".equals(especie) || !"G".equals(especie)) && i<n);
                    
            }catch(InputMismatchException ex){
                erro = true;
                System.out.println("Erro! Digite um número inteiro.");
                leitor.next();
            }
        }while(erro);
        
        for(int p=0; p<40; p++){    // pula 40 linhas para "limpar" o terminal (clear screen)
            System.out.println("");
        }
        
        System.out.println("- Lista em ordem de entrada ----------- ");
        
        for(Animal a : animais){
            System.out.println("Nome: " + a.getNome());
            a.andar();
            System.out.println("");
        }
        animais.sort(Comparator.comparing(Animal::getNome));
        
        System.out.println("\n");
        
        System.out.println("- Lista em ordem Alfabética ----------- ");
        
        for(Animal a : animais){
            System.out.println("Nome: " + a.getNome());
            a.andar();
            System.out.println("");
        }
        
        leitor.close();
    
    }
    
}
