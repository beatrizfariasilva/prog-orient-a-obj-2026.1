import java.util.UUID;
public class Gerente extends Funcionario {
    //atributos
    private String departamento;

    //construtor
    Gerente(String n, double s, String d){
        super(n, s);
        this.departamento=d;
    }

    //gets
    public String getNome(){
        return super.getNome();
    }

    public double getSalario(){
        return super.getSalario();
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public UUID getId(){
        return super.getId();
    }

    //métodos próprios
    public double calcularBonusGerente(){
        return (super.getSalario()*0.2);
    }
}
