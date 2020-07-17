package cadastroempregado;

public class Empregado {
    
    private static int count = 1;
    
    private int codigo;
    private String nome;
    private String departamento;
    private float salario;

    public Empregado(String nome, String departamento) {
        codigo = count++;
        this.nome = nome;
        this.departamento = departamento;
    }
    
    public Empregado(String nome){
        codigo = count++;
        this.nome = nome;
    }
    
    public static void imprimeEmpregadoStatic(Empregado e){
        System.out.print("Codigo: " + e.codigo + " --- ");
        System.out.println(e.nome + " (" + e.departamento + ") - " + e.salario ); 
    }
    
    public void imprimeEmpregado(){ // pode botar um if(this.departamento == null) pra editar
        System.out.print("Codigo: " + codigo + " --- ");
        System.out.println(nome + " (" + departamento + ") - " + salario );
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}