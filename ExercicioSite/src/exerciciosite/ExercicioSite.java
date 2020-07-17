package exerciciosite;

public class ExercicioSite {
    
    public static void main(String[] args) {
        
        Proprietario p1 = new Proprietario("Joao", 419415, 41686); 
        Carro c1 = new Carro(p1.getNome());
        p1.setEndereco(13100);
        Endereco e1 = new Endereco("Campinas", "Princesa", "1072", p1.getEndereco());
        Marca m1 = new Marca();
    }
    
}
