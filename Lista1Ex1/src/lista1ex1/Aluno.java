package lista1ex1;

public class Aluno {
    
    private String nome;
    private int matricula;
    private double prova1, prova2, trab1;
    
    // Specific Methods
    
    public double calculaMedia(){
        return ( ((getProva1() * 2.5) + (getProva2() * 2.5) + (getTrab1() * 2)) / 7 );
    }
    
    public double calculaFinal(){
        
        double media = ((getProva1() * 2.5) + (getProva2() * 2.5) + (getTrab1() * 2)) / 7;
        
        if(media >= 6){
            return 0;
        }
        
        else{
            return 6 - media;
        }
    }
    
    // Getters and Setters
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getProva1(){
        return prova1;
    }

    public void setProva1(double prova1){
        this.prova1 = prova1;
    }

    public double getProva2(){
        return prova2;
    }

    public void setProva2(double prova2){
        this.prova2 = prova2;
    }

    public double getTrab1(){
        return trab1;
    }

    public void setTrab1(double trab1){
        this.trab1 = trab1;
    }
    
}
