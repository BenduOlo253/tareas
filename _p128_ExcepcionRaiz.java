    //Alumno: Jose Manuel Roberto Badillo.
    //Descripcion: Crear un programa que pida al usuario un numero flotante y usar una excepcion geneeica para capturar cualquier error.

    //Se importan los metodos necesarios.
import java.util.Scanner;
public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
            //Declaramos las variables a utilizar.
        boolean bol = true; char res;

            //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

            //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

            //Pedimos los datos necesarios al usuario.
        System.out.println("Este programa calcula la raiz cuadrada de cualquier numero real positivo.\nPresione ENTER para continuar."); DatoIng.nextLine();

        do{
                //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J"); System.out.flush();



                //Pedimos los datos necesarios al usuario.
            System.out.println("Este programa calcula la raiz cuadrada de cualquier numero real positivo.\nPresione ENTER para continuar."); DatoIng.nextLine();

                //Usamos do-while para repetir el proceso hasta que el usuario ingrese un dato válido.
            do{
                    //Usamos la el metodo try-catch para realizar una exepcion si el dato que ingresa el usuario es erroneo no impida al programa proseguir con normalidad.
                try {
                        //Calculamos la raiz.
                    System.out.println("Ingrese el radicando: "); double radicando = DatoIng.nextDouble();
                    double raiz = Math.sqrt(radicando);
                    bol = false;

                        //Mostramos los resultados.
                    System.out.printf("El resultado de obtener la raiz cuadrada con un radicando de %.2f es: %.2f\n\n", radicando, raiz);

                } catch (Exception e) {
                        //En caso de mostrar un error, podemos elegir hacer un proceso en caso de eso como por ejemplo, mostrar un mensaje de error.
                    System.out.println("\nEl dato que usted ingreso es erroneo, porfavor verifique que sea un numero real positivo. Presione <ENTER> para continuar.\n"); 
                    DatoIng.nextLine(); DatoIng.nextLine();
                }
            }while(bol == true);

                //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("Desea reiniciar el programa? (S|N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while ( res != 'N');
        System.out.println("Gracias por usar nuestro programa!!!"); DatoIng.close();
    }
}
