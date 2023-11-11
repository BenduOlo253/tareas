    //Alumno: Jose Manuel Roberto Badillo.
    //Descripcion: Crear un programa que pida al usuario una serie de materias y que estos datos los capture y los guarde en un archivo.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
    public static Scanner DatoIng = new Scanner(System.in);

    //Definimos las funciones a usar.
    public static void GrabarArchivo(String archivo, ArrayList<String> Materias) throws IOException{
        BufferedWriter farchivo = new BufferedWriter(new FileWriter(new File(archivo)));
        for(String i : Materias){
            farchivo.write(i + "\n");
        }
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
    public static ArrayList<String> leerDatos(ArrayList<String> datos){
        while (true) {
            System.out.println("Introduce tu materia: ");
            String dato = DatoIng.nextLine();
            if(!dato.isEmpty()) datos.add(dato);
            else break;
        }
        return datos;
    }
    public static void main(String[] args) {
        char res;
        ArrayList<String> datos = new ArrayList<>();
        File materias = new File("Materias.txt");
        String archivo = materias.getName();
        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            System.out.println("Este programa captura tus materias a cursar\n\nPorfavor presione <ENTER> en un espacio vacio cuando haya terminado de introducir sus materias.\n");
            try {
                GrabarArchivo(archivo, leerDatos(datos));
                System.out.println("Las materias capturadas fueron:");
                leerArchivo(archivo).forEach(n -> System.out.println(n));
            } catch (Exception e) {
                System.out.println("ERROR 404\nError al leer o escribir el archivo.");
            }

            System.out.println("¿Desea reinicar el programa? (S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("Gracias por usar nuestro programa!!!");
    }
}
