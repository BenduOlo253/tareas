//Alumno: Jose Manuel Roberto Badillo.
//Decripcion: Crear un programa que haga la conversion de pulgadas a cm y viseversa usando funciones.

import java.util.Scanner;
public class _p77_MedidasLongitud {

    // Función que convierte pulgadas a centímetros
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    // Función que convierte metros a pies
    public static double metrosAPies(double metros) {
        return metros * 3.28084;
    }

    // Función que muestra un menú con las opciones de conversión
    public static void mostrarMenu() {
        System.out.println("Elige una opción:");
        System.out.println("1. Convertir pulgadas a centímetros");
        System.out.println("2. Convertir metros a pies");
        System.out.println("3. Salir");
    }

    public static void main(String[] args) {
        //Declaramos las variables.
        int opcion = 0;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();
            
            mostrarMenu();
            opcion = DatoIng.nextInt();

            //Obtencion de datos.
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el número de pulgadas:");
                    double pulgadas = DatoIng.nextDouble();
                    double centimetros = pulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas son " + centimetros + " centímetros");
                    break;
                case 2:
                    System.out.println("Introduce el número de metros:");
                    double metros = DatoIng.nextDouble();
                    double pies = metrosAPies(metros);
                    System.out.println(metros + " metros son " + pies + " pies");
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
        System.out.println("\n\nGracias por usar nuestro programa.");
        DatoIng.close();
    }
}
