public class ContaBancaria {
    String nomeTitular;
    int idConta;
    double saldoConta;

    ContaBancaria(String nomeTitular, int idConta, double saldoConta){
        this.nomeTitular=nomeTitular;
        this.idConta=idConta;
        this.saldoConta=saldoConta;
    }

    double depositar(double valor){
        return (saldoConta+valor);
    }

    double saque(double valor){
        if (saldoConta>=valor){
            System.out.println("Saque bem sucedido!\n");
            return (saldoConta-valor);
        }

        else{
            System.out.println("Não foi bem sucedido!\n");
            return saldoConta;
        }
    }

    void exibir(){
        System.out.printf("Nome do Titular: %s\n", nomeTitular);
        System.out.printf("Número da Conta: %d\n", idConta);
        System.out.printf("Saldo atual: %f\n", saldoConta);
    }
    



}
