/*

Nome: Henrique Servidoni de Oliveira
RA: 2760481821017

*/

package lista1ex3;

public class Lista1Ex3 {

    public static void main(String[] args) {
        
        Data d1 = new Data(6,6,1992);
        Voo v1 = new Voo(1718, d1);
        
        System.out.println(v1.verificaVagas());
        
        v1.ocupa(1);
        v1.ocupa(2);
        
        System.out.println("Número de poltronas vagas: " + v1.verificaVagas());
        
        System.out.println("Poltrona 1 está ocupada? " + v1.verificaPoltrona(1)); // true
        System.out.println("Poltrona 2 está ocupada? " + v1.verificaPoltrona(2)); // true
        System.out.println("Poltrona 3 está ocupada? " + v1.verificaPoltrona(3)); // false
        
        System.out.println("Proxima poltrona vazia do voo é a de número: " + v1.proximoLivre());
        
        System.out.println("Numero do voo é: " + v1.getNumVoo());
        
    }
}
