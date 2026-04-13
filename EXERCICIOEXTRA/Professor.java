package EXERCICIOEXTRA;

public class Professor extends Usuario {

    Professor(int codigo, String nome, String email){
        super(codigo, nome, email);
    }

    public int limiteMaxEmprestimos(){
        return 5;
    }
    public int prazoDevolucaoemDias(){
        return 14;
    }
    public double valorMultaDiaria(){
        return 1.0;
    }
    public String tipoUsuario(){
        return "Professor";
    }

    @Override
    public String exibirResumo() {
        return "Código: " +getCodigo()+"\nNome: "+getNome() +"\nEmail: "+getEmail();
    }
}


