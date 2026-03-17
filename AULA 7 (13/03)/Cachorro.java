public class Cachorro {
    private String nome;
    private String raca;

    //construtor
    Cachorro(String nome, String raca){
        this.nome=nome;
        this.raca=raca;
    }

    //getters e setters
    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setRaca(String raca){
        this.raca=raca;
    }

    //metodos
    public void latir(){
        System.out.println("Au au");
    }

    public void dormir(){
        System.out.println("Zzzzzz");
    }

    public void comer(){
        System.out.println("Nham nham");
    }
}
