public class Main {
    public static void main(String[] args) {
        Triangulo equilatero = new Triangulo(3.2);
        Triangulo isosceles = new Triangulo(3.2, 10.56);
        Triangulo escaleno = new Triangulo(3.2, 10.56, 80.9);

        equilatero.perimetro();
        equilatero.qualE();
        equilatero.mostrar();

        isosceles.perimetro();
        isosceles.qualE();
        isosceles.mostrar();

        escaleno.perimetro();
        escaleno.qualE();
        escaleno.mostrar();
    }
}
