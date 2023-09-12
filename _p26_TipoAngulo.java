//Alumno: Jose Manuel Roberto Badillo.
//Crear un programa que dependiendo del angulo ingresadon por el usuario, mostrar el tipo de ángulo.

import java.util.Scanner;
public class _p26_TipoAngulo {
    public static void main(String[] args) {
        //Se limpia la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtenemos datos.
        System.out.println("Este programa indica el tipo del angulo ingresado.\nPresione ENTER para continuar.");
        DatoIng.nextLine();
        System.out.print("Digite un angulo entre 0 y 360: "); int angulo = DatoIng.nextInt();

        //Mostramos resultados al usuario.
        if(angulo<90) System.out.printf("%d° es un ángulo agudo.", angulo);

        if(angulo==90) System.out.printf("%d° es un ángulo recto.", angulo);

        if(angulo>90 && angulo<180) System.out.printf("%d° es un ángulo obtuso.",angulo);

        if(angulo==180) System.out.printf("%d° es un ángulo llano", angulo);

        if(angulo>180 && angulo<360) System.out.printf("%d es un ángulo concavo.", angulo);

        if(angulo==360) System.out.printf("%d° es un angulo completo", angulo);

        System.out.println("\nProceso terminado ....");
        DatoIng.close();
    }
}