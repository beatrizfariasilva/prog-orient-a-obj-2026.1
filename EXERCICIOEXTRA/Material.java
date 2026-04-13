package EXERCICIOEXTRA;
public abstract class Material implements Exibivel{
    private int codigo;
    private String titulo;
    private int anoDePublicacao;
    private int quantidadeDisponivel;

    public Material(int codigo, String t, int aP, int qD) {
        this.codigo=codigo;
        this.titulo=t;
        this.anoDePublicacao=aP;
        this.quantidadeDisponivel=qD;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo=t;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int aP) {
        this.anoDePublicacao=aP;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int qD) {
        this.quantidadeDisponivel=qD;
    }

    public String haExemplarDisponivel(){
        if (quantidadeDisponivel>=1){
            return "Sim";
        } else return "Não";
    }

    public void emprestimo(){
        quantidadeDisponivel--;
    }

    public void devolucao(){
        quantidadeDisponivel++;
    }


    public abstract String infoEspecifica();

}

