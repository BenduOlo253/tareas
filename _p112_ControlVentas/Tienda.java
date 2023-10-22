package _p112_ControlVentas;

import java.util.ArrayList;
public class Tienda {
    private String Nombre, Domicilio, Propietario;
    private ArrayList<Cliente> Clientes;


    public Tienda(){
        Clientes = new ArrayList<>();
    }
    public Tienda(String nombre, String domicilio, String propietario){
        this(); Nombre = nombre; Domicilio = domicilio; Propietario = propietario; 
    }
    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }    
    public void reporte() {
        for (Cliente cliente : Clientes) {
            System.out.println("Cliente >> " + cliente);
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
        return String.format("[Tienda %s, Propietaro: %s, Direccion: %s, Clientes: %d, Total de ventas: %.2f]", Nombre, Propietario, Domicilio, Clientes.size(), getTotal());
    }
}
