public class Triangulo {
    double lado1;
    double lado2;
    double lado3;


    Triangulo(double equilatero){
        this.lado1=equilatero;
        this.lado2=equilatero;
        this.lado3=equilatero;
    }

    Triangulo(double isosceles, double diferente){
        this.lado1=isosceles;
        this.lado2=isosceles;
        this.lado3=diferente;
    }

    Triangulo(double escaleno, double diferente1, double diferente2){
        this.lado1=escaleno;
        this.lado2=diferente1;
        this.lado2=diferente2;
    }

    double perimetro(){
        return (lado1+lado2+lado3);
    }

    void qualE(){
        if (lado1==lado2 && lado2==lado3){
            System.out.println("Esse triangulo é equilátero");
        }

        else if (lado1!=lado2 && lado2!=lado3){
            System.out.println("Esse triangulo é escaleno");
        }

        else{
            System.out.println("Esse triangulo é isosceles");
        }
    }

    void mostrar(){
        System.out.printf("Lados: %f, %f, %f\n", lado1, lado2, lado3);
        System.out.print("Tipo: ");
        qualE();
        System.out.println("Perímetro: "+perimetro());
        System.out.println();
    }



};
