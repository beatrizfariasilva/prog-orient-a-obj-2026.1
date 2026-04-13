package EXERCICIOEXTRA;

public class Biblioteca {
    Usuario[] listaUsuarios=new Usuario[50];
    Material[] listaMateriais=new Material[50];
    Emprestimo[] listaEmprestimos=new Emprestimo[50];
    private int qtdUsuarios=0;
    private int qtdMateriais=0;
    private int qtdEmprestimos=0;

    public void cadastrarUsuario(Usuario u) {
        listaUsuarios[qtdUsuarios]=u;
        qtdUsuarios++;
    }

    public void cadastrarMaterial(Material m) {
        listaMateriais[qtdMateriais]=m;
        qtdMateriais++;
    }

    public Usuario buscarUsuario(int codigo) {
        for (int i=0; i<qtdUsuarios; i++) {
            if (listaUsuarios[i].getCodigo()==codigo) {
                return listaUsuarios[i];
            }
        }
        return null;
    }

    public Material buscarMaterial(int codigo) {
        for (int i=0; i<qtdMateriais; i++) {
            if (listaMateriais[i].getCodigo()==codigo) {
                return listaMateriais[i];
            }
        }
        return null;
    }

    public Emprestimo buscarEmprestimo(int id) {
        for (int i=0; i<qtdEmprestimos; i++) {
            if (listaEmprestimos[i].getId()==id) {
                return listaEmprestimos[i];
            }
        }
        return null;
    }

    public void realizarEmprestimo(Usuario u, Material m, String dataEmp, String dataPrev) {
        if (contarEmprestimosAtivos(u)>=u.limiteMaxEmprestimos()) {
            throw new RuntimeException("Limite de empréstimos atingido");
        }

        if (m.haExemplarDisponivel().equals("Não")) {
            throw new RuntimeException("Material indisponível");
        }

        if (m.haExemplarDisponivel().equals("Sim")) {
            Emprestimo e=new Emprestimo(u, m, dataEmp, dataPrev, null);
            listaEmprestimos[qtdEmprestimos]=e;
            qtdEmprestimos++;
            m.emprestimo();
        }
    }

    public void registrarDevolucao(int id, String data) {
        Emprestimo e=buscarEmprestimo(id);
        if (e!=null) {
            e.setdataRealDevolucao(data);
        }
    }

    public void listarUsuarios() {
        for (int i=0; i<qtdUsuarios; i++) {
            System.out.println(listaUsuarios[i].exibirResumo()+"\n");
        }
    }

    public void listarMateriais() {
        for (int i=0; i<qtdMateriais; i++) {
            System.out.println(listaMateriais[i].exibirResumo()+"\n");
        }
    }

    public void listarEmprestimosEmAndamento() {
        for (int i=0; i<qtdEmprestimos; i++) {
            if (listaEmprestimos[i].foiFinalizado().equals("Não")) {
                System.out.println(listaEmprestimos[i].exibirResumo()+"\n");
            }
        }
    }

    public void listarEmprestimosFinalizados() {
        for (int i=0; i<qtdEmprestimos; i++) {
            if (listaEmprestimos[i].foiFinalizado().equals("Sim")) {
                System.out.println(listaEmprestimos[i].exibirResumo()+"\n");
            }
        }
    }

    public int contarEmprestimosAtivos(Usuario u) {
        int contador=0;

        for (int i=0; i<qtdEmprestimos; i++) {
            if (listaEmprestimos[i].foiFinalizado().equals("Não") && listaEmprestimos[i].getUsuario().equals(u)) {
                contador++;
            }
        }
        return contador;
    }













}





