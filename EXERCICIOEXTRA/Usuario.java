package EXERCICIOEXTRA;
public abstract class Usuario implements Exibivel {
    private int codigo;
    private String nome;
    private String email;

    public Usuario(int codigo, String nome, String email) {
        this.codigo=codigo;
        this.nome=nome;
        this.email=email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }


    public abstract int limiteMaxEmprestimos();
    public abstract int prazoDevolucaoemDias();
    public abstract double valorMultaDiaria();
    public abstract String tipoUsuario();

}
