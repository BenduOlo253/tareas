package _p99_Rectangulo;

public class Rectangulo {
    public float Largo, Ancho;

    public Rectangulo(){};
    public Rectangulo(float largo, float ancho){
        this.Ancho = ancho; this.Largo = largo;
    }

    public float getLargo() {
        return Largo;
    }
    public void setLargo(float largo) {
        Largo = largo;
    }
    public float getAncho() {
        return Ancho;
    }
    public void setAncho(float ancho) {
        Ancho = ancho;
    }
    public float getArea(){
        float Area = Ancho*Largo;
        return Area;
    }
    public float getPerimetro(){
        float Perimetro = (Ancho*2) + (Largo*2);
        return Perimetro;
    }
    public String toString(){
        return String.format("Rectangulo [Largo=%.1f, Ancho=%.1f]", Largo, Ancho);
    }
    
}
