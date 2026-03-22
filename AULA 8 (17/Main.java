import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner input = new Scanner (System.in);

    public static double exibirBonus(Funcionario f){
        if (f instanceof Desenvolvedor){
            return ((Desenvolvedor)f).calcularBonusDesenvolvedor();
        } else if (f instanceof Gerente) {
            return ((Gerente)f).calcularBonusGerente();
        } else {
            return f.calcularBonus();
        }
    }

    public static void main(String[] args) {
        //Funcionario[] funcionarios = new Funcionario[50];
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario d1=new Desenvolvedor("Andressa", 2500.67, "Python");
        Funcionario d2=new Desenvolvedor("Beatriz", 2500.67, "Java");
        Funcionario g=new Gerente("Daniel", 10000.67, "Computação");
        Funcionario f=new Funcionario("Ricardo", 3000.67);

        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(g);
        funcionarios.add(f);
        
        for (Funcionario individuo : funcionarios){ //pode ser tb (for i=0; i<funcionarios.size(); i++)
            System.out.println("Nome do funcionario: "+ individuo.getNome());
            System.out.println("Salário: "+ individuo.getSalario());
            System.out.println("Bônus: "+exibirBonus(individuo));
            System.out.println();
        }




    }
}
