public static void main(String[] args) {
    Retangulo r1 = new Retangulo();
    Retangulo r2 = new Retangulo();

    r1.base=2.14;
    r1.altura=6.788;

    r2.base=13;
    r2.altura=56;
    System.out.println("O cálculo da área do retângulo 1 é: "+ r1.calcularArea());
    System.out.println("O cálculo da área do retângulo 2 é: "+r2.calcularArea());
}