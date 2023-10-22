package pruebas;

public class VentaContado extends Venta {
    private double Descuento; private String Regalo;

    public VentaContado(double precio, int cantidad, String articulo, double descuento, String regalo){
        super(precio, cantidad, precio, articulo);
        Descuento = descuento; Regalo = regalo;
    }
    public String toString(){
        return String.format("VentaContado [Venta [Articulo= %s, Cantidad= %d, Precio= %.2f, Total= %.2f], Descuento= %.2f, Regalo= %s, Total= %.2f]", Articulo, Cantidad, Precio, (Cantidad*Precio), Descuento, Regalo, this. getTotalVenta());
    }
    @Override
    public double getTotalVenta(){
        double Descuentof = ((Cantidad*Precio)/100.0)*Descuento;
        Total = (Cantidad*Precio)+Descuentof;
        return Total;
    }
}
