package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
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
    
    public void desenhar(){
        
    }
    
    protected void tampar(){
        
    }
    
    protected void destampar(){
        
    }
    
    
    
}
