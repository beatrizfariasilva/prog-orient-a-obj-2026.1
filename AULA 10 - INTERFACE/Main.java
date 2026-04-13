public class Main {
    public static void main(String[] args) {
        Quadrados q1 = new Quadrados(12.54);
        Circulo c1 = new Circulo(12.54);

        System.out.println("ÁREAS");
        System.out.println(q1.area());
        System.out.println(c1.area());

        System.out.println();

        System.out.println("COMPRIMENTOS");
        System.out.println(q1.comprimento());
        System.out.println(c1.comprimento());


    }
}
