package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados, Proyectos;

    public JugadorEntrenador(String nombre, String descripcion, char sexo, double salario,int subordinados, int proyectos){
        super(nombre, descripcion, sexo, salario); Subordinados= subordinados; Proyectos = proyectos;
    }

    @Override
    public double getBono(){
        
        double total = (this.getSalario()*0.15) + (Proyectos*100) + (Subordinados*10);
        return total;
    }

    @Override
    public String toString(){
        return String.format("- JugadorEntrenador %s Subordinados= %d, Proyectos= %d, Bono= %.2f, Total= %.2f]", super.toString(), Subordinados, Proyectos, getBono(), (this.getSalario() + getBono()));
    }
}
