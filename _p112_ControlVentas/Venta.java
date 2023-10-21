package _p112_ControlVentas;

public abstract class Venta {
    protected String Articulo; double Total, Precio; int Cantidad;

    public Venta(String articulo, double total, double precio, int cantidad){
        Articulo = articulo; Total = total; Precio= precio; Cantidad = cantidad;
    }

    public String getArticulo() {
        return Articulo;
    }
    public void setArticulo(String articulo) {
        Articulo = articulo;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public double getTotal() {
        return Total;
    }

}
