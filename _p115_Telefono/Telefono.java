package _p115_Telefono;

public class Telefono implements Gps, Radio, Conecta {
    @Override
    public void wifi(){
        System.out.println("Conectando al wifi...");
    }
    @Override
    public void bluetoth(){
        System.out.println("Conectando bluetoth...");
    }
    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas ...");
    }
    @Override
    public void detenerRadio() {
        System.out.println("Deteniendo radio ...");
    }
    @Override
    public void iniciarRadio() {
        System.out.println("iniciando radio ...");
    }
}