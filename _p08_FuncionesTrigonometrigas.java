//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Dado un ángulo en radianes calcular y mostrar: seno, coseno, tangente.

import java.util.Scanner;
public class _p08_FuncionesTrigonometrigas {
    public static void main(String[] args) {
        //Se limpia la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtencion de datos.
        System.out.print("Dame un angulo en Grados: ");
        double angulog = new Scanner(System.in).nextDouble();

        //Calculos.
        double angulor = Math.toRadians(angulog);
        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);
        
        //Mostramos resultados en pantalla.
        System.out.printf("El angulo es: %.2f, Seno: %.2f, Coseno: %.2f, Tangente:%.2f",angulor,sen,cos,tan);
    }
}