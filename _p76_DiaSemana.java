//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Diseña un programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con letra. Deberá validar que el número está en el rango adecuado.

import java.util.Scanner;

public class _p76_DiaSemana {

    // Función que devuelve el día de la semana según el número
    public static String diaDeLaSemana(int numero) {
        String dia = "";
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido";
        }
        return dia;
    }

    public static void main(String[] args) {
        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtencion de datos.
        System.out.println("Introduce un número entre 1 y 7:");
        int numero = DatoIng.nextInt();
        String dia = diaDeLaSemana(numero);
        System.out.println("El día de la semana es: " + dia);
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();

    }
}
