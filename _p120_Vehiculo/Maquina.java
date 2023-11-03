package _p120_Vehiculo;

public class Maquina {
    protected String Nombre, Propietario;
    protected int Pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros){
    nombre = Nombre; pasajeros = Pasajeros; propietario = Propietario;
    }
    public String toString() {
        return "Maquina [Nombre= " + Nombre + ", Propietario= " + Propietario + ", Pasajeros= " + Pasajeros + "]";
    }
    
    public void reportar(){
        System.out.println("Repostando ...");
    }
    public void arrancar(){
        System.out.println("Arrancando ...");
    }
    public void Frenando(){
        System.out.println("Frenando...");
    }


    
}
