import java.util.UUID;

public class Desenvolvedor extends Funcionario {
    //atributos
    private String linguagem;

    //construt
    Desenvolvedor(String n, double s, String l){
        super(n, s);
        this.linguagem=l;
    }

    public String getNome(){
        return super.getNome();
    }

    public double getSalario(){
        return super.getSalario();
    }

    public UUID getID(){
        return super.getId();
    }

    public String getLinguagem(){
        return this.linguagem;
    }

    //metodos
    public double calcularBonusDesenvolvedor(){
        return (super.getSalario()*0.15);
    }

}
