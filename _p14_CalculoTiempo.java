//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un prigrama que dado un determinado numero de horas, calcular su equivalente en días, minutos y segundos.

import java.util.Scanner;
public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        //Limpiamos pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        // Declaramos variables.
        float days, min, seg, hrs;
        
        //Creamos una entrada de datos.
        Scanner datoIng = new Scanner(System.in);

        //Obtencion de datos.
        System.out.println("Este programa da a conocer la equivalencia en dias, minutos y segundos de una determinada cantidad de horas");
        System.out.println("Digite la cantidad de horas: "); hrs = datoIng.nextFloat();
        
        //Calculamos las equivalencias.
        days = hrs/24;
        min = hrs*60;
        seg = hrs*(60*60);

        //Mostramos los resultados en pantalla.
        System.out.printf("Las equivalencias de %.2f horas son:\nDías: %.2f.\nMinutos: %.2f.\nSegundos: %.2f.", hrs, days, min, seg);
    }
}
