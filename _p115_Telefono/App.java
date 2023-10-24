package _p115_Telefono;

public class App {
    public static void main(String[] args) {
        Telefono mitelefono = new Telefono();
        mitelefono.wifi();
        mitelefono.bluetoth();
        mitelefono.obtenerCoordenadas();
        mitelefono.iniciarRadio();
        mitelefono.detenerRadio();
    }
}