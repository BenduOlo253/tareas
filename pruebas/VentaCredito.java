package pruebas;

public class VentaCredito extends Venta{
    protected int Meses; protected double Interes;

    public VentaCredito(int meses, double interes, double precio, int cantidad, String articulo){
        super(precio, cantidad, precio, articulo); 
        Meses = meses; Interes = interes;
    }
    public String toString(){
        return String.format("VentaCredito [Venta [Articulo= %s, Cantidad= %d, Precio= %.2f, Total= %.2f], Meses= %d, Interes= %.2f, TotalVenta= %.2f]", Articulo, Cantidad, Precio, (Cantidad*Precio), Meses, Interes, this. getTotalVenta());
    }
    @Override
    public double getTotalVenta(){
        double Interesf= ((Precio*Cantidad)/100.0) * Interes;
        Total = (Precio*Cantidad) + Meses*Interesf;
        return Total;
    }
}