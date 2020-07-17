/*

Nome: Henrique Servidoni de Oliveira
RA: 2760481821017

*/

package lista1ex2;

public class Lista1Ex2 {
    
    public static void main(String[] args) {
        
        Data d1 = new Data(06, 06, 1992); // válida
        System.out.println("Data 1 é: " + d1.getDia() + "/" + d1.getMes() + "/" + d1.getAno());
        
        Data d2 = new Data(-8, 2, 1992); // inválida
        System.out.println("Data 2 é: " + d2.getDia() + "/" + d2.getMes() + "/" + d2.getAno());
        
        System.out.println(d1.compara(d2));
        
        System.out.println("Mes " + d1.getMes() + " = " + d1.getMesExtenso());
        
        System.out.println("Ano " + d1.getAno() + " é bissexto? " + d1.isBissexto());
    }
    
}
