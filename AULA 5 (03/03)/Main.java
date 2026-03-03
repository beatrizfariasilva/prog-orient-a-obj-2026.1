import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        Departamento dep1 = new Departamento(123, "Departamento de TI");
        Funcionario f1 = new Funcionario(84, "Beatriz Farias", dep1);

        System.out.println(f1);
    }
}
