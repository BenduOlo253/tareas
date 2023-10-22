package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Creamos una tienda.
        Tienda tienda = new Tienda("La Bodeguita", "Av. Luis Moya 345", "Carlos Castañeda");

        //Creamos los clientes.
        Cliente cliente1 = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com"); tienda.agregarCliente(cliente1);
        Cliente cliente2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com"); tienda.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@gmail.com"); tienda.agregarCliente(cliente3);
        Cliente cliente4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx"); tienda.agregarCliente(cliente4);

        //Probamos la tienda sin ventas.
        System.out.println("Reporte de la tienda sin ventas...\n\n");
        System.out.println(tienda.toString()+"\n");
        tienda.reporte();

        //Agregamos las ventas a la tienda.
        cliente1.AgregarVenta(new VentaCredito(3, 10.0, 1170.55, 2, "Pala"));
        cliente1.AgregarVenta(new VentaContado(60.50, 10, "Martillo", 10.0, "Sacabrocados"));
        cliente2.AgregarVenta(new VentaCredito(2, 20.0, 160.34, 2.5, "Clavo"));
        cliente2.AgregarVenta(new VentaCredito(6, 20.0, 71.34, 5.0, "Cinta de aislar"));
        cliente2.AgregarVenta(new VentaContado(650.33, 10.0, "Pinzas", 20.0, "Taladro"));
        cliente3.AgregarVenta(new VentaContado(65.0, 50.0, "Thiner", 10.0, "Aerosol"));

        //Probamos la tienda.
        System.out.println("\n\nReporte de la tienda con ventas...\n\n");
        System.out.println(tienda.toString()+"\n");
        System.out.println(tienda.toString());
        tienda.reporte();
    }
}