package _p139_ArchivoEstudiante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void GrabarArchivo(String archivo, Escuela escuela) throws IOException{
        BufferedWriter farchivo = new BufferedWriter(new FileWriter(new File(archivo)));
        farchivo.write(escuela.getNombre() + "\n"+ escuela.reporte());
        farchivo.write(String.format("\nEl promedio total de los estudiantes de la escuela es: %.2f", escuela.calcularPromedio()));
        farchivo.write("\n\nLa cantidad de mujeres son: " + escuela.Mujeres() + "\nLa cantidad de hombres son: " + escuela.Hombres());
        farchivo.write(String.format("\n\nEl promedio de edades en la escuela es: %.2f", escuela.calcularEdad()));
        farchivo.close();
    }
    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while((dato=fdatos.readLine())!=null)
            datos.add(dato);
            fdatos.close();
        return datos;
    }
    public static void main(String[] args) throws ErrorDato, IOException{
        String Nombre;
        char Sexo, res;
        float Promedio;
        int Edad;
        Scanner DatoIng = new Scanner(System.in);
        File Estudiantes = new File("Estudiantes.txt");
        String archivo = Estudiantes.getName();

        do{
            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.println("Este programa agrega estudiantes con sus datos.\n");
            Escuela escuela = new Escuela("Universidad Autonoma de Zacatecas");
            do{
                try{
                    System.out.println("¿Desea ingresar un nuevo estudiante?(S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));
                    if(res !='S')break; DatoIng.nextLine();
                    System.out.println("Ingrese el nombre del estudiante: "); Nombre = DatoIng.nextLine();
                    System.out.println("Ingrese el sexo del estudiante(H/M): "); Sexo = Character.toUpperCase(DatoIng.next().charAt(0));
                    if(Sexo != 'H' && Sexo != 'M'){throw new ErrorDato("Unicamente puede ingresar 'H' para hombre y 'M' para mujer.");}
                    System.out.println("Ingrese el promedio del estudiante: "); Promedio = DatoIng.nextFloat();
                    if(Promedio>10){throw new ErrorDato("EL promedio del estudiante no puede ser mayor a 10.0");}
                    System.out.println("Ingrese la edad del estudiante: "); Edad = DatoIng.nextInt();
                    escuela.AgregarEstudiante(new Estudiante(Nombre, Sexo, Promedio, Edad));
                }
                catch(ErrorDato e){
                    System.out.println(e.getMessage());
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }

                DatoIng.nextLine();
            }while(true);                
            GrabarArchivo(archivo, escuela);
            System.out.println("\n\n");
            for(String i : leerArchivo(archivo)){System.out.println(i);}
            System.out.println("\n\n");
            System.out.println("¿Desea reiniciar el programa? (S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));
            DatoIng.nextLine();
        }while(res != 'N');
        System.out.println("\n\n\nGacias por usar nuestro programa!!!");
        DatoIng.close();
    }
}