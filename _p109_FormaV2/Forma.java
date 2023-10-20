package _p109_FormaV2;

public abstract class Forma {
    private String Color;
    private Boolean Relleno;

    public Forma(){}
    public Forma(String color, boolean relleno){
        Color = color; Relleno = relleno;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public boolean isRelleno(){
        return Relleno;
    }
    public void setRelleno(Boolean relleno) {
        Relleno = relleno;
    }
    public abstract double getArea();
    public abstract double getPerimetro();
    public String toString(){
        return "[Color=" + Color + "Relleno= " + Relleno + "]";
    }
}
