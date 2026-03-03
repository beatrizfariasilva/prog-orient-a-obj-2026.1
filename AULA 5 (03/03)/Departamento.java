public class Departamento {
    //atributos
    private int codigo;
    private String nome;

    //métodos
    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int entrada){
        this.codigo=entrada;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String input){
        this.nome=input;
    }

    //construtor
    Departamento(int c, String n){
        this.codigo=c;
        this.nome=n;
    }

    public String toString(){
        return "Código: " + getCodigo() +
        "\nNome: " + getNome();
    }

}
