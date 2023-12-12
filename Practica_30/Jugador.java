package Practica_30;

import java.io.Serializable;

public class Jugador implements Serializable{
    private String Nombre;
    private int Edad;
    private String Sexo;
    private String EstadoCivil;
    private String Descripcion;
    private double Salario;
    
    public Jugador() {
    }
    public Jugador(String nombre, int edad, String estadoCivil, String descripcion, double salario ,String sexo) {
        Nombre = nombre; Edad = edad; EstadoCivil = estadoCivil; Descripcion = descripcion; Salario = salario; Sexo = sexo;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getEstadoCivil() {
        return EstadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
