package cadastroempregado;

public class CadastroEmpregado {
    
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Maria", "Vendas");
        Empregado emp2 = new Empregado("Carlos", "Compras");
        Empregado emp3 = new Empregado("João", "CDE");
        Empregado emp4 = new Empregado("José");
        
        emp1.setSalario(1000);
        emp2.setSalario(2500);
        emp3.setSalario(3700);
        emp4.setSalario(900);
        
        emp1.imprimeEmpregado();
        emp2.imprimeEmpregado();
        emp3.imprimeEmpregado();
        emp4.imprimeEmpregado();
        
        System.out.println("");
        
        Empregado.imprimeEmpregadoStatic(emp1);
        
        
    }
    
}
