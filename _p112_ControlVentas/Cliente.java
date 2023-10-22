package _p112_ControlVentas;

import java.util.ArrayList;
public class Cliente {
    private String Nombre, Domiclio, Correo;
    protected ArrayList<Venta> Ventas;
    
    public Cliente(){
        Ventas= new ArrayList<>();
    }
    public Cliente(String nombre, String domicilio, String correo){
        this(); Nombre = nombre; Domiclio = domicilio; Correo = correo;
    }
    public void AgregarVenta(Venta venta){
        Ventas.add(venta);
    }
    public ArrayList<Venta> getVentas() {
        return Ventas;
    }
    public void setVentas(Venta ventas) {
        Ventas.add(ventas);
    }
    public double getTotal(){
        double Total = 0;
        for(Venta venta : Ventas){Total += venta.getTotalVenta();}
        return Total;
    }
    public String toString(){
        return String.format("[ Nombre= %s, Domicilio= %s, Correo= %s, Ventas= %d, Total= $%.2f]", Nombre, Domiclio, Correo, this.Ventas.size(), this.getTotal());
    } 
}
