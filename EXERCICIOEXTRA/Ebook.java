package EXERCICIOEXTRA;

public class Ebook extends Material {
    private String formato;
    private String tamanhoArquivo;

    Ebook(int codigo, String t, int aP, int qD, String f, String tA){
        super(codigo, t, aP, qD);
        this.formato=f;
        this.tamanhoArquivo=tA;
    }

    public void setFormato(String f){
        this.formato=f;
    }

    public String getFormato(){
        return this.formato;
    }

    public void setTamanhoArquivo(String tA){
        this.tamanhoArquivo=tA;
    }

    public String getTamanhoArquivo(){
        return this.tamanhoArquivo;
    }

    public String infoEspecifica(){
        return "Formato : "+formato+"\nTamanho do arquivo : "+tamanhoArquivo;
    }

    public String exibirResumo() {
        return "Código: " +getCodigo()+"\nTítulo: "+getTitulo() +"\nAno de publicação: "+getAnoDePublicacao()+"\nQuantidade disponível: "+getQuantidadeDisponivel();
    }
}


