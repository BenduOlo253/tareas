package _p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre, Descripcion;
    private char Sexo;
    private double Salario;

    public Jugador(String nombre, String descripcion, char sexo, double salario){
        Nombre = nombre; Descripcion = descripcion; Sexo = sexo; Salario= salario;
    }
    public char getSexo() {
        return Sexo;
    }
    public double getSalario() {
        return Salario;
    }
    public abstract double getBono();

    @Override
    public String toString(){
        return String.format("[Jugador [Nombre= %s, Sexo= %c, Descripcion=, Salario=1000.0]", Nombre, Sexo, Descripcion, Salario);
    }
}
