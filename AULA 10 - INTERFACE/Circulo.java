public class Circulo implements FormaGeometrica {
    private double raio;
    final double pi=3.1415;

    Circulo(double r){
        this.raio=r;
    }
    
    @Override
    public double area(){
        return (pi*this.raio*this.raio);
    }

    @Override
    public double comprimento(){
        return (2*pi*this.raio);
    }


}
