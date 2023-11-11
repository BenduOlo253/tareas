    //Alumno: Jose Manuel Roberto Badillo.
    //Descripcion: Crear un programa que escrba en un archivo de texto una serie de caracteres y suelte un mensaje cuando termine de escribir en el archivo.
    
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class _p137_ArchivoMunicipios {
    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while((dato=fdatos.readLine())!=null)
            datos.add(dato);
            fdatos.close();
        return datos;
    }
     public static void main(String[] args) {
            //Declaramos las variables a utilizar.
            boolean condicion = true;
            //Creamos la lista de nombres.
        String[] nombres = {"Futbol", "Beisbol", "Ciclismo", "Atletismo", "Natacion", "Motociclismo"};
            //Creamos el archivo
        File municipios = new File("Municipio.txt");
        String archivo = municipios.getName();
        do{
            if(municipios.exists()){municipios.delete();}
            else condicion = false;
        }while(condicion);

            //Estribimos los nombres en el archivo.
        try {
            BufferedWriter fmunicipios = new BufferedWriter(new FileWriter(municipios));
            for(String i : nombres){fmunicipios.write(i + "\n");}
            fmunicipios.close();
            System.out.println("Se ha terminado de editar el archivo.\n");
            System.out.println("Datos capturados: "); leerArchivo(archivo).forEach(n -> System.out.println(n));

        } catch (Exception e) {
            System.out.println("ERROR 404 \nEl archivo no se logro leerse.");
        }
        finally{System.out.println("\n\n\nGracias por usar nuestro programa!!!!");}
     }
}
