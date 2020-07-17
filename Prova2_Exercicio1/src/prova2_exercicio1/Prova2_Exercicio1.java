/*
    Prova 2 - POO - ADS 4º semestre
    Data: 26/06/2020
    Nome: Henrique Servidoni de Oliveira
    RA: 2760481821017
    
    Exercício 1)
*/
package prova2_exercicio1;

public class Prova2_Exercicio1 {
    
    public static class Deposito {
    
        private int items;
        private final int capacidade = 10;
        
        public Deposito(){
            this.items = 0;
        }
        
        public void retirar(){
            if(items > 0){
                items --;
                System.out.println("Caixa retirada: existem " + items + " caixas");
            }
            else if(items == 0){
                System.out.println("Erro! Impossível retirar, o depósito está vazio!");
            }
        }
        
        public void colocar(){
            if(items < capacidade){
                items++;
                System.out.println("Caixa armazenada: existem " + items + " caixas");
            }
            else if(items == capacidade){
                System.out.println("Erro! Impossível colocar, o depósito está lotado!");
            }
        }
    }
    
    public static void main(String[] args) {
        
        Deposito dep = new Deposito();
        
        for (int i=0; i<10; i++){
            dep.colocar();
        }
        dep.colocar(); // colocando mais 1 caixa depois de adicionar 10 para gerar um erro
        
        for(int i=0; i<10; i++){
            dep.retirar();
        }
        dep.retirar(); // retirando mais 1 caixa depois de retirar 10 para gerar um erro
    }
}
        //<editor-fold defaultstate="collapsed" desc="Erros e correções (expandir essa seção para visualizar)">

// Erro 1: a classe main estava dentro da classe depósito

// Erro 2: adicionado um construtor para inicialiar o atributo items com o valor 0

// Erro 3: atributo "items" estava como público, devia estar como privado uma vez que ele deve ser alterado apenas via método

// Erro 4: tipo "inteiro" do atributo "capacidade" não havia sido declarado

// Erro 5: métodos colocar() e retirar() estavam como privados e não podiam ser acessados da main

// Erro 6: não há necessidade dos métodos retornarem um valor inteiro

// Erro 7: a condição do if dentro do método colocar() estava errado, não pode ser menor ou IGUAL a capacidade, apenas menor

// Erro 8: os métodos colocar e retirar não tinham o tratamento adequado caso o número de caixas fosse igual a capacidade ou zero

// Erro 9: dep.capacidade = 100 não deve existir uma vez que a capacidade não deve ser alterada (final), muito menos da main (privada)

//</editor-fold>
