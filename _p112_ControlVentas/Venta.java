package _p112_ControlVentas;

public abstract class Venta {
    protected String Articulo; double Total, Precio; int Cantidad;

    public Venta(double precio, int cantidad, double total, String articulo){
        Articulo = articulo; Total = total; Precio= precio; Cantidad = cantidad;
    } 
    public abstract double getTotalVenta();

}