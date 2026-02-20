import java.util.Scanner;

public class Main {
    public static Scanner input=new Scanner (System.in);
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("null", 0, 0);
        int opcao;
        do {
            System.out.println("Escolha a sua ação:\n0-Sair\n1-Criar conta\n2-Depositar\n3-Sacar\n4-Exibir saldo");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do titular da conta");
                    String buffer=input.nextLine();
                    String nome = input.nextLine();
                    conta.nomeTitular=nome;
                    System.out.println("Digite o número da conta");
                    int idConta = input.nextInt();
                    conta.idConta=idConta;
                    System.out.println("Digite o saldo da conta");
                    double saldoConta = input.nextDouble();
                    conta.saldoConta=saldoConta;
                    
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar");
                    double deposito = input.nextDouble();
                    conta.saldoConta=conta.depositar(deposito);
                    System.out.println("Depósito feito com sucesso");
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar");
                    double saque = input.nextDouble();
                    conta.saldoConta=conta.saque(saque);
                    System.out.println("Saque feito com sucesso");
                    break;
                case 4:
                    System.out.println("Saldo atual da conta: "+conta.saldoConta);
                    break;
            }
        } while (opcao!=0);
    }
}
