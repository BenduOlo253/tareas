package _p98_Circulo;
import java.lang.Math;
public class Circulo {
    public double Radio;
    
    public Circulo(){};
    public Circulo(double radio){
        this.Radio = radio;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea(){
        double Area = Math.PI*Math.pow(Radio, 2);
        return Area;
    }
    public double getCircunferencia(){
        double Circunferencia = Math.PI*(Radio*2);
        return Circunferencia;
    }
    public String toString(){
        return String.format("[Radio=%.2f]",Radio);
    }
}
