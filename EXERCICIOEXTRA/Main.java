package EXERCICIOEXTRA;

public class Main {
    public static void main(String[] args) {
        Biblioteca b=new Biblioteca();
        Usuario a=new Aluno(1, "Beatriz", "beatriz@outlook.com");
        Usuario p=new Professor(2, "Daniel", "daniel@gmail.br");

        b.cadastrarUsuario(a);
        b.cadastrarUsuario(p);

        Material livro1=new Livro(1, "java básico", 2003, 20, "Marcio Bueno");
        Material livro2=new Livro(2, "estrutura de dados", 1998, 2, "Newton");
        Material revista=new Revista(3, "revista tech", 2020, 3, 3);
        Material ebook=new Ebook(4, "POO em java", 2021, 100, "pdf", "100MB");
        b.cadastrarMaterial(livro1);
        b.cadastrarMaterial(livro2);
        b.cadastrarMaterial(revista);
        b.cadastrarMaterial(ebook);


        System.out.println("LISTA DE USUÁRIOS---------------------");
        b.listarUsuarios();

        System.out.println("\n LISTA DE MATERIAIS---------------------");
        b.listarMateriais();

        b.realizarEmprestimo(a, livro1, "01/04", "08/04");
        b.realizarEmprestimo(a, livro2, "11/04", "18/04");
        b.realizarEmprestimo(a, revista, "10/04", "17/04");
        b.realizarEmprestimo(p, ebook, "01/04", "15/04");

        try {
            b.realizarEmprestimo(a, ebook, "12/04", "16/04");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nEMPRÉSTIMOS EM ANDAMENTO---------------------");
        b.listarEmprestimosEmAndamento();

        b.registrarDevolucao(1, "19/04"); 
        livro1.devolucao();
        b.registrarDevolucao(2, "14/04");
        livro2.devolucao();

        Emprestimo e1=b.buscarEmprestimo(1);
        Emprestimo e2=b.buscarEmprestimo(2);
        System.out.println("\nMULTAS---------------------");
        System.out.println("Empréstimo 1: " + e1.calcularMulta());
        System.out.println("Empréstimo 2: " + e2.calcularMulta());

        System.out.println("\nMATERIAIS ATUALIZADOS---------------------");
        b.listarMateriais();
        System.out.println("\nEMPRÉSTIMOS FINALIZADOS---------------------");
        b.listarEmprestimosFinalizados();
        System.out.println("\nEMPRÉSTIMOS EM ANDAMENTO---------------------");
        b.listarEmprestimosEmAndamento();
    }
}
    

