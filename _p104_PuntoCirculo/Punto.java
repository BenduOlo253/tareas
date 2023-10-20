package _p104_PuntoCirculo;

public class Punto {
    private int X, Y;

    public Punto(){};
    public Punto(int x, int y){
        this.X = x; this.Y= y;
    }

    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public double getDistancia(Punto punto){
        Double Distanca = Math.sqrt(Math.pow((punto.X-this.X),2) + Math.pow((punto.Y-this.Y),2));
        return Distanca;
    }
    public String toString(){
        return String.format("Punto [X=%d, Y=%d]", X, Y);
    }
}