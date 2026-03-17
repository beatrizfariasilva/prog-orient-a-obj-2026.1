public class CachorroAdestrado extends Cachorro {
    CachorroAdestrado(String nome, String raca){
        super(nome, raca);
    }

    public String getNome(){
        return super.getNome();
    }

    public String getRaca(){
        return super.getRaca();
    }

    public void setNome(String nome){
        super.setNome(nome);
    }

    public void setRaca(String raca){
        super.setRaca(raca);
    }

    public void deitar(){
        System.out.println("Deitei");
    }

    public void rolar(){
        System.out.println("Rolei");
    }

    public void fingirMorte(){
        System.out.println("Morri");
    }



    
}
