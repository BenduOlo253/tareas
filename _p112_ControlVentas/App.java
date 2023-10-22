package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("xd", "av.Seerbauyd", "jmanueln@gmail.com", "Azazel");
        Cliente cliente1 = new Cliente("Jose Manuel", "Vergel #4", "jmanuelrb1@outlook.com"); tienda.agregarCliente(cliente1);
        Cliente cliente2 = new Cliente("Antonio Martinez", "Rio Bravo 108", "Azazel@gmail.com"); tienda.agregarCliente(cliente2);
        cliente1.AgregarVenta(new VentaCredito(6, 20, 71.34, 5, "Cinta de Aislar"));
        tienda.reporte();
    }
}
