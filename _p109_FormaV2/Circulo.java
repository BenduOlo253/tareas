package _p109_FormaV2;

public class Circulo extends Forma{
    private double Radio;

    public Circulo(){}
    public Circulo(String color, boolean relleno, double radio){
        super(color, relleno); Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    @Override
    public double getArea(){
        double Area = Math.PI*Math.pow(Radio, 2);
        return Area;
    }
    @Override
    public double getPerimetro(){
        double Perimetro = 2*Math.PI*Radio;
        return Perimetro;
    }
    @Override
    public String toString(){
        return String.format("Circulo [Forma [Color= " + super.getColor() + ", Relleno= " + super.isRelleno() +"], Radio= " + Radio + "]");
    }
}