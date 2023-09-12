//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule el promedio de 5 calificaciones introducidas y dependiendo del resultado arrojar un mensaje.

import java.util.Scanner;
public class _p37_CalculoNotas {
    public static void main(String[] args) {
        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos datos.
        System.out.println("Este programa calcula tu calificación final.\nPresiona ENTER para continuar.\n"); DatoIng.nextLine();
        System.out.println("Ingrese la primera calificación: "); double Cal1 = DatoIng.nextDouble();
        System.out.println("Ingrese la segunda calificación: "); double Cal2 = DatoIng.nextDouble();
        System.out.println("Ingrese la tercera calificación: "); double Cal3 = DatoIng.nextDouble();
        System.out.println("Ingrese la cuarta calificación: "); double Cal4 = DatoIng.nextDouble();
        System.out.println("Ingrese la quinta calificación: "); double Cal5 = DatoIng.nextDouble();

        //Calculamos promedio.
        double prom = (Cal1 + Cal2 + Cal3 + Cal4 + Cal5)/5;

        //Verificamos que las calificaciones no superen los 10 puntos o sean menores que cero puntos.
        if((Cal1>10 || Cal1<0) || (Cal2>10 || Cal2<0) || (Cal3>10 || Cal3<0) || (Cal4>10 || Cal4<0) || (Cal5>10 || Cal5<0)){
            System.out.println("Ninguna de sus calificaciones puede superar los diez puntos o ser menor que cero puntos.");
        }
        else{
            //Damos a conocer los resultados.
            if(prom>9 && prom<=10){
                System.out.printf("Tu calificación es de: %.1f\n\nPerfecto tu esfuerzo valió la pena.", prom);
            }

            if(prom>8 && prom<=9){
                System.out.printf("Tu calificación es de: %.1f\n\nExcelente, sigue así.", prom);
            }

            if(prom>7 && prom<=8){
                System.out.printf("Tu calificación es de: %.1f\n\nMuy Bien, puedes mejorar.", prom);
            }

            if(prom>6 && prom<=7){
                System.out.printf("Tu calificación es de: %.1f\n\nPasas de panzaso.", prom);
            }

            if(prom>=0 && prom<=6){
                System.out.printf("Tu calificación es de: %.1f\n\nQuedas reprobado.", prom);
            }
        }
        System.out.println("\n\nProceso terminado...");
        DatoIng.close();
    }
    
}