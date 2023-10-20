package _p109_FormaV2;

public class Rectangulo extends Forma {
    private double Largo, Ancho;

    public Rectangulo(){}
    public Rectangulo(String color, boolean relleno, double largo, double ancho){
        super(color, relleno); Largo = largo; Ancho = ancho;
    }

    public double getAncho() {
        return Ancho;
    }
    public void setAncho(double ancho) {
        Ancho = ancho;
    }
    public double getLargo() {
        return Largo;
    }
    public void setLargo(double largo) {
        Largo = largo;
    }
    
    @Override
    public double getPerimetro(){
        double Perimetro = (2*Ancho)+(2*Largo);
        return Perimetro;
    }
    @Override
    public double getArea(){
        double Area = Ancho*Largo;
        return Area;
    }
    @Override
    public String toString(){
        return "Rectangulo [Forma [Color= " + super.getColor() + ", Relleno= " + super.isRelleno() + "], Largo= " + Largo + "Ancho= " + Ancho + "]";
    }
}
