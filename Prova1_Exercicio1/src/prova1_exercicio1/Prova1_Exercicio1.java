/*
    Prova 1 - POO - ADS 4º semestre
    Data: 16/05/2020
    Nome: Henrique Servidoni de Oliveira
    RA: 2760481821017
    
    Exercício 1)
*/
package prova1_exercicio1;

import java.util.Date;

public class Prova1_Exercicio1 {

    public static void main(String[] args) {
        
        Date atual = new Date();
        Notebook n1 = new Notebook(atual);
        
        System.out.println("Data Fabricacao: " + n1.getDataFabricacao());
        
        System.out.println("Bateria do Notebook em: " + n1.getBateryChargeLevel() + "%");
        
        System.out.println("CPU trabalhando com " + n1.getCpuMips() + " instruções por segundo.");
        
    }
    
}
