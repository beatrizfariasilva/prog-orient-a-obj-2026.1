import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner (System.in);

    public static void Impressao(Cachorro cao){
        System.out.println("FICHA INFORMACIONAL-----------------");
        System.out.println("Nome do Cachorro: " +cao.getNome());
        System.out.println("Raça do Cachorro: " +cao.getRaca());

        System.out.println("\n\nHABILIDADES-----------------");
        if (cao instanceof CachorroAdestrado){
            System.out.println("Latir!\n");
            cao.latir();

            System.out.println("Dormir!\n");
            cao.dormir();

            System.out.println("Comer!\n");
            cao.comer();

            System.out.println("Deitar!\n");
            ((CachorroAdestrado)cao).deitar();

            System.out.println("Rolar!\n");
            ((CachorroAdestrado)cao).rolar();

            System.out.println("Fingir Morte!\n");
            ((CachorroAdestrado)cao).fingirMorte();
        } else {
            System.out.println("Esse aqui só faz o básico: Comer, dormir e latir.");
        }

    }



    public static void main(String[] args) {
        System.out.println("Bem vindos à Pets. Irei iniciar o seu atendimento. Seu cachorro é adestrado? (Y or N)\n");
        String resposta = input.nextLine();

        System.out.println("Digite o nome do cachorrinho");
        String nome=input.nextLine();
        System.out.println("Digite a raça do cachorrinho");
        String raca=input.nextLine();

        if (resposta=="Y"){
            CachorroAdestrado adestrado=new CachorroAdestrado(nome, raca);
            Impressao(adestrado);
        } else {
            Cachorro nAdestrado=new Cachorro(nome, raca);
            Impressao(nAdestrado);
        }


    }
}
