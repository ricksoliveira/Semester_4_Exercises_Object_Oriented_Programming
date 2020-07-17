package lista1ex3;

public class Voo {
    
    private Data date;
    private final int numVoo;
    private boolean poltronas[] = new boolean[100];
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Voo(int numVoo, Data date){
        this.numVoo = numVoo;
        this.date = date;
        
        for(int i=0; i<100; i++){
            poltronas[i] = false;
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos Específicos">
    //<editor-fold defaultstate="collapsed" desc="Verifica próxima poltrona vaga">
    public int proximoLivre(){
        
        for(int i=0; i<100; i++){
            if(poltronas[i] == false){
                return i+1;
            }
        }
        return 0;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Perifica se uma poltrona específica está livre">
    public boolean verificaPoltrona(int pol){
        
        if(poltronas[pol-1] == true){
            return true;
        }
        
        else{
            return false;
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Ocupa uma poltrona específica">
    public boolean ocupa(int pol){
        
        if(pol > 100 || pol < 1){
            System.out.println("Erro, esse número de poltrona não existe.");
            return false;
        }
        else{
            
            if(poltronas[pol-1] == true){
                System.out.println("Erro, poltrona já está ocupada");
                return false;
            }
            
            else{
                System.out.println("Operação bem sucedida. Poltrona reservada com sucesso!");
                poltronas[pol-1] = true;
                return true;
            }
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Verifica quantas poltronas vagas tem">
    public int verificaVagas(){
        
        int c = 0;
        
        for(int i=0; i<100; i++){
            if(poltronas[i] == false){
                c++;
            }
        }
        return c;
    }
//</editor-fold>
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Gets e Sets">
    public Data getDate(Data d){
        return date;
    }
    
    public int getNumVoo(){
        return numVoo;
    }
//</editor-fold>
    
}
