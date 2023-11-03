package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Suv vehiculo1 = new Suv("La Mmalona", "Carlos", 6);
        Sedan vehiculo2 = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(vehiculo2.toString());
        vehiculo2.sistemaElectrico();
        vehiculo2.combustionInterna();
        vehiculo2.carroceriaTres();
        vehiculo2.chasisMonocasco();
        vehiculo2.reportar();
        vehiculo2.arrancar();
        vehiculo2.Frenando();

        System.out.println(vehiculo1.toString());
        vehiculo1.sistemaElectrico();
        vehiculo1.combustionInterna();
        vehiculo1.traccion4x4();
        vehiculo1.chasisIndependiente();
        vehiculo1.reportar();
        vehiculo1.arrancar();
        vehiculo1.Frenando();
    }
}
