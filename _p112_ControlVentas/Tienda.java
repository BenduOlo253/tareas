package _p112_ControlVentas;

import java.util.ArrayList;
public class Tienda {
    private String Nombre, Domicilio, Correo, Propietario;
    private ArrayList<Cliente> Clientes;


    public Tienda(){
        Clientes = new ArrayList<>();
    }
    public Tienda(String nombre, String domicilio, String correo, String propietario){
        this(); Nombre = nombre; Domicilio = domicilio; Correo = correo; Propietario = propietario; 
    }
    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }    
    public void reporte() {
        for (Cliente cliente : Clientes) {
            System.out.println("> " + cliente);
            for (Venta venta : cliente.getVentas()){System.out.println(venta);}

            if(cliente.getVentas().size()!=0) System.out.println();
        }
    }
    public Double getTotal(){
        double Total = 0;
        for(Cliente cliente : Clientes){
            Total += cliente.getTotal();
        }
        return Total;
    }
    public String toString(){
        return "[Tienda " + Nombre + ", Propietaro: " + Propietario + ", Direccion: " + Domicilio + ", Correo: " + Correo + ", Clientes: " + Clientes.size() + ", Total de ventas: " + getTotal();
    }
}
