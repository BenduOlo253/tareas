package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int Partidos, Goles;

    public JugadorActivo(String nombre, String descripcion, char sexo, double salario, int partidos, int goles){
        super(nombre, descripcion, sexo, salario); Partidos = partidos; Goles = goles;
    }

    @Override
    public double getBono(){
       double bono = ( this.getBono()*0.10) + (Partidos*50) + (Goles*5);
       return bono;
    }
    @Override
    public String toString(){
        return String.format("- JugadorActivo [Jugador %s , Partidos= %d, Goles= %d, Bono= %.2f, Total= %.2f]", super.toString(), Partidos, Goles, getBono(), (this.getSalario() + this.getBono()));
    }
}
