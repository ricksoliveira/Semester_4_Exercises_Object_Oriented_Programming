/*

Nome: Henrique Servidoni de Oliveira
RA: 2760481821017

*/

package lista1ex5;

public class Lista1Ex5 {

    public static void main(String[] args) {
        
        Vetor v1 = new Vetor(2);
        
        v1.insert("a1");
        v1.insert("a2");
        v1.insert("a3");
        v1.insert("a4");
        v1.insert("a5");
        
        System.out.println(v1.getTamanho());
        
        System.out.println(v1.get(0));
        System.out.println(v1.get(1));
        System.out.println(v1.get(2));
        System.out.println(v1.get(3));
        //System.out.println(v1.get(4));
        
    }
    
}
