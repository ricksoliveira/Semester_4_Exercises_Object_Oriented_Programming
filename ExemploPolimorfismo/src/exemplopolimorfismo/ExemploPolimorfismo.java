package exemplopolimorfismo;

public class ExemploPolimorfismo {

    public static void main(String[] args) {
        
        Gerente g1 =  new Gerente("Henrique", 6200);
        
        g1.setBonus(1700);
        
        Empregado[] staff = new Empregado[4];
        
        staff[0] = new Empregado("Carlos", 2200);
        staff[1] = new Empregado("Joao", 1700);
        staff[2] = new Empregado("Marta", 3500);
        staff[3] = g1;
        
        for(Empregado e: staff){
            System.out.println(e.getNome() + " \t " + e.getSalario());
        }
        
    }
    
}
