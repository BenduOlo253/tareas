package _p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;

    public Circulo(){};
    public Circulo(Punto centro, double radio){
        this.Centro = centro; this.Radio = radio;
    }

    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea(){
        double Area = Math.PI*(Math.pow(Radio, 2));
        return Area; 
    }
    public double getCircunferencia(){
        double Circunferencia = 2*Math.PI*Radio;
        return Circunferencia;
    }
    public String toString(){
        return String.format("Centro= " + Centro + ", Radio=%.1f", Radio);
    }
}