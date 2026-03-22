import java.util.UUID;

public class Funcionario {
    private String nome;
    private double salario;
    private final UUID id;
    private static int totalFuncionarios=0;


    Funcionario(String n, double s){
        this.nome=n;
        this.salario=s;
        this.id=UUID.randomUUID();
        totalFuncionarios++;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }

    public UUID getId(){
        return this.id;
    }

    public int getTotalFuncionarios(){
        return totalFuncionarios;
    }

    public double calcularBonus(){
        return (this.salario*0.1);
    }





}
