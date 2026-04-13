package EXERCICIOEXTRA;

public class Emprestimo implements Exibivel, CalculavelMulta{
    private int id;
    private Usuario usuario;
    private Material material;
    private String dataDoEmprestimo;
    private String dataPrevistaDevolucao;
    private String dataRealDevolucao;
    private static int contador=0;

    Emprestimo(Usuario u, Material mat, String dDE, String dPD, String dRD){
        this.usuario=u;
        this.material=mat;
        this.dataDoEmprestimo=dDE;
        this.dataPrevistaDevolucao=dPD;
        this.dataRealDevolucao=dRD;
        contador++;
        this.id=contador;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }

    public void setUsuario(Usuario u){
        this.usuario=u;
    }

    public int getId(){
        return this.id;
    }

    public String getDataDoEmprestimo(){
        return this.dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(String dDE){
        this.dataDoEmprestimo=dDE;
    }

    public String getdataPrevistaDevolucao(){
        return this.dataPrevistaDevolucao;
    }

    public void setdataPrevistaDevolucao(String dataPrevistaDevolucao){
        this.dataPrevistaDevolucao=dataPrevistaDevolucao;
    }

    public String getdataRealDevolucao(){
        return this.dataRealDevolucao;
    }

    public void setdataRealDevolucao(String dataRealDevolucao){
        this.dataRealDevolucao=dataRealDevolucao;
    }

    public String foiFinalizado() {
        if (dataRealDevolucao!=null){
            return "Sim";
        } return "Não";
    }

    public int calcularDiasAtraso() {
        String[] datadadevolucao=dataRealDevolucao.split("/");
        String[] dataprevistadadevolucao=dataPrevistaDevolucao.split("/");
        if (Integer.parseInt(datadadevolucao[0])-Integer.parseInt(dataprevistadadevolucao[0])<0){
            return 0;
        }
        return Integer.parseInt(datadadevolucao[0])-Integer.parseInt(dataprevistadadevolucao[0]);
    }

    public double calcularMulta() {
        int dias=calcularDiasAtraso();
        if (usuario instanceof Professor){
            return usuario.valorMultaDiaria()*dias;
        } else if(usuario instanceof Aluno){
            return usuario.valorMultaDiaria()*dias;
        } else {
            return usuario.valorMultaDiaria()*dias;
        }
        
    }

    public String exibirResumo() {
        return "Usuário: " + usuario.getNome() +
            "\nMaterial: " + material.getTitulo() +
            "\nData empréstimo: " + dataDoEmprestimo +
            "\nData prevista: " + dataPrevistaDevolucao +
            "\nData devolução: " + dataRealDevolucao;
    }







    







    



    

}
