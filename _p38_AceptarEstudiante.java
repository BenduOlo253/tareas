//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un sistema de admisión estudiantil que admita a solo participantes que cumplan con ciertos requisitos.

import java.util.Scanner;
public class _p38_AceptarEstudiante {
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos datos.
        System.out.println("Este programa decide si admitir a un alumno de acuerdo a ciertos requisitos.\nPresione ENTER para continuar."); DatoIng.nextLine();
        System.out.println("¿Cuál es su sexo? (h para hombre, m para mujer).\n"); char Sex = Character.toUpperCase(DatoIng.next().charAt(0));

        //Verificamos el sexo.
        if(Sex=='H') System.out.println("Lo sentimos pero la Universidad Kitty Kat SA solo acepta a mujeres.");
        else{
            DatoIng.nextLine();
            System.out.println("Digite su nombre: "); String Nom = DatoIng.nextLine();

            System.out.println("Digite su edad: "); int edad = DatoIng.nextInt();

            //Verificamos la edad.
            if(!(edad>21)) System.out.println("Lo sentimos pero la Universidad Kitty Kat SA solo acepta a mujeres mayores de 21 años.");
            else{
                DatoIng.nextLine();
                System.out.println("A continuación va a ingresar tres calificiónes.\nPresione ENTER para continuar."); DatoIng.nextLine();
                System.out.println("\nIngrese la primera calificación: "); double Cal1 = DatoIng.nextDouble();
                System.out.println("Ingrese la segunda calificación: "); double Cal2 = DatoIng.nextDouble();
                System.out.println("Ingrese la tercera calificación: "); double Cal3 = DatoIng.nextDouble();
                
                //Calculamos promedio.
                double prom = (Cal1 + Cal2 + Cal3)/3;

                //Verificamos promedio.
                if(!(prom>=8 && prom<=9.5)) System.out.println("Lo sentimos pero la Universidad Kitty Kat SA solo acepta a mujeres con un promedio entre 9.5 y 8.");
                else{
                    System.out.printf("FELICIDADES %s, oficialmente usted es parte de la Universidad Kitty Kat SA. \nMucho éxito!!!", Nom);
                }
            }
        }
        DatoIng.close();
        System.out.println("\n\nProceso terminado...");
    }
}