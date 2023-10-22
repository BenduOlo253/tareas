package _p112_ControlVentas;

public abstract class Venta {
    protected String Articulo; double Total, Precio, Cantidad;

    public Venta(double precio, double cantidad, double total, String articulo){
        Articulo = articulo; Total = total; Precio= precio; Cantidad = cantidad;
    }
    public abstract double getTotalVenta();

}