import java.util.Scanner;

class Telefone {
    int ddd;
    int numeroBase;

    Telefone(int d, int n){
        ddd = d;
        numeroBase = n;
    }

    public String toString(){
        return "(" +ddd + ")" + numeroBase;
    }
};

class Data {
    int dia;
    int mes;
    int ano;

    Data(int d, int m, int a){
        dia=d;
        mes=m;
        ano=a;
    }
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
};

class Endereco {
    String nomeLogradouro;
    int numeroLogradouro;
    String bairro;
    String cidade;
    String estado;

    Endereco(String n, int nL, String b, String c, String e){
        nomeLogradouro=n;
        numeroLogradouro=nL;
        bairro=b;
        cidade=c;
        estado=e;
    }

    public String toString(){
        return "\n  Logradouro: " + nomeLogradouro + "\n  Numero: " + numeroLogradouro + "\n  Bairro: " + bairro + "\n  Cidade: " + cidade + "\n  Estado: "+ estado;
    }
};

class Cliente {
    String nome;
    int rg;
    Telefone tel;
    Data nascimento;
    Endereco end;

    Cliente(String n, int rg, Telefone t, Data d, Endereco e){
        nome=n;
        rg=this.rg;
        tel=t;
        nascimento=d;
        end=e;
    }

    public String toString(){
        return "Nome: " + nome + "\nRG: " + rg + "\nTelefone: " + tel + "\nData: " + nascimento + "\nEndereço: "+ end;
    }
};

public class Main {
    public static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        Telefone novoTelefoneClienteBase = new Telefone (0, 0);
        Data novaDataBase = new Data (0, 0, 0);
        Endereco novoEnderecoBase = new Endereco(null, 0, null, null, null);
        Cliente novoCliente = new Cliente(null, 0, novoTelefoneClienteBase, novaDataBase, novoEnderecoBase);

        System.out.println("Digite o DDD do cliente");
        int ddd = input.nextInt();
        novoTelefoneClienteBase.ddd=ddd;

        System.out.println("\nDigite o telefone do cliente");
        int tel = input.nextInt();
        novoTelefoneClienteBase.numeroBase=tel;

        System.out.println("\nDigite o dia do nascimento do cliente");
        int dia = input.nextInt();
        novaDataBase.dia=dia;

        System.out.println("\nDigite o mes de nascimento do cliente");
        int mes = input.nextInt();
        novaDataBase.mes=mes;

        System.out.println("\nDigite o ano de nascimento do cliente");
        int ano = input.nextInt();
        novaDataBase.ano=ano;

        String buffer = input.nextLine();

        System.out.println("\nDigite o logradouro do cliente");
        String logradouro = input.nextLine();
        novoEnderecoBase.nomeLogradouro=logradouro;

        System.out.println("\nDigite o numero do logradouro do cliente");
        int num = input.nextInt();
        novoEnderecoBase.numeroLogradouro=num;

        System.out.println("\nDigite o bairro do cliente");
        String bairro = input.nextLine();
        novoEnderecoBase.bairro=bairro;

        System.out.println("\nDigite o cidade do cliente");
        String cidade = input.nextLine();
        novoEnderecoBase.cidade=cidade;

        System.out.println("\nDigite o estado do cliente");
        String estado = input.nextLine();
        novoEnderecoBase.estado=estado;

        System.out.println("\nDigite o nome do cliente");
        String nome = input.nextLine();
        novoCliente.nome=nome;

        System.out.println("\nDigite o rg do cliente");
        int rg = input.nextInt();
        novoCliente.rg=rg;

        System.out.println(novoCliente);
    }
}