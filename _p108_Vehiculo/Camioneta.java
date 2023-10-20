package _p108_Vehiculo;

public class Camioneta extends Vehiculo {
    private double Capacidad;
    private int Ejes;
 
    public Camioneta(){};
    public Camioneta(Vehiculo vehiculo, double capacidad, int ejes){
        super(vehiculo.Serie, vehiculo.Marca, vehiculo.Año, vehiculo.Precio);
        Capacidad = capacidad; Ejes = ejes;
    }

    public double getCapacidad() {
        return Capacidad;
    }
    public void setCapacidad(double capacidad) {
        Capacidad = capacidad;
    }
    public int getEjes() {
        return Ejes;
    }
    public void setEjes(int ejes) {
        Ejes = ejes;
    }
    @Override
    public String toString(){
        return "Compacto    " + super.toString() + "  Capacidad= " + Capacidad + "  Ejes= " + Ejes + "]";
    }
}