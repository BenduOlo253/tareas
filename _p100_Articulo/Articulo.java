package _p100_Articulo;

public class Articulo {
    private String Id, Desc;
    private int Cant;
    private Double PrecioUnit;

    public Articulo(String id, String desc, int cant, Double preciounit){
        this.Id = id; this.Desc = desc; this.Cant = cant; this.PrecioUnit = preciounit;
    }

    public String getId() {
        return Id;
    }
    public String getDesc() {
        return Desc;
    }
    public int getCant() {
        return Cant;
    }
    public void setCant(int cant) {
        Cant = cant;
    }
    public void setPrecioUnit(double preciounit){
        PrecioUnit = preciounit;
    }
    public Double getPrecioUnit() {
        return PrecioUnit;
    }
    public void getPrecioUnit(double preciounit){

    }
    public Double getTotal(){
        Double total = PrecioUnit*Cant;
        return total;
    }
    public String toString(){
        return String.format("Articulo [Id=%s, Desc=%s, Cant= %d, PrecioUnit=%.2f]", Id, Desc, Cant, PrecioUnit);
    }
}
