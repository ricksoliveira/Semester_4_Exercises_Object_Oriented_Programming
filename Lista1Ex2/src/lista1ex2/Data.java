package lista1ex2;

public class Data {
    
    private final int dia, mes, ano;
    
    // Constructor
    
    public Data(int dia, int mes, int ano){
        
        if(dia > 31 || dia < 1 || mes > 12 || mes < 1 || ano < 1){
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
        
        else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    // Specific Methods
    
    public int compara(Data d){
        
        if(d.getAno() > this.ano){
            return -1;
        }
        
        else if(d.getAno() < this.ano){
            return 1;
        }
        
        else{
            
            if(d.getMes() > this.mes){
                return -1;
            }
            
            else if(d.getMes() < this.mes){
                return 1;
            }
            
            else{
                
                if(d.getDia() > this.dia){
                    return -1;
                }
                
                else if(d.getDia() < this.dia){
                    return 1;
                }
                
                else{
                    return 0;
                }
            }
        }
    }
    
    public String getMesExtenso(){
        
        if(getMes() == 1) return "Janeiro";
        
        else if(getMes() == 2) return "Fevereiro";
        
        else if(getMes() == 3) return "Março";
        
        else if(getMes() == 4) return "Abril";
        
        else if(getMes() == 5) return "Maio";
        
        else if(getMes() == 6) return "Junho";
        
        else if(getMes() == 7) return "Julho";
        
        else if(getMes() == 8) return "Agosto";
        
        else if(getMes() == 9) return "Setembro";
        
        else if(getMes() == 10) return "Outubro";
        
        else if(getMes() == 11) return "Novembro";
        
        else return "Dezembro";
        
    }
    
    public boolean isBissexto(){
        
        if((getAno() % 4 == 0) && (getAno() % 100 != 0)){
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public Data clone(){
        Data clone = new Data(getDia(), getMes(), getAno());
        return clone;
    }
    
    // Getters and Setters

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }
    
}
