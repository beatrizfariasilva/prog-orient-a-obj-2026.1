public class Funcionario {
    //atributos
    private int matricula;
    private String nome;
    private Departamento departamento;

    //métodos
    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int entrada){
        this.matricula=entrada;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String input){
        this.nome=input;
    }

    public Departamento getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(Departamento d){
        this.departamento=d;
    }



    //construtor
    Funcionario(int m, String n, Departamento d){
        this.matricula=m;
        this.nome=n;
        this.departamento=d;
    }

    public String toString(){
        return "Matrícula: " + this.matricula +
        "\nNome: " + this.nome +
        "\nDepartamento: \n" +
        "   Nome departamento: "+departamento.getNome()+
        " \n   Código departamento: "+departamento.getCodigo();
    }

}

