public class Quadrado{
    double lado;

    //método construtor
    Quadrado(double lado){
        this.lado = lado;
    }

    //sobrecarga de construtor
    Quadrado(){
        this.lado=0;
    }


    double perimetro(){
        return (2*(lado+lado));
    }

    double area(){
        return (this.lado*this.lado);
    }

    void desenho(){
       for (int i=0; i<this.lado; i++){
            for (int j=0; j<this.lado; j++){
                System.out.print("*");
            }
            System.out.println();
        }         
    }
};