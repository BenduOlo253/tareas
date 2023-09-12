//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule la masa, fuerza o asceleracion, según lo elija el usuario.

import java.util.Scanner;
public class _p28_LeyDeNewton {
    public static void main(String[] args) {
        float f, m, a;
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos la opción a elegir.
        System.out.println("Este programa calcula la masa, la asceleracion o la fuerza de un objeto.\n");
        System.out.println("Digite F para calcular la fuerza.\nDigite M para calcular la masa.\nDigite A para calcular la aceleracion.\nElija una opción: ");
        char op = Character.toUpperCase(DatoIng.next().charAt(0));

        //Proseco para obtener la fuerza.
        if (op == 'F') {
            //Obtenemos datos.
            System.out.println("\nCalculando la Fuerza ...");
            System.out.print("Digite la masa del objeto: "); m = DatoIng.nextFloat();
            System.out.print("Digite la aceleracion del objeto: "); a = DatoIng.nextFloat();

            //Calculamos la fuerz.
            f = m * a;

            //Mostramos resultados.
            System.out.printf("\nLa fuerza del ojeto es de : %.2fN", f);

        //Proceso para obtener la masa.
        } else if (op == 'M') {
            //Obtenemos datos.
            System.out.println("\nCalculando la Masa ...");
            System.out.print("Digite la fuerza del objeto: "); f = DatoIng.nextFloat();
            System.out.print("Digite la aceleracion del objeto: "); a = DatoIng.nextFloat();

            //Calculamos la masa.
            m = f / a;

            //Mostramos resultados.
            System.out.printf("\nMasa: %.2f", m);

        //Proceso para obtener la aceleracion.
        } else if (op == 'A') {
            //Obtenemos datos.
            System.out.println("\nCalculando la Aceleracion ...");
            System.out.print("Digite la fuerza del objeto: "); f = DatoIng.nextFloat();
            System.out.print("Digite la masa del objeto: "); m = DatoIng.nextFloat();

            //Calculamos la aceleracion.
            a = f / m;

            //Mostramos resultados.
            System.out.printf("\nAceleración: %.2f", a);
        } else
        //Mostramos un mensaje si la opcion es erronea.
        System.out.println("\nOpcion Invalida \n");
        DatoIng.close();
    }
}