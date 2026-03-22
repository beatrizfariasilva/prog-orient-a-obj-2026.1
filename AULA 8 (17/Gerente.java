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

    public void setNome(String nome){
        super.setNome(nome);
    }

    public double getSalario(){
        return super.getSalario();
    }

    public void setSalario(double salario){
        super.setSalario(salario);
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
