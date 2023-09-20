//Alumno: Jose Manuel Roberto Badillo.
//Descripcioón: Este programa obteiene la suma y el promedio de numCal calificaciones.

import java.util.Scanner;
public class _p56_SumaPromedio {
    public static void main(String[] args) {
        //Declaramos variables.
        float suma;
        char resp;

        //Creamos una entrdada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la ventana de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Agregamos valor a las variables.
            suma=0;

            //Obtenemos datos.
            System.out.println("Este programa imprime la suma y el promedio de n calificaciones: \n");
            System.out.print("Ingrese el numero de calificaciones:  "); int numCal = DatoIng.nextInt();

            //Establecemos el proceso a seguir.
            for(int i=1; i<=numCal; i++) {
                System.out.printf("Ingrese la calificacion: ",i);
                float cal=DatoIng.nextFloat();
                suma+=cal;
            }

            //Se calcula el promedio.
            float prom=suma/numCal;

            //Damos a conocer los resultados.
            System.out.printf("\nSuma es %.2f y el promedio es %.2f\n\n",suma,prom);

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.print("Deseas continuar (S/N) ? ");
            resp = Character.toUpperCase(DatoIng.next().charAt(0));

        } while( resp != 'N');

        System.out.println("\nProceso Terminado ...");
        DatoIng.close();
    }
}