/*

Nome: Henrique Servidoni de Oliveira
RA: 2760481821017

*/

package lista1ex4;

public class Lista1Ex4 {

    public static void main(String[] args) {
        
        Gabarito g1 = new Gabarito();
        Prova p1 = new Prova(g1);
        Prova p2 = new Prova(g1);
        
        p1.respostaAluno('C');
        p1.respostaAluno('A');
        p1.respostaAluno('B');
        p1.respostaAluno('E');
        p1.respostaAluno('D');
        p1.respostaAluno('C');
        p1.respostaAluno('E');
        p1.respostaAluno('D');
        p1.respostaAluno('B');
        p1.respostaAluno('C');
        p1.respostaAluno('A');
        p1.respostaAluno('D');
        p1.respostaAluno('E');
        p1.respostaAluno('B');
        p1.respostaAluno('A');
        
        p2.respostaAluno('D');
        p2.respostaAluno('A');
        p2.respostaAluno('B');
        p2.respostaAluno('E');
        p2.respostaAluno('C');
        p2.respostaAluno('C');
        p2.respostaAluno('B');
        p2.respostaAluno('D');
        p2.respostaAluno('B');
        p2.respostaAluno('C');
        p2.respostaAluno('A');
        p2.respostaAluno('D');
        p2.respostaAluno('D');
        p2.respostaAluno('B');
        p2.respostaAluno('A');
        
        // 10
        System.out.println("Aluno da prova 1 acertou: " + p1.acertos() + " das 15 questões.");
        System.out.println("Aluno da prova 1 tirou nota: " + p1.nota());
        
        // 7.5
        System.out.println("Aluno da prova 2 acertou: " + p2.acertos() + " das 15 questões.");
        System.out.println("Aluno da prova 2 tirou nota: " + p2.nota());
        
        System.out.println(p1.maior(p2));
        
    }
    
}
