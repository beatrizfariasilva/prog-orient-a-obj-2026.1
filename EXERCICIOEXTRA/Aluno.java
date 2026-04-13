package EXERCICIOEXTRA;

public class Aluno extends Usuario{

    Aluno(int codigo, String nome, String email){
        super(codigo, nome, email);
    }

    public int limiteMaxEmprestimos(){
        return 3;
    }
    public int prazoDevolucaoemDias(){
        return 7;
    }
    public double valorMultaDiaria(){
        return 2.5;
    }
    public String tipoUsuario(){
        return "Aluno";
    }

    public String exibirResumo() {
        return "Código: " +getCodigo()+"\nNome: "+getNome() +"\nEmail: "+getEmail();
    }
}
