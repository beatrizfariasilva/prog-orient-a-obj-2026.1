package EXERCICIOEXTRA;

public class Livro extends Material{
    private String autor;

    Livro(int codigo, String t, int aP, int qD, String a){
        super(codigo, t, aP, qD);
        this.autor=a;
    }

    public void setAutor(String a){
        this.autor=a;
    }

    public String getAutor(){
        return this.autor;
    }

    public String infoEspecifica(){
        return "Autor: "+autor;
    }

    public String exibirResumo() {
        return "Código: " +getCodigo()+"\nTítulo: "+getTitulo() +"\nAno de publicação: "+getAnoDePublicacao()+"\nQuantidade disponível: "+getQuantidadeDisponivel();
    }
}
