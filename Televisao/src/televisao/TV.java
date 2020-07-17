package televisao;

public class TV {
    
    private int volume;
    private int canal;
    
    // Constructor
    
    public TV(){
        this.volume = 0;
        this.canal = 0;
    }
    
    public TV(int c){
        this.volume = 0;
        this.canal = c;
    }
    
    public TV(int c, int v){
        this.volume = v;
        this.canal = c;
    }
    
    // Specific Methods
    
    public void mostrar(){
        System.out.println("Canal: " + getCanal() + "\tVolume: " + getVolume());
        //System.out.println("Volume: " + getCanal());
    }
    
    // Getters and Setters
    
    public int getVolume(){
        return volume;
    }
    
    public void aumentaVolume(){
        this.volume++;
    }
    
    public void diminuiVolume(){
        this.volume--;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public void setCanal(int canal){
        this.canal = canal;
    }
    
}
