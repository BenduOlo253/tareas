//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule el promedio de tres calificaciones ingresadas por el usuario.

import java.util.Scanner;
public class _p06_PromedioCalificaciones {
    public static void main(String[] args) {

        //Declaramos variables.
        int Cal1, Cal2, Cal3;
        float prom;

        //Se crea la entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obetenemos datos.
        System.out.println("Este programa calcula el promedio de tres calificaciones de un alumno.\nPresione ENTER para continuar");
        DatoIng.nextLine();
        System.out.print("Digite la primera calificación: "); Cal1 = DatoIng.nextInt();
        System.out.print("Digite la segunda calificación: "); Cal2 = DatoIng.nextInt();
        System.out.print("Digite la tercera calificación: "); Cal3 = DatoIng.nextInt();
        
        //Calculamos el promedio.
        prom = (Cal1 + Cal2 + Cal3)/3;

        //Damos a conocer los resultados.
        System.out.printf("El promedio de las calificaciónes es: %.1f", prom);
        if (prom >6){
            System.out.println("\nFelicidades has aprobado.");
        }
        else{
            System.out.println("\nDeberias esforzarte mas, has reprobado.");
        }
        DatoIng.close();
    }
}
