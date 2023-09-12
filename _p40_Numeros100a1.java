//Alumno: Jose Manuel Roberto Badillo.
//Descricpcion: Crear un programa que imprima los numeros del 100 al 1 usando ciclo while.

public class _p40_Numeros100a1 {
    public static void main(String[] args) {
        //Declaramos variables.
        int c = 100;

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Declaramos las instancias a seguir por el ciclo while.
        while( c >= 1 ) {
            //Se imprime lo siguiente hasta cumplir la sentencia.
            System.out.print(c+" ");
            c-=1;
        }
        System.out.println("\nProceso terminado ...");
    }
}