public class Pessoajuridica extends Pessoa {
    private String cnpj;

    Pessoajuridica(String n, int i, String cnpj){
        super(n, i);
        this.cnpj=cnpj;
    }

    public String getcnpj(){
       return this.cnpj;
    }

    public String getNome(){
        return super.getNome();
    }

    public int getIdade(){
        return super.getIdade();
    }

    public void setcnpj(String entrada){
        this.cnpj=entrada;
    }

    public void setNome(String entrada2){
        super.setNome(entrada2);
    }

    public void setIdade(int entrada3){
        super.setIdade(entrada3);
    }
}
