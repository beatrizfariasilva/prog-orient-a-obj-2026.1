public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String n, int i){
        this.nome=n;
        this.idade=i;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
}
