package _p139_ArchivoEstudiante;


public class Estudiante{
    private String Nombre;
    private char Sexo;
    private float Promedio;
    private int Edad;

    public Estudiante(String nombre, char sexo, float promedio, int edad){
        Nombre = nombre; Sexo = sexo; Promedio = promedio; Edad = edad;
    }
    public float getPromedio() {
        return Promedio;
    }
    public char getSexo() {
        return Sexo;
    }
    public int getEdad() {
        return Edad;
    }
    public String toString(){
        return String.format("Estudiante>>> [Nombre: %s, Sexo: %c, Promedio: %.2f, Edad: %d]", Nombre, Sexo, Promedio, Edad);
    }
}
