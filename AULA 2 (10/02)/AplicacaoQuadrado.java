import java.util.Scanner;

public class AplicacaoQuadrado {
    public static Scanner input=new Scanner (System.in);

    //essa função também poderia estar dentro da classe
    public static void desenho(double lado){
        for (int i=0; i<lado; i++){
            for (int j=0; j<lado; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Quadrado q = new Quadrado();

        System.out.println("Digite o lado do quadrado: ");
        double l = input.nextDouble();

        q.lado=l;

        System.out.println("A área do quadrado de lado informado é: "+ q.area());
        System.out.println("O comprimento do quadrado de lado informado é: "+ q.perimetro());
        System.out.println("O lado do quadrado informado é: "+ q.lado); 
        System.out.println("Segue o desenho do quadrado de lado informado abaixo: ");       
        desenho(q.lado);

        //ouuuuu ao invés de uma função na main poderiamos fazer
        System.out.println();
        System.out.println();
        System.out.println("Segue o desenho do quadrado de lado informado abaixo: ");
        q.desenho();
    }
}
