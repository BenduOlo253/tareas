import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class _p133_Archivos2 {
    public static void main(String[] args) {
        String[] nombres = { "Juan", "Pedro", "Luis", "Jose", "Reynaldo", "Maria", "Teresa", "Rocio" };
        File arch = new File("nombres.txt");
        if(arch.exists()){
            System.out.println("El archivo ya existe !");
            arch.delete();
        }
        else {
            try {
                BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch));
                for (String nombre : nombres){fnombres.write(nombre+"\n");}
                System.out.println("Los datos se han escrito correctamente en el archivo\n" + arch.getName());
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo.." + e);
            }
        }
        System.out.println("Longitud final el archivo escrito " + arch.length() + " bytes.");
    }
}