//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que sume los multiplos de 3 o 4 segun el usuario decida en un rango especifico.

import java.util.Scanner;
public class _p78_SumaMultiplos {

    // Función que recibe tres parámetros: ini, fin y constante
    // Regresa la suma de los números múltiplos de 3 o 4 en el rango [ini, fin]
    public static int sumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) { 
                suma += i; 
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        //Declaramos las variables.
        int ini, fin, constante;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la ventana de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtencion de datos.
        System.out.println("Bienvenido al programa que suma múltiplos de 3 o 4 en un rango");
        System.out.println("Ingrese el valor inicial del rango:");
        ini = DatoIng.nextInt();
        System.out.println("Ingrese el valor final del rango:");
        fin = DatoIng.nextInt();


        if (ini < fin) { 
            System.out.println("Ingrese la constante (3 o 4):");
            constante = DatoIng.nextInt(); // Leer la constante
            if (constante == 3 || constante == 4) { // Validar que la constante es 3 o 4
                int resultado = sumaMultiplos(ini, fin, constante); // Llamar a la función y guardar el resultado
                System.out.println("La suma de los números múltiplos de " + constante + " en el rango [" + ini + ", " + fin + "] es: " + resultado); // Mostrar el resultado
            } else {
                System.out.println("La constante debe ser 3 o 4"); // Mostrar un mensaje de error si la constante no es válida
            }
        } else {
            System.out.println("El valor inicial debe ser menor que el valor final"); // Mostrar un mensaje de error si el rango no es válido
        }
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
}
