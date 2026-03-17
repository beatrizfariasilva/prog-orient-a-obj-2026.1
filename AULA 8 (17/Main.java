import java.util.Scanner;

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
        Funcionario[] funcionarios = new Funcionario[50];
        int tam=0;

        funcionarios[tam]=new Desenvolvedor("Andressa", 2500.67, "Python");
        tam++;
        funcionarios[tam]=new Desenvolvedor("Beatriz", 2500.67, "Java");
        tam++;
        funcionarios[tam]=new Gerente("Daniel", 10000.67, "Computação");
        tam++;
        funcionarios[tam]=new Funcionario("Ricardo", 3000.67);
        tam++;
        
        for (int i=0; i<tam; i++){
            System.out.println("Nome do funcionario: "+ funcionarios[i].getNome());
            System.out.println("Salário: "+ funcionarios[i].getSalario());
            System.out.println("Bônus: "+exibirBonus(funcionarios[i]));
            System.out.println();
        }




    }
}
