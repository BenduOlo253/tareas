//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule el precio de una pizza, dadas ciertas reglas del restaurante.

import java.util.Scanner;
public class _p36_CompraPizza {
    public static void main(String[] args) {
        //Declaramos variables.
        double descuento, precio;
        
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtencion de datos.
        System.out.println("Con este programa puedes ordenar una pizza.\nPresone ENTER para continuar.");
        DatoIng.nextLine();
        System.out.println("1.-Pizza grande -- $20\n\n2.-Pizza mediana -- $10\n\n3.-Pizza chica -- $5\n"); int op = DatoIng.nextInt();

        if(op>3 || op<1){
            //En caso de que la opcion no exista, se mostrara un mensaje de error.
            System.out.println("La opcion que usted ha ingresado es invalida.");
        }
        else{
            System.out.println("Digite la cantidad: "); int can = DatoIng.nextInt();

            if(can<1){
                System.out.println("Usted no puede pedir una cantidad menor a una unidad.");
            }
            else{
                //Calculamos el precio final.
                switch (op) {
                    case 1:
                        if((20*can)>=2000){ 
                            System.out.println("Gracias por su compra, ya que su compra ha sido mayor de $2000, obtiene un descuento del 15%\n");
                            descuento = (20*can)*0.15;
                            precio = (20*can) - descuento;
                            System.out.printf("\nCantidad a pagar: $%.2f", precio);
                        }
                        else{
                            precio = (20*can);
                            System.out.printf("Cantidad a pagar: $%.2f", precio);
                        }
                        break;

                    case 2:
                        if((10*can)>=2000){ 
                            System.out.println("Gracias por su compra, ya que su compra ha sido mayor de $2000, obtiene un descuento del 15%\n");
                            descuento = (10*can)*0.15;
                            precio = (10*can) - descuento;
                            System.out.printf("\nCantidad a pagar: $%.2f", precio);
                        }
                        else{
                            precio = (10*can);
                            System.out.printf("Cantidad a pagar: $%.2f", precio);
                        }
                        break;

                    case 3:
                        if((5*can)>=2000){ 
                            System.out.println("Gracias por su compra, ya que su compra ha sido mayor de $2000, obtiene un descuento del 15%\n");
                            descuento = (5*can)*0.15;
                            precio = (5*can) - descuento;
                            System.out.printf("\nCantidad a pagar: $%.2f", precio);
                        }
                        else{
                            precio = (5*can);
                            System.out.printf("Cantidad a pagar: $%.2f", precio);
                        }
                        break;
                }
            }
        }
        System.out.println("\n\nProceso terminado...");
        DatoIng.close(); 
    }
}