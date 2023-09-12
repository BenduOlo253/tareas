//Alumno: Jose Manuel Roberto Badillo.
//Deescripcion: Crear un programa que imprima los números del 1 al 100 usando ciclo while.

public class _p39_Numeros1a100 {
    public static void main(String[] args) {
        //Declaramos variables.
        int c = 1;

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Declaramos la instancia para el ciclo while.
        while( c <= 100 ) {
            //Se imprime lo siguiente hasta llegar a la sentencia.
            System.out.print(c+" ");
            c+=1;
        }
        System.out.println("\nProceso terminado ...");
    }
}