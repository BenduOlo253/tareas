//Alumno: Jose Manuel Roberto Badillo.
//Crear un programa que en base a las calificaciones de un alumno y sus respectivas calificaciones, aceptarlo o no.

import java.util.Scanner;
public class _p27_AceptarEstudiante {
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos la edad.
        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");
        System.out.print("Dame tu nombre ? "); String nombre = DatoIng.nextLine();
        System.out.print("Dame la edad ? "); int edad = DatoIng.nextInt();

        //Verificamos la edad.
        if( edad >= 18 ) {
            System.out.println("Eres mayor de edad, continuamos ");

            //Obtenemos la calificacion
            System.out.println("El sistema usa dos calificaciones para determinar el ingreso\nDigita la primera calificacion:"); float Cal1 = DatoIng.nextFloat();
            System.out.println("Digita tu segunda calificacion: "); float Cal2 = DatoIng.nextFloat();

            //Verificamos las calificaciones.
            if( Cal1 >= 8 && Cal2 >= 8)
            System.out.printf("\nBIENVENIDO %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n", nombre, edad, Cal1, Cal2);
            else
            System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");
        }
        else
        System.out.println("Solo aceptamos estudiantes mayores de edad");

        System.out.println("\nProceso terminado ...");
    }
}