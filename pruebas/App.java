package pruebas;

public class App {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("La Bodeguita", "Av. Luis Moya 345", "Carlos Castañeda");
        Cliente cliente1 = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com"); tienda.agregarCliente(cliente1);
        Cliente cliente2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com"); tienda.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@gmail.com"); tienda.agregarCliente(cliente3);
        Cliente cliente4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx"); tienda.agregarCliente(cliente4);
        cliente1.AgregarVenta(new VentaCredito(3, 10.0, 1170.55, 2, "Pala"));
        cliente1.AgregarVenta(new VentaContado(160.34, 10, "Martillo", 10.0, "Sacabrocados"));

        System.out.println(tienda.toString());
        tienda.reporte();
    }
}