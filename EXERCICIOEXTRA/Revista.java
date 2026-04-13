package EXERCICIOEXTRA;

public class Revista extends Material{
    private int edicao;

    Revista(int codigo, String t, int aP, int qD, int e){
        super(codigo, t, aP, qD);
        this.edicao=e;
    }

    public void setEdicao(int e){
        this.edicao=e;
    }

    public int getEdicao(){
        return this.edicao;
    }

    public String infoEspecifica(){
        return "Edição : "+edicao;
    }

    public String exibirResumo() {
        return "Código: " +getCodigo()+"\nTítulo: "+getTitulo() +"\nAno de publicação: "+getAnoDePublicacao()+"\nQuantidade disponível: "+getQuantidadeDisponivel();
    }
}
