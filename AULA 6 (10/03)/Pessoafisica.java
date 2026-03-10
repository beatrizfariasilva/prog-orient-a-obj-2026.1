public class Pessoafisica extends Pessoa {
    private String cpf;

    public Pessoafisica(String n, int i, String cpf){
        super(n, i);
        this.cpf=cpf;
    }

    public String getcpf(){
        return this.cpf;
    }

    public String getNome(){
        return super.getNome();
    }

    public int getIdade(){
        return super.getIdade();
    }

    public void setcpf(String cpf){
        this.cpf=cpf;
    }

    public void setNome(String nome){
        super.setNome(nome);
    }

    public void setIdade(int idade){
        super.setIdade(idade);
    }








    
}
