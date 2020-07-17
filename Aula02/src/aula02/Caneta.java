package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.print("A caneta tem a cor " + this.cor + ", ");
        System.out.print("ela é do modelo " + this.modelo + ", ");
        System.out.print("seu tamanho de ponta é " + this.ponta);
        System.out.println(" e está com " + this.carga + "% de carga.");
        if(this.tampada){
            System.out.println("Ela está tampada.");
        }
        else{
            System.out.println("Ela está destampada");
        }
    }
    
    void desenhar(){
        
    }
    
    void tampar(){
        
    }
    
    void destampar(){
        
    }
    
}
