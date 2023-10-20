package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Compacto compacto1 = new Compacto(new Vehiculo("CP0100010122", "Ford", 2023, 125345.22), 4, 2);
        Compacto compacto2 = new Compacto(new Vehiculo("CP1000145555", "Nissan", 2010, 54500.33), 6, 4);
        Camioneta camioneta1 = new Camioneta(new Vehiculo("CA104014544", "Dina", 2008, 234567.15), 450.0, 4);
        Camioneta camioneta2 = new Camioneta(new Vehiculo("CA774814599", "Hongyan", 2023, 934577.98), 1200.0, 6);

        System.out.println(compacto2);
        System.out.println(compacto1);
        System.out.println(camioneta1);
        System.out.println(camioneta2);

        System.out.println("\nCalculando el total de precio de todos los vehículos ...\n");
        System.out.println("Vehículo 1: $" + compacto1.getPrecio());
        System.out.println("Vehículo 2: $" + compacto2.getPrecio());
        System.out.println("Vehículo 3: $" + camioneta1.getPrecio());
        System.out.println("Vehículo 4: $" + camioneta2.getPrecio());
        double total = camioneta1.getPrecio() + camioneta2.getPrecio() + compacto1.getPrecio() + compacto2.getPrecio();
        System.out.println("\nTotal: $" + total);

    }
}