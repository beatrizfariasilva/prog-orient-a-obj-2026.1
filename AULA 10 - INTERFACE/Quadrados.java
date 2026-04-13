public class Quadrados implements FormaGeometrica {
    private double lado;

    Quadrados(double l){
        this.lado=l;
    }

    @Override
    public double area(){
        return (this.lado*this.lado);
    }

    @Override
    public double comprimento(){
        return 2*(this.lado+this.lado);
    }
}
