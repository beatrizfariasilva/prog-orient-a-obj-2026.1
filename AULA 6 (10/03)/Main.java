import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner (System.in);

    public static void Impressao (Pessoa p){
        System.out.println("Nome da Pessoa Física: " + p.getNome());
        System.out.println("Idade da Pessoa Física: " + p.getIdade());

        if (p instanceof Pessoafisica){
            System.out.println("CPF da Pessoa Física: " +((Pessoafisica)p).getcpf());
        } else {
            System.out.println("CPF da Pessoa Jurídica: " +((Pessoajuridica)p).getcnpj());
        }
        
    }



    public static void main (String[] args){
        String nomePF = input.nextLine();
        int idadePF = input.nextInt();
        String buff=input.nextLine();
        String cpfPF = input.nextLine();

        Pessoa pessoaFisica=new Pessoafisica(nomePF, idadePF, cpfPF);

        String nomePJ = input.nextLine();
        int idadePJ = input.nextInt();
        String buff2=input.nextLine();
        String cnpjPJ = input.nextLine();

        Pessoa pessoaJuridica=new Pessoajuridica(nomePJ, idadePJ, cnpjPJ);

        Impressao(pessoaFisica);
        System.out.println();
        System.out.println();
        Impressao(pessoaJuridica);


        






    }
}

