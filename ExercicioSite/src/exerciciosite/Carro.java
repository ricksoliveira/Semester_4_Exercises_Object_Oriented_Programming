package exerciciosite;

public class Carro {
    
    private String modelo, cor, proprietario, marca;
    private int ano, chassi, velMax, velAtual, numPortas, numMarchas, volCombustivel;
    private boolean tetoSolar, cambioAutom;
    
    public Carro(String proprietario){
        this.proprietario = proprietario;
    }
    
    public void Acelera(){
        velAtual++;
    }
    
    public void Freia(){
        velAtual = 0;
    }
    
    public void TrocaMarcha(){
        numMarchas++;
    }
    
    public void ReduzMarcha(){
        numMarchas--;
    }
    
    public int CalculaAutonomia(){
        return 0;
    }
    
    public int getVolCombustivel(){
        System.out.println("Volume de combustível restante: ");
        return volCombustivel;
    }
    
    
}
