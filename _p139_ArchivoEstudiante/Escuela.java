package _p139_ArchivoEstudiante;

import java.util.ArrayList;

public class Escuela {
    private String Nombre;
    private ArrayList<Estudiante> Estudiantes;

    Escuela(){Estudiantes = new ArrayList<>();}
    Escuela(String nombre){this(); Nombre = nombre;}


    public void AgregarEstudiante(Estudiante estudiante){
        Estudiantes.add(estudiante);
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }
    public String getNombre() {
        return Nombre;
    }
    public double calcularPromedio(){
        double promedio = 0;
        for(Estudiante estudiante : Estudiantes){promedio += estudiante.getPromedio();}
        promedio /= Estudiantes.size();
        return promedio;
    }
    public double calcularEdad(){
        double promedio = 0;
        for(Estudiante estudiante : Estudiantes){promedio += estudiante.getEdad();}
        promedio /= Estudiantes.size();
        return promedio;
    }
    public int Mujeres(){
        int cant = 0;
        for(Estudiante estudiante : Estudiantes){
            if(estudiante.getSexo() == 'M'){cant++;}
        }
        return cant;
    }
    public int Hombres(){
        int cant = 0;
        for(Estudiante estduante : Estudiantes){
            if(estduante.getSexo() == 'H'){cant++;}
        }
        return cant;
    }
    public String reporte(){
        String reporte = "";
        for(Estudiante estudiante : Estudiantes){
            reporte += (estudiante.toString() + "\n");
        }
        return reporte;
    }
    public String toString() {
        return String.format("Escuela>>>> [Nombre: %s]", Nombre);
    }
}
