/*

Nome: Henrique Servidoni de Oliveira
RA: 2760481821017

*/

package lista1ex6;

public class Lista1Ex6 {

    public static void main(String[] args) {
        
        VetorOrdenado v1 = new VetorOrdenado(3);
        
        v1.insert("Caio");
        v1.insert("Andre");
        v1.insert("Bruno");
        
        System.out.println("Tamanho: " + v1.getTamanho());
        
        System.out.println(v1.get(0));
        System.out.println(v1.get(1));
        System.out.println(v1.get(2));
        
    }
    
}
