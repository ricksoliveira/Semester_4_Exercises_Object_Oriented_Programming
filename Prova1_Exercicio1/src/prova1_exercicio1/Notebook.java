package prova1_exercicio1;

import java.util.Date;

public class Notebook extends Computador implements Portátil {
    
    private Date dataFabricacao;
    
    // Constructor
    
    public Notebook(Date dataFabricacao){
        this.dataFabricacao = dataFabricacao;
    }
    
    // Specific Methods
    
    @Override
    public Number getCpuMips(){
        return 5000;
    }
    
    @Override
    public Number getBateryChargeLevel(){
        return 77;
    }
    
    // Getters and Setters
    
    public void setDataFabricacao(Date dataFabricacao){
        this.dataFabricacao = dataFabricacao;
    }
    
    public Date getDataFabricacao(){
        return dataFabricacao;
    }
    
}
